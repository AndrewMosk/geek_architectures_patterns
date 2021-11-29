package ru.geekbrains.shop.service;

import org.springframework.stereotype.Service;
import ru.geekbrains.storage.model.Item;
import ru.geekbrains.storage.model.Order;
import ru.geekbrains.storage.model.OrderLine;
import ru.geekbrains.storage.model.User;
import ru.geekbrains.storage.repository.OrderRepository;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CartServiceImplementation implements CartService{

    @Resource
    private OrderRepository orderRepository;

    private List<OrderLine> orderLines;

    private BigDecimal subTotal;

    private User owner;

    public CartServiceImplementation() {
        this.orderLines = new ArrayList<>();
    }

    @Override
    public void addOrderLine(Item item, Integer quantity) {
        orderLines.add(new OrderLine(item, quantity, item.getPrice().multiply(new BigDecimal(quantity))));
        countSubTotal();
    }

    @Override
    public void removeOrderLine(Item item) {
        Optional<OrderLine> foundLine = orderLines.stream().filter(orderLine -> orderLine.getItem().equals(item)).findAny();
        if (foundLine.isPresent()) {
            orderLines.remove(foundLine);
        }
    }

    @Override
    public void updateOrderLine(Item item, Integer quantity) {
        // обновление корзины
    }

    @Override
    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    @Override
    public void countSubTotal() {
        countSum();
    }

    @Override
    public void setOwner(User user) {
        this.owner = user;
    }

    @Override
    public void saveOrder() {
        Order order = new Order();
        order.setOrderLines(orderLines);
        order.setOwner(owner);
        order.setTotalSum(subTotal);

        orderRepository.save(order);
    }

    private void countSum() {
        this.subTotal = orderLines.stream().map(OrderLine::getSum).reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}

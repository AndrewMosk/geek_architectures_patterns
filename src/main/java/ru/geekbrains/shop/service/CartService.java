package ru.geekbrains.shop.service;

import ru.geekbrains.storage.model.Item;
import ru.geekbrains.storage.model.OrderLine;
import ru.geekbrains.storage.model.User;

import java.math.BigDecimal;
import java.util.List;

public interface CartService {

    void addOrderLine(Item item, Integer quantity);

    void removeOrderLine(Item item);

    void updateOrderLine(Item item, Integer quantity);

    List<OrderLine> getOrderLines();

    void countSubTotal();

    void setOwner(User user);

    void saveOrder();
}

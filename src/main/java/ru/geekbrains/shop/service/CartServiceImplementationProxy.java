package ru.geekbrains.shop.service;

import lombok.extern.java.Log;
import ru.geekbrains.storage.model.Item;
import ru.geekbrains.storage.model.OrderLine;
import ru.geekbrains.storage.model.User;

import java.util.List;
import java.util.logging.Level;

@Log
public class CartServiceImplementationProxy implements CartService{

    private final CartService cartService;

    public CartServiceImplementationProxy(CartServiceImplementation cartServiceImplementation) {
        this.cartService = cartServiceImplementation;
    }

    @Override
    public void addOrderLine(Item item, Integer quantity) {
        log.log(Level.INFO, "order line added");
        cartService.addOrderLine(item, quantity);
    }

    @Override
    public void removeOrderLine(Item item) {
        log.log(Level.INFO, "order line removed");
        cartService.removeOrderLine(item);
    }

    @Override
    public void updateOrderLine(Item item, Integer quantity) {
        log.log(Level.INFO, "order line updated");
        cartService.updateOrderLine(item, quantity);
    }

    @Override
    public List<OrderLine> getOrderLines() {
        log.log(Level.INFO, "order lines list requested");
        return cartService.getOrderLines();
    }

    @Override
    public void countSubTotal() {
        log.log(Level.INFO, "sub total counted");
        cartService.countSubTotal();
    }

    @Override
    public void setOwner(User user) {
        log.log(Level.INFO, "owner set");
        cartService.setOwner(user);
    }

    @Override
    public void saveOrder() {
        log.log(Level.INFO, "order saved");
        cartService.saveOrder();
    }
}

package ru.geekbrains.storage.model;

import java.math.BigDecimal;

public class OrderLine {

    private Item item;

    private Integer quantity;

    private BigDecimal sum;

    public OrderLine(Item item, Integer quantity, BigDecimal sum) {
        this.item = item;
        this.quantity = quantity;
        this.sum = sum;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getSum() {
        return sum;
    }

    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }
}

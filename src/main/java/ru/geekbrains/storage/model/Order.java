package ru.geekbrains;

import java.util.HashMap;

public class Order {

    private long code;

    private User owner;

    private HashMap<Item, Integer> items;

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public HashMap<Item, Integer> getItems() {
        return items;
    }

    public void setItems(HashMap<Item, Integer> items) {
        this.items = items;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }
}

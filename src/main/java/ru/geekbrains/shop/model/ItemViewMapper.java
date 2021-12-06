package ru.geekbrains.shop.model;

import ru.geekbrains.storage.model.Item;

public class ItemViewMapper {

    public ItemView map(Item item) {
        return ItemView.builder()
                .setName(item.getName())
                .setPrice(item.getPrice())
                .build();

    }
}

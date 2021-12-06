package ru.geekbrains.shop.controller;

import ru.geekbrains.shop.model.ItemView;
import ru.geekbrains.shop.model.ItemViewMapper;
import ru.geekbrains.shop.service.ItemService;
import ru.geekbrains.shop.service.ItemServiceImplementation;
import ru.geekbrains.storage.model.Item;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class ItemController {

    private final ItemService itemService = new ItemServiceImplementation();

    private final ItemViewMapper mapper = new ItemViewMapper();

    public List<ItemView> getItems(String nameForSearch, BigDecimal minPrice, BigDecimal maxPrice) {
        List<Item> items = itemService.getItems(nameForSearch, minPrice, maxPrice);

        return items.stream().map(mapper::map).collect(Collectors.toList());
    }
}

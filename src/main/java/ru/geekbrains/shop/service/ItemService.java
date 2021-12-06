package ru.geekbrains.shop.service;

import ru.geekbrains.shop.model.ItemView;
import ru.geekbrains.storage.model.Item;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface ItemService {

    Optional<Item> findItemById(Long id);

    List<Item> getItems(String name, BigDecimal minPrice, BigDecimal maxPrice);
}

package ru.geekbrains.shop.service;

import ru.geekbrains.storage.model.Item;
import ru.geekbrains.storage.repository.ItemRepository;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class ItemServiceImplementationCache implements ItemService {

    @Resource
    private ItemRepository itemRepository;

    private final HashMap<Long, Item> cache;

    public ItemServiceImplementationCache() {
        cache = new HashMap<>();
    }

    @Override
    public Optional<Item> findItemById(Long id) {
        if (cache.containsKey(id)) {
            return Optional.ofNullable(cache.get(id));
        }
        Optional<Item> item = itemRepository.findById(id);
        item.ifPresent(value -> cache.put(id, value));
        return item;
    }

    @Override
    public List<Item> getItems(String name, BigDecimal minPrice, BigDecimal maxPrice) {
        return itemRepository.findAll();
    }
}

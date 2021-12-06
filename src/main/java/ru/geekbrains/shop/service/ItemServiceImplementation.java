package ru.geekbrains.shop.service;

import org.springframework.stereotype.Service;
import ru.geekbrains.shop.model.ItemView;
import ru.geekbrains.storage.model.Item;
import ru.geekbrains.storage.repository.ItemRepository;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class ItemServiceImplementation implements ItemService {

    @Resource
    private ItemRepository itemRepository;

    @Override
    public Optional<Item> findItemById(Long id) {
        return itemRepository.findById(id);
    }

    @Override
    public List<Item> getItems(String name, BigDecimal minPrice, BigDecimal maxPrice) {
        return itemRepository.findAll();
    }
}

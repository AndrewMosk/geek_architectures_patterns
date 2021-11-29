package ru.geekbrains.shop.service;

import ru.geekbrains.shop.model.dto.ItemDto;

import java.util.Optional;

public interface ItemService {

    Optional<ItemDto> findItemById(Long id);
}

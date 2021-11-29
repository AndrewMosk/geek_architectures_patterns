package ru.geekbrains.shop.service;

import org.springframework.stereotype.Service;
import ru.geekbrains.shop.model.dto.ItemDto;
import ru.geekbrains.storage.repository.ItemRepository;

import javax.annotation.Resource;
import java.util.Optional;

@Service
public class ItemServiceImplementation implements ItemService {

    @Resource
    private ItemRepository itemRepository;

    @Override
    public Optional<ItemDto> findItemById(Long id) {
        return itemRepository.findById(id).map(item -> {
            ItemDto itemDto = new ItemDto();
            itemDto.setCode(item.getCode());
            itemDto.setName(item.getName());
            itemDto.setPrice(item.getPrice());

            return itemDto;
        });
    }
}

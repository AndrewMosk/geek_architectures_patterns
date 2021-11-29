package ru.geekbrains.storage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.geekbrains.storage.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}

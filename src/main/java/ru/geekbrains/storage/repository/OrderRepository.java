package ru.geekbrains.storage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.geekbrains.storage.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
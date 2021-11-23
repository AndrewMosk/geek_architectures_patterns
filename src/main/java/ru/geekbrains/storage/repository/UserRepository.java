package ru.geekbrains.storage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.geekbrains.storage.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
package ru.geekbrains.storage.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Item {

    private final Long code;

    private final String name;

    private final BigDecimal price;

}

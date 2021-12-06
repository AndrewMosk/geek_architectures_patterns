package ru.geekbrains.shop.model.dto;

import java.math.BigDecimal;

public class ItemView {

    private Long code;

    private String name;

    private BigDecimal price;

    private ItemView(ItemBuilder builder) {
        this.name = builder.name;
        this.price = builder.price;
    }

    public static ItemBuilder builder() {
        return new ItemBuilder();
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public static class ItemBuilder {
        private Long code;
        private String name;
        private BigDecimal price;

        public ItemBuilder setCode(Long code) {
            this.code = code;
            return this;
        }

        public ItemBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public ItemBuilder setPrice(BigDecimal price) {
            this.price = price;
            return this;
        }

        public ItemView build() {
            return new ItemView(this);
        }
    }
}

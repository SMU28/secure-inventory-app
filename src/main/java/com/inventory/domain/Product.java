package com.inventory.domain;

import java.util.Objects;

public class Product {
    private final String id;
    private String name;
    private double price;
    private int stock;

    public Product(String id, String name, double price, int stock) {
        if (id == null || !id.matches("[A-Za-z0-9\\-]{1,20}"))
            throw new IllegalArgumentException("ID inválido.");
        if (name == null || name.trim().isEmpty())
            throw new IllegalArgumentException("Nombre inválido.");
        if (price < 0) throw new IllegalArgumentException("Precio no puede ser negativo.");
        if (stock < 0) throw new IllegalArgumentException("Stock no puede ser negativo.");
        this.id = id;
        this.name = name.trim();
        this.price = price;
        this.stock = stock;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getStock() { return stock; }

    @Override
    public String toString() {
        return String.format("Product{id='%s', name='%s', price=%.2f, stock=%d}", id, name, price, stock);
    }
}

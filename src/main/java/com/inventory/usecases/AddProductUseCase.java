package com.inventory.usecases;

import com.inventory.domain.Product;
import com.inventory.domain.ProductRepository;

public class AddProductUseCase {
    private final ProductRepository repo;
    public AddProductUseCase(ProductRepository repo) { this.repo = repo; }
    public void execute(String id, String name, double price, int stock) {
        Product p = new Product(id, name, price, stock);
        repo.save(p);
    }
}

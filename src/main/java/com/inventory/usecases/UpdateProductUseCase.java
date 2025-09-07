package com.inventory.usecases;

import com.inventory.domain.Product;
import com.inventory.domain.ProductRepository;

public class UpdateProductUseCase {
    private final ProductRepository repo;

    public UpdateProductUseCase(ProductRepository repo) {
        this.repo = repo;
    }

    public void execute(Product product) {
        repo.update(product);
    }
}

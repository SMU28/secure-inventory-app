package com.inventory.domain;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    void save(Product p);
    void update(Product p);
    void deleteById(String id);
    Optional<Product> findById(String id);
    List<Product> findAll();
}

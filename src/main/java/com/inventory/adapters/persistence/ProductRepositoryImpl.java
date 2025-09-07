package com.inventory.adapters.persistence;

import com.inventory.domain.Product;
import com.inventory.domain.ProductRepository;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ProductRepositoryImpl implements ProductRepository {
    private final ConcurrentHashMap<String, Product> store = new ConcurrentHashMap<>();

    @Override public void save(Product p) {
        if (store.putIfAbsent(p.getId(), p) != null) {
            throw new IllegalStateException("Producto con ese ID ya existe.");
        }
    }

    @Override public void update(Product p) {
        if (!store.containsKey(p.getId())) throw new NoSuchElementException("Producto no encontrado.");
        store.replace(p.getId(), p);
    }

    @Override public void deleteById(String id) { store.remove(id); }

    @Override public Optional<Product> findById(String id) { return Optional.ofNullable(store.get(id)); }

    @Override public List<Product> findAll() { return new ArrayList<>(store.values()); }
}

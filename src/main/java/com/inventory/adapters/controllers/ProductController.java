package com.inventory.adapters.controller;

import com.inventory.usecases.AddProductUseCase;
import com.inventory.usecases.ListAllProductsUseCase;
import com.inventory.usecases.UpdateProductUseCase; // si lo implementas
import com.inventory.domain.Product;
import java.util.List;

public class ProductController {
    private final AddProductUseCase addUC;
    private final ListAllProductsUseCase listUC;

    public ProductController(AddProductUseCase addUC, ListAllProductsUseCase listUC) {
        this.addUC = addUC;
        this.listUC = listUC;
    }

    public void addProduct(String id, String name, double price, int stock) {
        addUC.execute(id, name, price, stock);
    }

    public List<Product> listAll() { return listUC.execute(); }
}

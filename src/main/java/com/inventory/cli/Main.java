package com.inventory.cli;

import com.inventory.adapters.persistence.ProductRepositoryImpl;
import com.inventory.adapters.controller.ProductController;
import com.inventory.usecases.AddProductUseCase;
import com.inventory.usecases.ListAllProductsUseCase;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var repo = new ProductRepositoryImpl();
        var addUC = new AddProductUseCase(repo);
        var listUC = new ListAllProductsUseCase(repo);
        var ctrl = new ProductController(addUC, listUC);

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1) Agregar  2) Listar  3) Salir");
            System.out.print("Elige: ");
            String opt = sc.nextLine().trim();
            try {
                if (opt.equals("1")) {
                    System.out.print("ID: "); String id = sc.nextLine().trim();
                    System.out.print("Nombre: "); String name = sc.nextLine().trim();
                    System.out.print("Precio: "); double price = Double.parseDouble(sc.nextLine().trim());
                    System.out.print("Stock: "); int stock = Integer.parseInt(sc.nextLine().trim());
                    ctrl.addProduct(id, name, price, stock);
                    System.out.println("Producto agregado.");
                } else if (opt.equals("2")) {
                    List<?> products = ctrl.listAll();
                    products.forEach(System.out::println);
                } else if (opt.equals("3")) {
                    System.out.println("Saliendo...");
                    break;
                } else {
                    System.out.println("Opción inválida.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        sc.close();
    }
}

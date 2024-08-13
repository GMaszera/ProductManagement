package org.example;

import org.example.entities.Product;
import org.example.entities.Storage;

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();
        Product product1 = new Product("Teclado", 99.90, 10, "T001");
        Product product2 = new Product("Mouse", 49.90, 20, "M001");
        Storage.addProduct(product1);
        Storage.addProduct(product2);

        System.out.println("Total de produtos: " + Storage.quantityProducts());
    }
}
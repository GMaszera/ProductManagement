package org.example.entities;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    private static List<Product> product = new ArrayList<>();

    public static void addProduct(Product Product) {
        product.add(Product);
    }

    public void removeProduct() {

    }

    public static void listProducts() {

    }

    public String searchProduct(String name) {

        return name;
    }

    public static int quantityProducts() {

        return product.size();
    }

}

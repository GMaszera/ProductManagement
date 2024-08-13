package org.example.entities;

public class Product {
    private String name;
    private double price;
    private Integer quantity;
    private final String CODE;

    public Product(String name, double price, Integer quantity, String CODE) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.CODE = CODE;
    }

    public Product(String code) {
        CODE = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", CODE='" + CODE + '\'' +
                '}';
    }
}

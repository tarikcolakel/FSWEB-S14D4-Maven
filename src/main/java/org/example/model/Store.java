package org.example.model;

public class Store {
    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }
    }

    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];

        products[0] = new Chocolate("Dark Chocolate", 5.99, "Bitter taste with 70% cocoa", 70);
        products[1] = new Coke("Coca-Cola", 1.99, "Refreshing soft drink", 500);
        products[2] = new Bread("Whole Wheat Bread", 2.49, "Healthy and nutritious", "Whole Wheat");

        listProducts(products);
    }
}

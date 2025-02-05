package org.example.model;

public class Bread extends ProductForSale {
    private String flourType;

    // Orijinal constructor
    public Bread(String type, double price, String description, String flourType) {
        super(type, price, description);
        this.flourType = flourType;
    }

    // Test için varsayılan constructor
    public Bread(String type, double price, String description) {
        super(type, price, description);
        this.flourType = "Unknown"; // Varsayılan bir değer
    }

    public String getFlourType() {
        return flourType;
    }

    @Override
    public void showDetails() {
        System.out.println("Bread - Type: " + getType() +
                ", Price: " + getPrice() +
                ", Description: " + getDescription() +
                ", Flour Type: " + flourType);
    }
}

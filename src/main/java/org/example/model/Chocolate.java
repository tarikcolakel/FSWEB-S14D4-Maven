package org.example.model;

public class Chocolate extends ProductForSale {
    private int cocoaPercentage;

    // Orijinal constructor
    public Chocolate(String type, double price, String description, int cocoaPercentage) {
        super(type, price, description);
        this.cocoaPercentage = cocoaPercentage;
    }

    // Test için varsayılan constructor
    public Chocolate(String type, double price, String description) {
        super(type, price, description);
        this.cocoaPercentage = 50; // Varsayılan bir değer
    }

    public int getCocoaPercentage() {
        return cocoaPercentage;
    }

    @Override
    public void showDetails() {
        System.out.println("Chocolate - Type: " + getType() +
                ", Price: " + getPrice() +
                ", Description: " + getDescription() +
                ", Cocoa Percentage: " + cocoaPercentage + "%");
    }
}

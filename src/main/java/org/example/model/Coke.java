package org.example.model;

public class Coke extends ProductForSale {
    private int volume;

    // Orijinal constructor
    public Coke(String type, double price, String description, int volume) {
        super(type, price, description);
        this.volume = volume;
    }

    // Test için varsayılan constructor
    public Coke(String type, double price, String description) {
        super(type, price, description);
        this.volume = 330; // Varsayılan bir değer
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public void showDetails() {
        System.out.println("Coke - Type: " + getType() +
                ", Price: " + getPrice() +
                ", Description: " + getDescription() +
                ", Volume: " + volume + "ml");
    }
}

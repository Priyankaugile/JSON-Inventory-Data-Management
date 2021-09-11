package com.jsoninventory;
//model
public class Inventory {
    public String name;
    public int weight;
    public int pricePerKg;
    public int inventoryPrice;

    public Inventory() {
    }

    public Inventory(String name, int weight, int pricePerKg) {
        this.name = name;
        this.weight = weight;
        this.pricePerKg = pricePerKg;
    }

    public void setPrice(int inventoryPrice) {
        this.inventoryPrice = inventoryPrice;
    }
}


package com.jsoninventory;

import java.util.ArrayList;

//Service
public class Write {
    public ArrayList<Inventory> inventoryList = new ArrayList<>();

    public void Price() {

        for (int i = 0; i < inventoryList.size(); i++) {
            Inventory items = inventoryList.get(i);
            Price(items);
        }
    }

    public void Price(Inventory inventory){

        inventory.inventoryPrice = inventory.weight * inventory.pricePerKg;
        System.out.println("The total price of "+ inventory.name+" is: "+ inventory.inventoryPrice+" Rs/-");


    }
}


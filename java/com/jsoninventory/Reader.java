package com.jsoninventory;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;


public class Reader {
    public static  void main(String[] args)   throws IOException {
        Write write = new Write();

        Inventory item1 = new Inventory("Rice", 7, 60);
        Inventory item2 = new Inventory("Pulses", 3, 65);
        Inventory item3 = new Inventory("Wheats", 5, 45);
        write.inventoryList.add(item1);
        write.inventoryList.add(item2);
        write.inventoryList.add(item3);

        write.Price();
        Gson gson = new Gson();

        FileWriter fileWriter = new FileWriter("src/main/resources/Inventory.json");
        gson.toJson(item1, fileWriter);
    }
}




package com.bootcampexcercise.module10.activity;
import java.util.HashMap;
public class ElectronicItemDetails {
    // HashMap with name and price
    HashMap<String, Double> itemHashMap = new HashMap<>();
    // Method to return price by name
    public double returnPriceOfItem(HashMap<String, Double> map, String name) {
        // Check if item exists
        if (map.containsKey(name)) {
            return map.get(name);
        } else {
            System.out.println("Item not found: " + name);
            return 0.0;
        }
    }
    public static void main(String[] args) {
        // Create object
        ElectronicItemDetails obj = new ElectronicItemDetails();
        // Add 4 items
        obj.itemHashMap.put("TV", 500.0);
        obj.itemHashMap.put("Refrigerator", 800.0);
        obj.itemHashMap.put("Washing Machine", 650.0);
        obj.itemHashMap.put("Laptop", 1200.0);
        // Print prices
        System.out.println("Price of TV is " + obj.returnPriceOfItem(obj.itemHashMap, "TV"));
        System.out.println("Price of Laptop is " + obj.returnPriceOfItem(obj.itemHashMap, "Laptop"));
    }
}

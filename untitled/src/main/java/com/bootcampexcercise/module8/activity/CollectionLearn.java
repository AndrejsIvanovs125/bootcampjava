package com.bootcampexcercise.module8.activity;
import java.util.*;
public class CollectionLearn {
    private List<String> list = new ArrayList<>();
    private Set<String> set = new HashSet<>();
    private Map<String, String> map = new HashMap<>();
    public static void main(String[] args) {
        CollectionLearn obj = new CollectionLearn();
        // Add initial 10 values
        obj.addValue("1", "John");
        obj.addValue("2", "Mike");
        obj.addValue("3", "Shanti");
        obj.addValue("4", "Stacie");
        obj.addValue("5", "Disha");
        obj.addValue("6", "Alex");
        obj.addValue("7", "Bob");
        obj.addValue("8", "Emma");
        obj.addValue("9", "Liam");
        obj.addValue("10", "Olivia");
        // Print all
        System.out.println("=== Initial Data ===");
        obj.printAll();
        // Try adding duplicate
        System.out.println("\n=== Adding duplicate ===");
        obj.addValue("1", "John");
        // Remove values
        System.out.println("\n=== Removing values ===");
        obj.removeValue("3", "Shanti");
        obj.printAll();
        // Replace values
        System.out.println("\n=== Replacing values ===");
        obj.replaceValue("2", "Mike", "Michael");
        obj.printAll();
    }

    // Add values (no duplicates)
    public void addValue(String id, String name) {
        if (!list.contains(name)) {
            list.add(name);
        } else {
            System.out.println("List duplicate not allowed: " + name);
        }
        if (!set.contains(name)) {
            set.add(name);
        } else {
            System.out.println("Set duplicate not allowed: " + name);
        }
        if (!map.containsKey(id) && !map.containsValue(name)) {
            map.put(id, name);
        } else {
            System.out.println("Map duplicate not allowed: " + id + " / " + name);
        }
    }
    // Remove values
    public void removeValue(String id, String name) {
        list.remove(name);
        set.remove(name);
        map.remove(id);
    }
    // Replace values (no duplicates)
    public void replaceValue(String id, String oldValue, String newValue) {
        if (list.contains(newValue) || set.contains(newValue) || map.containsValue(newValue)) {
            System.out.println("Duplicate value not allowed: " + newValue);
            return;
        }
        // List
        if (list.contains(oldValue)) {
            int index = list.indexOf(oldValue);
            list.set(index, newValue);
        }
        // Set
        if (set.contains(oldValue)) {
            set.remove(oldValue);
            set.add(newValue);
        }
        // Map
        if (map.containsKey(id)) {
            map.put(id, newValue);
        }
    }
    // Print all collections
    public void printAll() {
        System.out.println("\nList:");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("\nSet:");
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println("\nMap:");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}

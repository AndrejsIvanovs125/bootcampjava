package com.bootcampexcercise.module8.activity;
import java.util.HashSet;
import java.util.Set;

public class HashSetActivity {
    public static void main(String[] args) {

        // Create HashSet with 10 names
        Set<String> names = new HashSet<>();
        names.add("John");
        names.add("Mike");
        names.add("Shanti");
        names.add("Stacie");
        names.add("Disha");
        names.add("Alex");
        names.add("Bob");
        names.add("Emma");
        names.add("Liam");
        names.add("Olivia");
        // Print set
        System.out.println("Initial Set:");
        printSet(names);
        // Add duplicate
        names.add("John");
        names.add("Disha");
        System.out.println("\nAfter adding duplicates:");
        printSet(names);
        // Remove 2 values
        names.remove("Mike");
        names.remove("Emma");
        System.out.println("\nAfter removing elements:");
        printSet(names);
        // Find "index" of Disha
        System.out.println("\nFinding position of Disha:");
        findIndex(names, "Disha");
    }
    static void printSet(Set<String> set) {
        for (String name : set) {
            System.out.println(name);
        }
    }
    static void findIndex(Set<String> set, String target) {
        int index = 0;
        boolean found = false;
        for (String name : set) {
            if (name.equals(target)) {
                System.out.println(target + " found at position: " + index);
                found = true;break;
            }
            index++;
        }
        if (!found) {
            System.out.println(target + " not found");
        }
    }
}

package com.bootcampexcercise.module8.activity;
import java.util.ArrayList;
import java.util.List;

public class ListActivity {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Mike");
        names.add("Shanti");
        names.add("Stacie");
        // 2 - Call print method
        print(names);
    }
    static void print(List<String> list) {
        // 3 - Print list elements
        for (String name : list) {
            System.out.println(name);
        }
    }
}

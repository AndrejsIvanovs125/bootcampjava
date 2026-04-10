package com.bootcampexcercise.module8.activity;
import java.util.HashMap;
import java.util.Map;

public class MapActivity {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("1", "John");
        map.put("2", "Mike");
        map.put("3", "Shanti");
        map.put("4", "Stacie");
        // 2 - Call print method
        MapActivity obj = new MapActivity();
        obj.print(map);
    }
    void print(Map map) {
        // 3 - Print map
        for (Object key : map.keySet()) {
            System.out.println("ID: " + key + ", Name: " + map.get(key));
        }
    }
}

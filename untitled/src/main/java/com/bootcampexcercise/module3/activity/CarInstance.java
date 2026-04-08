package com.bootcampexcercise.module3.activity;

public class CarInstance {
    public static void main(String[] args) {
        // Create object using constructor
        Car car = new Car("Toyota", "Black", 2022);
        // Print 1: only name
        System.out.println("Car name: " + car.name);
        // Print 2: all attributes
        System.out.println( car.name + " " + car.color +" " + car.modelNo);
    }
}

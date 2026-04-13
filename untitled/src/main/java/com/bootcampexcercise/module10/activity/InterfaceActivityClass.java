package com.bootcampexcercise.module10.activity;

public class InterfaceActivityClass {
    public static void main(String[] args) {
        // Create Bike object
        Bike bike = new Bike();
        // Call bike methods
        bike.start();
        bike.stop();
        // Create Car object
        Car car = new Car();
        // Call car methods
        car.start();
        car.stop();
    }
}
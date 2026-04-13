package com.bootcampexcercise.module10.activity;

public class Bike implements Vehicle {

    // Implement start method
    @Override
    public void start() {
        System.out.println("Bike is starting...");
    }
    // Implement stop method
    @Override
    public void stop() {
        System.out.println("Bike is stopping...");
    }
}

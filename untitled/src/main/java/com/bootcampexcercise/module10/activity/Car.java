package com.bootcampexcercise.module10.activity;

public class Car implements Vehicle {

    // Implement start method
    @Override
    public void start() {
        System.out.println("Car is starting...");
    }
    // Implement stop method
    @Override
    public void stop() {
        System.out.println("Car is stopping...");
    }
}


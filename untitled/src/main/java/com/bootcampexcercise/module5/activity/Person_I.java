package com.bootcampexcercise.module5.activity;

public class Person_I { String name;
    int age;

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Method to print person info
    public void printPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

package com.bootcampexcercise.module10.activity;

abstract class Person {
    // Attributes (fields) of the Person class
    private String name;
    private int age;
    // Getter for name
    public String getName() {
        return name;
    }
    // Setter for name
    public void setName(String name) {
        this.name = name;
    }
    // Getter for age
    public int getAge() {
        return age;
    }
    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }
    // Method to introduce the person
    public void introduce() {
        System.out.println("Hello, my name is " + name +
                " and I am " + age + " years old.");
    }
}

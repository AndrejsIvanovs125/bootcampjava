package com.bootcampexcercise.module8.activity;

import java.util.Objects;

public class Student {
    // Define attributes
    private int id;
    private String name;
    private double grade;
    // Constructor
    public Student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
    // Getters and setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getGrade() {
        return grade;
    }
    public void setGrade(double grade) {
        this.grade = grade;
    }
    // Print student details
    public void printStudent() {
        System.out.println("ID: " + id + ", Name: " + name + ", Grade: " + grade);
    }
}

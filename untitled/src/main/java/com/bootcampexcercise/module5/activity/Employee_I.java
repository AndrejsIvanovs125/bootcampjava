package com.bootcampexcercise.module5.activity;

public class Employee_I extends Person_I {
    double salary;
    String title;

    // Setter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Method to print employee info
    public void printEmployeeInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Title: " + title);
        System.out.println("Salary: " + salary);
    }
}

package com.bootcampexcercise.module10.activity;

public class Employee extends Person{

    // Additional attributes specific to Employee
    private String jobTitle;
    private String company;
    private double salary;

    // Default constructor
    public Employee() {
    }
    // Constructor with all parameters
    public Employee(String name, int age, String jobTitle, String company, double salary) {
        // Call parent class setters
        setName(name);
        setAge(age);
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }
    // Constructor without salary (example of overloaded constructor)
    public Employee(String name, int age, String jobTitle, String company) {
        setName(name);
        setAge(age);
        this.jobTitle = jobTitle;
        this.company = company;
    }
    // Getter for jobTitle
    public String getJobTitle() {
        return jobTitle;
    }
    // Setter for jobTitle
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    // Getter for company
    public String getCompany() {
        return company;
    }
    // Setter for company
    public void setCompany(String company) {
        this.company = company;
    }
    // Getter for salary
    public double getSalary() {
        return salary;
    }
    // Setter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }
    // Override introduce method from Person class
    @Override
    public void introduce() {
        System.out.println("My name is " + getName() + " and I am " + getAge() + " years old. " + "I work as " + jobTitle + " in " + company + " and my salary is " + salary);
    }
}

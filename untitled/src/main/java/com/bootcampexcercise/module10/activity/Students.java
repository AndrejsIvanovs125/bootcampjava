package com.bootcampexcercise.module10.activity;

public class Students extends Person {
    // Attribute specific to Student class
    private String schoolName;
    // Default constructor
    public Students() {
    }
    // Constructor with all parameters
    public Students(String name, int age, String schoolName) {
        setName(name);
        setAge(age);
        this.schoolName = schoolName;
    }
    // Getter for schoolName
    public String getSchoolName() {
        return schoolName;
    }
    // Setter for schoolName
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
    // Override introduce method from Person class
    @Override
    public void introduce() {
        System.out.println(
                "My name is " + getName() + " and I am " + getAge() + " years old. " + "I am studying in university " + schoolName);
    }
}

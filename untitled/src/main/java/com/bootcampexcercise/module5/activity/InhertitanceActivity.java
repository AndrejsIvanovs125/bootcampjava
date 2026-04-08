package com.bootcampexcercise.module5.activity;

public class InhertitanceActivity {
    public static void main(String[] args) {
        // Person object
        Person_I myPerson = new Person_I();
        myPerson.setName("Sarah Johnson");
        myPerson.setAge(21);
        myPerson.printPersonInfo();
        System.out.println("-----------------------------");
        // Employee object
        Employee_I myEmployee = new Employee_I();
        myEmployee.setName("Shawn Cun");
        myEmployee.setAge(32);
        myEmployee.setTitle("Developer");
        myEmployee.setSalary(70000.00);
        myEmployee.printEmployeeInfo();
        System.out.println("-----------------------------");
    }
}



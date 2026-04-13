package com.bootcampexcercise.module10.activity;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList  {
    public static void main(String[] args) {
        // Create list of employees
        List<Employee> empList = new ArrayList<>();
        // Add 5 employees
        empList.add(new Employee("John", 30, "Developer", "Google", 5000));
        empList.add(new Employee("Anna", 28, "QA Engineer", "Amazon", 4500));
        empList.add(new Employee("Mike", 35, "Manager", "Microsoft", 7000));
        empList.add(new Employee("Emma", 26, "Designer", "Apple", 4800));
        empList.add(new Employee("David", 40, "Architect", "Oracle", 9000));
        // Find highest paid employee
        String highestPaid = getHighestPaidEmp(empList);
        // Print result
        System.out.println("The Employee whose salary is the highest is: " + highestPaid);
    }
     //Method to find employee with highest salary
    public static String getHighestPaidEmp(List<Employee> list) {
        if (list == null || list.isEmpty()) {
            return "No employees available";
        }
        Employee highest = list.get(0);
        for (Employee emp : list) {
            if (emp.getSalary() > highest.getSalary()) {
                highest = emp;
            }
        }
        return highest.getName();
    }
}
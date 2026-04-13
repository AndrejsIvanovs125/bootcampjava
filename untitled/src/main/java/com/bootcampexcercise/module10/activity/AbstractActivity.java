package com.bootcampexcercise.module10.activity;

public class AbstractActivity {
    public static void main(String[] args) {
        // Create Employee object
        Employee employee = new Employee();
        employee.setName("John Smith");
        employee.setAge(30);
        employee.setJobTitle("Developer");
        employee.setCompany("Google");
        employee.setSalary(5000.0);
        // Call introduce from Employee
        employee.introduce();
        // Create Student object
        Students student = new Students();
        student.setName("Anna Brown");
        student.setAge(21);
        student.setSchoolName("Oxford University");
        // Call introduce from Student
        student.introduce();
    }
}


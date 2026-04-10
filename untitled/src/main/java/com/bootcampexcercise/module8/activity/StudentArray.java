package com.bootcampexcercise.module8.activity;

import java.util.ArrayList;

public class StudentArray {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        // Add students
        addStudent(students, new Student(1, "John", 85.5));
        addStudent(students, new Student(2, "Mike", 90.0));
        addStudent(students, new Student(3, "Disha", 95.2));
        addStudent(students, new Student(4, "Emma", 88.8));
        // Print all students
        System.out.println("All Students:");
        printStudents(students);
        // Remove student with ID = 3
        students.removeIf(s -> s.getId() == 3);
        // Print after removal
        System.out.println("\nAfter removing ID 3:");
        printStudents(students);
        // Find highest grade student
        Student topStudent = findTopStudent(students);
        System.out.println("\nTop Student:");
        if (topStudent != null) {
            topStudent.printStudent();
        }
    }
    // Add student (prevent duplicate ID)
    public static void addStudent(ArrayList<Student> list, Student student) {
        for (Student s : list) {
            if (s.getId() == student.getId()) {
                System.out.println("Duplicate ID found: " + student.getId());
                return;
            }
        }
        list.add(student);
    }
    // Print all students
    public static void printStudents(ArrayList<Student> list) {
        for (Student s : list) {
            s.printStudent();
        }
    }
    // Find highest grade student
    public static Student findTopStudent(ArrayList<Student> list) {
        if (list.isEmpty()) return null;
        Student top = list.get(0);
        for (Student s : list) {
            if (s.getGrade() > top.getGrade()) {
                top = s;
            }
        }
        return top;
    }
}
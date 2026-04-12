package com.bootcampexcercise.module9.activity;

import com.bootcampexcercise.module8.activity.Student;
import com.bootcampexcercise.module8.activity.StudentArray;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {

    private ArrayList<Student> students;

    @Before
    public void setUp() {
        students = new ArrayList<>();
    }

    @Test
    public void testAddStudent() {
        Student student = new Student(1, "John", 85.5);

        StudentArray.addStudent(students, student);

        assertEquals(1, students.size());
        assertEquals(1, students.get(0).getId());
        assertEquals("John", students.get(0).getName());
        assertEquals(85.5, students.get(0).getGrade(), 0.001);
    }

    @Test
    public void testAddStudentDuplicateIdNotAllowed() {
        Student s1 = new Student(1, "John", 85.5);
        Student s2 = new Student(1, "Mike", 90.0);

        StudentArray.addStudent(students, s1);
        StudentArray.addStudent(students, s2);

        assertEquals(1, students.size());
        assertEquals("John", students.get(0).getName());
    }

    @Test
    public void testFindTopStudent() {
        StudentArray.addStudent(students, new Student(1, "John", 85.5));
        StudentArray.addStudent(students, new Student(2, "Mike", 90.0));
        StudentArray.addStudent(students, new Student(3, "Disha", 95.2));
        StudentArray.addStudent(students, new Student(4, "Emma", 88.8));

        Student topStudent = StudentArray.findTopStudent(students);

        assertNotNull(topStudent);
        assertEquals(3, topStudent.getId());
        assertEquals("Disha", topStudent.getName());
        assertEquals(95.2, topStudent.getGrade(), 0.001);
    }

    @Test
    public void testFindTopStudentEmptyList() {
        Student topStudent = StudentArray.findTopStudent(students);

        assertNull(topStudent);
    }

    @Test
    public void testRemoveStudentByIdUsingRemoveIf() {
        StudentArray.addStudent(students, new Student(1, "John", 85.5));
        StudentArray.addStudent(students, new Student(2, "Mike", 90.0));
        StudentArray.addStudent(students, new Student(3, "Disha", 95.2));

        students.removeIf(s -> s.getId() == 3);

        assertEquals(2, students.size());

        for (Student s : students) {
            assertNotEquals(3, s.getId());
        }
    }
}
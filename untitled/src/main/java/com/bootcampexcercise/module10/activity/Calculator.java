package com.bootcampexcercise.module10.activity;

public class Calculator {
    // Add method
    public int add(int a, int b) {
        return a + b;
    }
    // Add method with overload
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    // Subtract method
    public int subtract(int a, int b) {
        return a - b;
    }
    // Divide method with exception handling
    public int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Invalid input: division by zero is not allowed.");
            return 0;
        }
    }
    // Multiply method with invalid input handling
    public int multiply(int a, int b) {
        try {
            if (a < 0 || b < 0) {
                throw new IllegalArgumentException("Invalid input: negative values are not allowed.");
            }
            return a * b;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }
}
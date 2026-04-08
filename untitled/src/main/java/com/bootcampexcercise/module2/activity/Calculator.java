package com.bootcampexcercise.module2.activity;

public class Calculator {
    public static void main(String[] args) {
        // Calling all methods at least once
        sum(10, 5);
        subtract(10, 5);
        multiply(10, 5);
        divide(10, 5);
        module(10, 5);
    }

    public static void sum(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    public static void subtract(int a, int b) {
        System.out.println("Subtract = " + (a - b));
    }

    public static void multiply(int a, int b) {
        System.out.println("Multiply = " + (a * b));
    }

    public static void divide(int a, int b) {
        if (b != 0) {
            System.out.println("Divide = " + (a / b));
        } else {
            System.out.println("Cannot divide by zero");
        }
    }

    public static void module(int a, int b) {
        System.out.println("Module = " + (a % b));
    }
}



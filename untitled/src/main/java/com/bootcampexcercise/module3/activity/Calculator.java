package com.bootcampexcercise.module3.activity;

public class Calculator {
    public static final String CALC_TYPE_BASIC = "BASIC";

    private String calculatorType;

    public Calculator(String calculatorType) {
        this.calculatorType = calculatorType;
    }

    public String getCalculatorType() {
        return calculatorType;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int[] numbers) {
        int result = 1;

        for (int number : numbers) {
            result = result * number;
        }
        return result;
    }
    public int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return a / b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
}

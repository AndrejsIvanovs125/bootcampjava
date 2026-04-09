package com.bootcampexcercise.Module7.Activity;

public class ArithmeticExceptionActivity {
    public static void main(String[] args) {
        // create object and call method
        ArithmeticExceptionActivity obj = new ArithmeticExceptionActivity();
        obj.catchMe(10, 0); // will cause exception
        obj.catchMe(10, 2); // normal execution
    }
    void catchMe(int num1, int num2) {
        try {
            // division operation
            int result = num1 / num2;
            System.out.println("Result = " + result);
        } catch (ArithmeticException a) {
            // handle division by zero
            System.out.println("Cannot divide by zero!");
        } finally {
            // always executed
            System.out.println("Thank you for using this program.");
        }
    }
}

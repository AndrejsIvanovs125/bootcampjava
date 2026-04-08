package com.bootcampexcercise.module2.activity;

public class FindInArray {
    public static void main(String[] args) {
        int[] numbers = {
                12, 45, 7, 89, 23, 56, 78, 34, 67, 90,
                11, 22, 33, 44, 55, 66, 77, 88, 99, 10
        };
        // Assume first element is max
        int max = numbers[0];
        // Loop through array
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        // Print result
        System.out.println("Max = " + max);
    }
}


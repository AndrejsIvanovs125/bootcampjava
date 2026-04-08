package com.bootcampexcercise.module2.activity;

public class FindLargest {
    public static void main(String[] args) {
        int x = 10;
        int z = 88;
        int y = 2;
        int largest;
        if (x > z) {
            if (x > y) {
                largest = x;
            } else {
                largest = y;
            }
        } else {
            if (z > y) {
                largest = z;
            } else {
                largest = y;
            }
        }
        System.out.println(largest);

    }
}

package com.bootcampexcercise.Module7.Activity;

public class TryCatchFinallyActivity {
    public static void main(String[] args) {
        // Create an object to call non-static method
        TryCatchFinallyActivity obj = new TryCatchFinallyActivity();
        // Call the method
        obj.catchMeIfYouCan();
    }
    void catchMeIfYouCan() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        try {
            // Loop intentionally goes out of bounds (i <= 10 instead of < 10)
            for (int i = 0; i <= 10; i++) {
                System.out.println(arr[i]);
            }
        } catch (IndexOutOfBoundsException e) {
            // Handle exception when index exceeds array size
            System.out.println("Index is out of bounds");
        } finally {
            // This block always executes, regardless of exception
            System.out.println("Executed!");
        }
    }
}

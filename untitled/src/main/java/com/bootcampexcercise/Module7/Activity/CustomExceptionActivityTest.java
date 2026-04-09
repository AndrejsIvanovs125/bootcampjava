package com.bootcampexcercise.Module7.Activity;

public class CustomExceptionActivityTest {
    public static void main(String[] args) {
        CustomExceptionActivityTest obj = new CustomExceptionActivityTest();
        try {
            obj.validateUser("John");
            obj.validateUser("Mike");
            obj.validateUser("Sarah");
            obj.validateUser("Stacie");
        } catch (CustomExceptionActivity e) {
            System.out.println(e.getMessage());
        }
    }
    void validateUser(String name) throws CustomExceptionActivity {
        // Array of valid names
        String[] validUsers = {"John", "Mike", "Shanti", "Stacie"};
        // Flag stores 1 if a match is found, otherwise remains 0
        int flag = 0;
        for (int i = 0; i < validUsers.length; i++) {
            // 2 - Check if input name matches any valid user
            if (name.equals(validUsers[i])) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            throw new CustomExceptionActivity();
        }
        // 4 - If match found, print welcome message
        else if (flag == 1) {
            System.out.println("Welcome to Payroll program");
        }
    }
}



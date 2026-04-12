package com.bootcampexcercise.module9.activity;

public class Person {
    private int weight;
    private float height;
    // Getters and setters
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        this.height = height;
    }
    // Calculate BMI
    public String getBodyMassIndex(int weight, float height) {
        // Validation
        if (weight <= 0 || height <= 0) {
            return "Invalid input: weight and height must be greater than 0";
        }
        if (weight > 500) {
            return "Invalid input: weight too large";
        }
        if (height > 3) {
            return "Invalid input: height too large";
        }
        // BMI calculation
        double bmi = weight / (height * height);
        // Interpretation
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}

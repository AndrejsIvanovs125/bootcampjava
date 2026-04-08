package com.bootcampexcercise.module5.activity;

public class AbstractActivity {
    public static void main(String[] args) {
        // Rectangle
        Rectangle rect = new Rectangle(5, 3);
        rect.setColor("Red");
        System.out.println("Rectangle:");
        System.out.println("Color: " + rect.getColor());
        System.out.println("Area: " + rect.calculateArea());
        System.out.println("Perimeter: " + rect.calculatePerimeter());
        // Circle
        Circle circle = new Circle(4);
        circle.setColor("Blue");
        System.out.println("Circle:");
        System.out.println("Color: " + circle.getColor());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());
    }
}

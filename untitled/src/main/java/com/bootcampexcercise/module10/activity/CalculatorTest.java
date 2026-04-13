package com.bootcampexcercise.module10.activity;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }
    // Add tests
    @Test
    public void testAddTwoNumbers() {
        assertEquals(9, calculator.add(4, 5));
    }

    @Test
    public void testAddWithZero() {
        assertEquals(10, calculator.add(10, 0));
    }

    @Test
    public void testAddThreeNumbers() {
        assertEquals(6, calculator.add(1, 2, 3));
    }

    @Test
    public void testAddThreeWithNegative() {
        assertEquals(13, calculator.add(10, -2, 5));
    }

    // Subtract tests
    @Test
    public void testSubtractPositive() {
        assertEquals(6, calculator.subtract(10, 4));
    }

    @Test
    public void testSubtractNegative() {
        assertEquals(-6, calculator.subtract(4, 10));
    }

    // Divide tests
    @Test
    public void testDivideValid() {
        assertEquals(5, calculator.divide(10, 2));
    }

    @Test
    public void testDivideByZero() {
        assertEquals(0, calculator.divide(10, 0));
    }

    // Multiply tests
    @Test
    public void testMultiplyValid() {
        assertEquals(20, calculator.multiply(4, 5));
    }

    @Test
    public void testMultiplyNegative() {
        assertEquals(0, calculator.multiply(-4, 5));
    }
}

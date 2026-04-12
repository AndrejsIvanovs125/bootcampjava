package com.bootcampexcercise.module9.activity;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {
    private Person person;

    // Setup
    @Before
    public void setUp() {
        person = new Person();
    }

    // Teardown
    @After
    public void tearDown() {
        person = null;
    }

    // Test getters and setters
    @Test
    public void testGettersAndSetters() {
        person.setWeight(70);
        person.setHeight(1.75f);

        assertEquals(70, person.getWeight());
        assertEquals(1.75f, person.getHeight(), 0.001f);
    }

    // Test BMI calculation
    @Test
    public void testGetBodyMassIndex() {
        String result = person.getBodyMassIndex(70, 1.75f);
        assertEquals("Normal", result);

        result = person.getBodyMassIndex(50, 1.75f);
        assertEquals("Underweight", result);

        result = person.getBodyMassIndex(90, 1.75f);
        assertEquals("Overweight", result);

        result = person.getBodyMassIndex(120, 1.75f);
        assertEquals("Obese", result);
    }

    // Test invalid values
    @Test
    public void testInvalidInput() {
        String result = person.getBodyMassIndex(0, 1.75f);
        assertEquals("Invalid input: weight and height must be greater than 0", result);

        result = person.getBodyMassIndex(70, 0);
        assertEquals("Invalid input: weight and height must be greater than 0", result);

        result = person.getBodyMassIndex(600, 1.75f);
        assertEquals("Invalid input: weight too large", result);

        result = person.getBodyMassIndex(70, 5f);
        assertEquals("Invalid input: height too large", result);
    }
}
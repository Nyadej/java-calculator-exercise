package com.codingblackfemales;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

@DisplayName(value = "The Calculator should")
public class CalculatorTests {

    @Test
    @DisplayName("add two numbers")
    public void testAddition() {
        final Integer sum = Calculator.add(2, 4);

        assertEquals(6, sum);
    }

    @Test
    @DisplayName("subtract two numbers")
    public void testSubtraction() {
        final Integer difference = Calculator.subtract(2, 4);

        assertEquals(-2, difference);
    }

    @Test
    @DisplayName("multiply two numbers")
    public void testMultiplication() {
        final Integer multiplication = Calculator.multiply(2, 4);

        assertEquals(8, multiplication);
    }

    @Test
    @DisplayName("multiply a positive and a negative number")
    public void testMultiplicationOfPositiveAndNegativeNumber() {
        final Integer multiplication = Calculator.multiply(2, -4);

        assertEquals(-8, multiplication);
    }

    @Test
    @DisplayName("multiply two negative numbers")
    public void testMultiplicationOfNegativeNumbers() {
        final Integer multiplication = Calculator.multiply(-2, -4);

        assertEquals(8, multiplication);
    }

    @Test
    @DisplayName("multiplying by zero")
    public void testMultiplicationByZero() {
        final Integer multiplication = Calculator.multiply(2, 0);

        assertEquals(0, multiplication);
    }

    @Test
    @DisplayName("dividing by two numbers")
    public void testDivisionByTwoNumbers() {
        final Integer division = Calculator.divide(4, 2);

        assertEquals(2, division);
    }

    @Test
    @DisplayName("dividing by a positive and a negative number")
    public void testDivisionByPositiveAndNegativeNumber() {
        final Integer division = Calculator.divide(4, -2);

        assertEquals(-2, division);
    }

    @Test
    @DisplayName("dividing by two negative numbers")
    public void testDivisionByNegativeNumbers() {
        final Integer division = Calculator.divide(-4, -2);

        assertEquals(2, division);
    }

    @Test
    @DisplayName("dividing by zero throws ArithmeticException")
    public void testDivisionByZero() {
        try {
            Calculator.divide(4, 0);
            fail("ArithmeticException expected");
        } catch (ArithmeticException e) {
            assertEquals("/ by zero", e.getMessage());
        }
    }

}


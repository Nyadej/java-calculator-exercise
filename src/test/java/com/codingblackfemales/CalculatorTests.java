package com.codingblackfemales;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
    public void testMultiplicationTwoPositiveNumbers() {
        final Integer multiplication = Calculator.multiply(2, 4);

        assertEquals(8, multiplication);
    }

    @Test
    @DisplayName("multiply a positive and a negative number")
    public void testMultiplicationTwoPositiveAndNegativeNumber() {
        final Integer multiplication = Calculator.multiply(2, -4);

        assertEquals(-8, multiplication);
    }

    @Test
    @DisplayName("multiply two number numbers")
    public void testMultiplicationTwoNegativeNumbers() {
        final Integer multiplication = Calculator.multiply(-2, -4);

        assertEquals(8, multiplication);
    }

    @Test
    @DisplayName("multiplying by zero")
    public void testMultiplicationByZero() {
        final Integer multiplication = Calculator.multiply(2, 0);

        assertEquals(0, multiplication);
    }

}


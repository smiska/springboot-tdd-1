package com.springboot.taskmanager2.firsttddtest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void testDivideTwoPositiveNumbers() {
        // arrange
        Calculator calculator = new Calculator();

        // act
        double result = calculator.divide(10, 2);

        // assert
        assertEquals(5.0, result);
    }

    @Test
    void testDivideByZero() {
        // arrange
        Calculator calculator = new Calculator();

        // act &assert
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }

    @Test
    void testDivideTwoNegativeNumbers() {
        // arrange
        Calculator calculator = new Calculator();

        // act
        double result = calculator.divide(-10, -2);

        // assert
        assertEquals(5.0, result);
    }

}
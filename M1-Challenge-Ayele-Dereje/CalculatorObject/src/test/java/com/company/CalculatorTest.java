package com.company;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calc;

    @Before
    public void setUp() throws Exception {
        calc = new Calculator();
    }

    @Test
    public void shouldAddInteger() {
        assertEquals(4, calc.add(2, 2));
        assertEquals(2, calc.add(1, 1));

    }
    @Test
    public void shouldDividePositive() {
        assertEquals(4, calc.divide(12, 3));
//        assertEquals(2, calc.divide(12, 7));

    }

    @Test
    public void shouldReturnZero() {
        assertEquals(0, calc.divide(0, 2));
        assertEquals(0, calc.divide(10, 0));
        assertEquals(0, calc.divide(0, 0));
    }

    @Test
    public void shouldDivideNegative() {
        assertEquals(2, calc.divide(-4, -2));
        assertEquals(-5, calc.divide(-10, 2));
        assertEquals(-5, calc.divide(20, -4));
    }


    @Test
    public void shouldSubtractIntegers() {
        assertEquals(-29, calc.subtract(23, 52));
        assertEquals(6, calc.subtract(20, 14));
        assertEquals(0, calc.subtract(-10, -10));
        assertEquals(-4, calc.subtract(-4, 0));
    }

    @Test
    public void shouldMultiplyIntegers() {
        assertEquals(68, calc.multiply(34, 2));
        assertEquals(-5, calc.multiply(1, -5));
        assertEquals(0, calc.multiply(12, 0));
        assertEquals(20, calc.multiply(-4, -5));

    }

    @Test
    public void shouldAddDouble() {
        String failMessage = "Expected calculator to handle double addition.";
        assertEquals(failMessage,12.456,calc.add(6.223d, 6.233d), .0001);
        assertEquals(failMessage,5.7,calc.add(3.4d, 2.3d), .0001);
        assertEquals(failMessage, -1, calc.add(2.0d, -3d), .0001);
        assertEquals(failMessage, 8.6, calc.add(7.6d, 1d), .0001);


    }

    @Test
    public void shouldMultiplyDoubles() {
        String failMessage = "Expected calculator to handle double multiplication.";
        assertEquals(failMessage,29.48, calc.multiply(6.7d, 4.4d),.0001);
        assertEquals(failMessage, -6, calc.multiply(2.0d, -3d), .0001);
        assertEquals(failMessage, 7.6, calc.multiply(7.6d, 1d), .0001);


    }


    @Test
    public void shouldDivideDoubles() {
        String failMessage = "Expected calculator to handle double division.";
        assertEquals(failMessage,4.909090909090909d, calc.divide(10.8d, 2.2d), .0001);
        assertEquals(failMessage, -0.6666, calc.divide(2.0d, -3d), .0001);
        assertEquals(failMessage, 7.6, calc.divide(7.6d, 1d), .0001);

    }

    @Test
    public void ShouldSubtractDoubles() {
        String failMessage ="Expected calculator to handle double subtraction.";
        assertEquals(failMessage,5.0, calc.subtract(5.5, 0.5), .0001);
        assertEquals(failMessage, 5, calc.subtract(2.0d, -3d), .0001);
        assertEquals(failMessage, 6.6, calc.subtract(7.6d, 1d), .0001);

    }


}
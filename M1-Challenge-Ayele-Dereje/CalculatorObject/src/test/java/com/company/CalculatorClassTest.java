package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorClassTest {
    CalculatorClass calc;

    @Before
    public void setUp() throws Exception {
        calc = new CalculatorClass();
    }

    @Test
    public void shouldAddTwoPositiveInteger() {
        assertEquals(4, calc.addTwoInt(2, 2));
        assertEquals(2, calc.addTwoInt(1, 1));

    }
    @Test
    public void shouldDivideTwoPositiveInteger() {
        assertEquals(4, calc.divideTwoInt(12, 3));
        assertEquals(20, calc.divideTwoInt(100, 5));

    }

    @Test
    public void shouldReturnZeroFromTwoInteger() {
        assertEquals(0, calc.divideTwoInt(0, 40));
        assertEquals(0, calc.divideTwoInt(400, 0));
        assertEquals(0, calc.divideTwoInt(0, 0));
    }

    @Test
    public void shouldDivideTwoNegativeInteger() {
        assertEquals(2, calc.divideTwoInt(-4, -2));
        assertEquals(-5, calc.divideTwoInt(-10, 2));
        assertEquals(-5, calc.divideTwoInt(20, -4));
    }


    @Test
    public void shouldSubtractTwoIntegers() {
        assertEquals(-29, calc.subtractTwoInt(23, 52));
        assertEquals(6, calc.subtractTwoInt(20, 14));
        assertEquals(0, calc.subtractTwoInt(-10, -10));
        assertEquals(-4, calc.subtractTwoInt(-4, 0));
    }

    @Test
    public void shouldMultiplyTWoIntegers() {
        assertEquals(68, calc.multiplyTwoInt(34, 2));
        assertEquals(-5, calc.multiplyTwoInt(1, -5));
        assertEquals(0, calc.multiplyTwoInt(12, 0));
        assertEquals(20, calc.multiplyTwoInt(-4, -5));

    }

    @Test
    public void shouldAddTwoDouble() {
        String failMessage = "Expected calculator to handle double addition.";
        assertEquals(failMessage,12.456,calc.addTwoDouble(6.223d, 6.233d), .0001);
        assertEquals(failMessage,5.7,calc.addTwoDouble(3.4d, 2.3d), .0001);
        assertEquals(failMessage, -1, calc.addTwoDouble(2.0d, -3d), .0001);
        assertEquals(failMessage, 8.6, calc.addTwoDouble(7.6d, 1d), .0001);


    }

    @Test
    public void shouldMultiplyTwoDoubles() {
        String failMessage = "Expected calculator to handle double multiplication.";
        assertEquals(failMessage,29.48, calc.multiplyTwoDouble(6.7d, 4.4d),.0001);
        assertEquals(failMessage, -6, calc.multiplyTwoDouble(2.0d, -3d), .0001);
        assertEquals(failMessage, 7.6, calc.multiplyTwoDouble(7.6d, 1d), .0001);


    }


    @Test
    public void shouldDivideTwoDoubles() {
        String failMessage = "Calculator to handle double division.";
        assertEquals(failMessage,4.909090909090909d, calc.divideTwoDouble(10.8d, 2.2d), .0001);
        assertEquals(failMessage, -0.6666, calc.divideTwoDouble(2.0d, -3d), .0001);
        assertEquals(failMessage, 7.6, calc.divideTwoDouble(7.6d, 1d), .0001);

    }

    @Test
    public void ShouldSubtractTwoDoubles() {
        String failMessage ="Calculator to handle double subtraction expectation.";
        assertEquals(failMessage,5.0, calc.subtractTwoDouble(5.5, 0.5), .0001);
        assertEquals(failMessage, 5, calc.subtractTwoDouble(2.0d, -3d), .0001);
        assertEquals(failMessage, 6.6d, calc.subtractTwoDouble(7.6d, 1d), .0001);

    }


}
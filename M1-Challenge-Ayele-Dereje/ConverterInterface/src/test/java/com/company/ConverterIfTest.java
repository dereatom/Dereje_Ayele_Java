package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterIfTest {

    ConverterIf converterIf;
    @Before
    public void setUp() throws Exception {
        converterIf = new ConverterIf();

    }

    @Test
    public void convertMonth() {
        assertEquals("January", converterIf.convertMonth(1) );
        assertEquals("February", converterIf.convertMonth(2) );
        assertEquals("December", converterIf.convertMonth(12));


    }

    @Test
    public void convertDay() {
        assertEquals("Wednesday", converterIf.convertDay(4));
        assertEquals("Monday", converterIf.convertDay(2));
        assertEquals("Saturday", converterIf.convertDay(7));
    }
}
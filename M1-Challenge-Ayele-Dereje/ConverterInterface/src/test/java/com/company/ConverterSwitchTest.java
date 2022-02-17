package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterSwitchTest {

    ConverterSwitch converterSwitch;
    @Before
    public void setUp() throws Exception {
        converterSwitch = new ConverterSwitch();

    }

    @Test
    public void convertMonth() {
        assertEquals("January", converterSwitch.convertMonth(1));
        assertEquals("May", converterSwitch.convertMonth(5));
        assertEquals("July", converterSwitch.convertMonth(7));
    }

    @Test
    public void convertDay() {
        assertEquals("Tuesday", converterSwitch.convertDay(3));
        assertEquals("Sunday", converterSwitch.convertDay(1));
        assertEquals("Thursday", converterSwitch.convertDay(5));
    }
}
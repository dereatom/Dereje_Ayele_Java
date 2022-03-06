package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstableClassTest {

    ConstableClass constable;
    Warrior warrior;
    Farmer farmer;
    @Before
    public void setUp() throws Exception {
        constable = new ConstableClass("John", "test");
        warrior = new Warrior("Sarah");
        farmer = new Farmer("Joe", true, true);
    }

    @Test
    public void arrest() {
        assertEquals("Sarah", constable.arrest(warrior));
        assertEquals("Joe", constable.arrest(farmer) );

    }
}
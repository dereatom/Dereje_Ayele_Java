package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstableTest {

    Constable constable;
    Warrior warrior;
    @Before
    public void setUp() throws Exception {
        constable = new Constable("John", "test");
        warrior = new Warrior("Test Enemy");


    }

    @Test
    public void arrest() {
        assertEquals("Test Enemy", constable.arrest(warrior));
    }
}
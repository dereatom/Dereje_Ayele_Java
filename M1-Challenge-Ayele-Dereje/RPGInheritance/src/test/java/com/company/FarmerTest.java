package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FarmerTest {
    Farmer farmer;

    @Before
    public void setUp() throws Exception {
        farmer = new Farmer("Sara", true, false );

    }

    @Test
    public void isPlow() {

        assertEquals(true, farmer.isPlow());

    }

    @Test
    public void isHarvest() {
        assertEquals(false, farmer.isHarvest());

    }
}
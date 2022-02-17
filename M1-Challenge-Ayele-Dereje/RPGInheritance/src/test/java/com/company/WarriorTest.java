package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WarriorTest {

    Warrior warrior;
    private int shieldStrength;
    @Before
    public void setUp() throws Exception {
        warrior = new Warrior("Jana" );
    }

    @Test
    public void getShieldStrength() {
    }

    @Test
    public void decreaseShieldStrength() {
    }
}
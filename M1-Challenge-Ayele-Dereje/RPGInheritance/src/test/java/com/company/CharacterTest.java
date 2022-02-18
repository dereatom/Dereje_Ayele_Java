package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterTest {

    Character character;
    Character warrior;
    Character farmer;
    Character constable;


    @Before
    public void setUp() throws Exception {

        character = new Farmer("Jana", false, false);
        warrior = new Warrior("Kaka");
    }

    @Test
    public void shouldReturnDecreasedHealthValue() {
        warrior.attack(character);
        assertEquals(90, character.getHealth());
    }
}
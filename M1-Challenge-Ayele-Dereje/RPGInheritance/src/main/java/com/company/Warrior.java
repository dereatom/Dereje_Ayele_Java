package com.company;

public class Warrior extends Character {


    private int shieldStrength;

    public Warrior (String name) {
        super(name, 75,100, 100, 50,10);
    }

    public int getShieldStrength() {
        return shieldStrength;
    }

    public void decreaseShieldStrength(int amount) {
        this.shieldStrength -= amount;
    }
}

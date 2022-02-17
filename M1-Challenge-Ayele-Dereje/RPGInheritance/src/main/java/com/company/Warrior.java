package com.company;

public class Warrior extends Character {


//    public Warrior(String name, int strength, int health, int stamina, int speed, int attackPower) {
//        super(name, strength, health, stamina, speed, attackPower);
//   }
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

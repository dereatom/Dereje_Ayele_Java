package com.company;

public class Character {

    private String name;
    private int strength;
    private int health;
    private int stamina;
    private int speed;
    private int attackPower;

    public Character(String name, int strength, int health, int stamina, int speed, int attackPower){

        this.name = name;
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.speed = speed;
        this.attackPower = attackPower;

    }

    public void Run() {
        System.out.println("Running");
    }

    public void attack(Character enemy) {
        enemy.decreaseHealth(this.attackPower);
    }
    public void decreaseHealth(int amount) {
    this.health -= amount;
}

    public void heal(int amount) {
        this.health += amount;
    }

    public void increaseStamina(int amount) {
        this.stamina += amount;
    }

    public void decreaseStamina(int amount) {
        this.stamina -= amount;
    }

    public String getName() {
        System.out.println("This is for " + name);
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getHealth() {
        return health;
    }

    public int getStamina() {
        return stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public int getAttackPower() {
        return attackPower;
    }
}

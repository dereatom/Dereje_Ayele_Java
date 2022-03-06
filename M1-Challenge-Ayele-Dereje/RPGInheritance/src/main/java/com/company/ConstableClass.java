package com.company;

public class ConstableClass extends Character {


    private String jurisdiction;

    public ConstableClass(String name, String jurisdiction ){
        super("John", 60, 100, 60,20,5);
    }

    public String arrest(Character enemy) {
        System.out.format("Hey  You're under arrest", enemy.getName());
        return enemy.getName();
    }
    public String arrest(Warrior enemy) {
        System.out.format("Hey  You're under arrest", enemy.getName());
        return enemy.getName();
    }

    public String arrest(Farmer enemy) {
        System.out.format("Hey  You're under arrest", enemy.getName());
        return enemy.getName();
    }

    public String getJurisdiction() {
        return jurisdiction;
    }
}




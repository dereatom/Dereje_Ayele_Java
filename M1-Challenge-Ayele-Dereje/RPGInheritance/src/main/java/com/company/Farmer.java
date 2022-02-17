package com.company;

public class Farmer extends Character {

    private boolean plow= false;
    private boolean harvest = false;
    public Farmer(String name, boolean plow, boolean harvest) {
        super(name, 75, 100, 75, 10, 1);
        this.plow =plow;
        this.harvest = harvest;
    }

    public boolean isPlow() {
        return plow;
    }

    public void setPlow(boolean plow) {
        this.plow = plow;
    }

    public boolean isHarvest() {
        return harvest;
    }

    public void setHarvest(boolean harvest) {
        this.harvest = harvest;
    }
}

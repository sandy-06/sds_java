package com.company;

import java.util.Objects;

public class Warrior {
    private static final String warrior = null;
    private Integer shieldStrength;

    public Integer getShieldStrength() {
        return 100;
    }

    public Warrior() {
        super();
    }

    public int strength() {
        return 75;
    }

    public int health() {
        return 100;
    }

    public int stamina() {
        return 100;
    }

    public int speed() {
        return 50;
    }

    public int attack(boolean b) {
        return 10;
    }

    public boolean running() {
        return false;
    }

    public boolean arrested() {
        return false;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Warrior)) return false;
        Warrior warrior = (Warrior) o;
        return Objects.equals(getShieldStrength(), warrior.getShieldStrength());
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "shieldStrength=" + shieldStrength +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(getShieldStrength());
    }

    public void setShieldStrength(Integer shieldStrength) {
        this.shieldStrength = shieldStrength;
    }

    public Warrior(Integer shieldStrength) {
        this.shieldStrength = shieldStrength;
    }

    public boolean isRunning() {
        System.out.println( "I am running!");
        return false;
    }

    public void attack() {
        System.out.println("Warrior attacks ARGH ");
    }
}
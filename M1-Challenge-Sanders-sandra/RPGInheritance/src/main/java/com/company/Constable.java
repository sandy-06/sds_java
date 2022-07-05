package com.company;

import java.util.Objects;

public class Constable extends Person {
    private static final String constable = null;
    private String jurisdiction;

    public Constable(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    public Constable() {
        super();
    }

    public int strength() {
        return 60;
    }
    public int health() {
        return 100;
    }

    public int stamina() {
        return 60;
    }
    public int speed() {
        return 20;
    }
    public int attackPower() {
        return 5;
    }


    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    public boolean running() {
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Constable)) return false;
        Constable constable = (Constable) o;
        return Objects.equals(getJurisdiction(), constable.getJurisdiction());
    }

    @Override
    public String toString() {
        return "Constable{" +
                "jurisdiction='" + jurisdiction + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(getJurisdiction());
    }

    public boolean arrested() {
        return false;
    }
    protected Boolean arrest(String person) {

        System.out.println("I have arrested " + person);
        return true;
    }


   public Boolean attack(Boolean person) {
        System.out.println("I have attacked " + person);
        return true;

    }
}

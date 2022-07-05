package com.company;

import java.util.Objects;

public class Farmer extends Person {
    private static final String farmer = null;
    private Boolean plowing;
    private Boolean harvesting;

    public Farmer(Boolean plowing, Boolean harvesting) {

        this.plowing = plowing;
        this.harvesting = harvesting;
    }

    public void setPlowing(Boolean plowing) {
        this.plowing = plowing;
    }

    public void setHarvesting(Boolean harvesting) {
        this.harvesting = harvesting;
    }

    public Boolean getPlowing(Boolean plowing) {
        return false;
    }

    public Boolean getHarvesting(Boolean harvesting) {
        return false;
    }

    public int strength() {
        return 75;
    }

    public int health() {
        return 100;
    }

    public int stamina() {
        return 75;
    }

    public int speed() {
        return 10;
    }

    public int attackPower() {
        return 1;
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
        if (!(o instanceof Farmer)) return false;
        if (!super.equals(o)) return false;
        Farmer farmer = (Farmer) o;
        return Objects.equals(plowing, farmer.plowing) && Objects.equals(harvesting, farmer.harvesting);
    }

    @Override
    public String toString() {
        return "Farmer{" +
                "plowing=" + plowing +
                ", harvesting=" + harvesting +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), plowing, harvesting);
    }

    public void plowing(String i_am_plowing) {
        System.out.println(i_am_plowing + "it is hot a sweaty!");

    }

    public void harvesting(String i_am_harvesting) {
        System.out.println(i_am_harvesting + " what a great harvest we are having");
    }

}

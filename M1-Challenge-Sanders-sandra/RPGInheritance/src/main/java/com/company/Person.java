package com.company;

import java.util.Objects;

public class Person {

    public Person() {
    }

    public Person(String john) {
    }

    public String getFarmer() {
        return farmer;
    }


    public void setFarmer(String farmer) {
        this.farmer = farmer;
    }

    public String getWarrior() {
        return warrior;
    }

    public void setWarrior(String warrior) {
        this.warrior = warrior;
    }

    public String getConstable() {
        return constable;
    }

    public void setConstable(String constable) {
        this.constable = constable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStrength(int i) {
        return (i);
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getStamina() {
        return stamina;
    }

    public void setStamina(Integer stamina) {
        this.stamina = stamina;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(Integer attackPower) {
        this.attackPower = attackPower;
    }

    public Boolean getRunning() {
        return running;
    }

    public void setRunning(Boolean running) {
        this.running = running;
    }

    public boolean getArrested(boolean b) {
        return false;
    }

    public void setArrested(boolean arrested) {
        this.arrested = false;
    }

    public Boolean attack() {
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(getFarmer(), person.getFarmer()) && Objects.equals(getWarrior(), person.getWarrior()) && Objects.equals(getConstable(), person.getConstable()) && Objects.equals(getName(), person.getName()) && Objects.equals(getStrength(75), person.getStrength(75)) && Objects.equals(getHealth(), person.getHealth()) && Objects.equals(getStamina(), person.getStamina()) && Objects.equals(getSpeed(), person.getSpeed()) && Objects.equals(getAttackPower(), person.getAttackPower()) && Objects.equals(getRunning(), person.getRunning()) && Objects.equals(getArrested(false), person.getArrested(false));
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFarmer(), getWarrior(), getConstable(), getName(), getStrength(75), getHealth(), getStamina(), getSpeed(), getAttackPower(), getRunning(), getArrested(false));
    }

    @Override
    public String toString() {
        return "Person{" +
                "farmer='" + farmer + '\'' +
                ", warrior='" + warrior + '\'' +
                ", constable='" + constable + '\'' +
                ", name='" + name + '\'' +
                ", strength='" + strength + '\'' +
                ", health='" + health + '\'' +
                ", stamina='" + stamina + '\'' +
                ", speed='" + speed + '\'' +
                ", attackPower='" + attackPower + '\'' +
                ", running='" + running + '\'' +
                ", arrested='" + arrested + '\'' +
                '}';
    }

    private String name;
    private String farmer;
    private String warrior;

    private String constable;
    private Integer strength;
    private Integer health;
    private Integer stamina;
    private Integer speed;

    private Integer attackPower;
    private Boolean running;
    private Boolean arrested;

    public Person(String name, String farmer, String warrior, String constable, Integer strength, Integer health, Integer stamina, Integer speed, Integer attackPower, Boolean running, Boolean arrested) {
        this.name = name;
        this.farmer = farmer;
        this.warrior = warrior;
        this.constable = constable;
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.speed = speed;
        this.attackPower = attackPower;
        this.running = running;
        this.arrested = arrested;
    }

    public void attack(String i_am_attacking) {
        System.out.println(i_am_attacking + " is attacking " + this.name);
    }

    public void run() {
        System.out.println(this.name + " is running");
    }

}


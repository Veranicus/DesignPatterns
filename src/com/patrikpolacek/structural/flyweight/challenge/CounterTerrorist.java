package com.patrikpolacek.structural.flyweight.challenge;

public class CounterTerrorist implements Player {

    private String task;

    private String weapon;

    public void task(String taskName) {
    }

    @Override
    public void setWeapon(String weaponName) {
        this.weapon = weaponName;
    }

    @Override
    public void mission() {
        System.out.println("Defusing Bomb with weapon " + weapon);
        this.task = "Defusing Bomb";
    }
}

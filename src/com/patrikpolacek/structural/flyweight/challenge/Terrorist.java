package com.patrikpolacek.structural.flyweight.challenge;

public class Terrorist implements Player {

    private String weapon;

    private String task;

    @Override
    public void setWeapon(String weaponName) {
        this.weapon = weaponName;
    }

    @Override
    public void mission() {
        this.task = "Planting Bomb";
        System.out.println("Planting bomb with weapon " + weapon);
    }
}

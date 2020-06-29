package com.patrikpolacek.creational.prototype.challenge;

public class Ford extends BasicCar {

    public Ford() {
        setName("Ford");
        setPrice(56000);
    }

    @Override
    void ride() {
        System.out.println("Inside Ford::ride() method. Riding Ford!");
    }
}

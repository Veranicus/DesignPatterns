package com.patrikpolacek.creational.prototype.challenge;

public class Nano extends BasicCar {

    public Nano(){
        setName("Nano");
        setPrice(40000);
    }

    @Override
    void ride() {
        System.out.println("Inside Nano::Ride() method. Riding Nano!");
    }
}

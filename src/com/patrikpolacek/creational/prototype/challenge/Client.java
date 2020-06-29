package com.patrikpolacek.creational.prototype.challenge;

public class Client {

    public static void main(String[] args) {
        BasicCarCache.loadBasicCars();

        BasicCar clonedBasicCar = (BasicCar) BasicCarCache.getBasicCar("1");
        System.out.println(clonedBasicCar.getName());

        BasicCar clonedBasicCar2 = (BasicCar) BasicCarCache.getBasicCar("2");
        System.out.println(clonedBasicCar2.getName());
    }
}

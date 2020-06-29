package com.patrikpolacek.creational.factory.FactoryChallenge.Product;

public class Tiger implements Animal {

    @Override
    public void eat() {
        System.out.println("Inside Tiger::eat() method, roar");
    }
}

package com.patrikpolacek.creational.factory.FactoryChallenge.Product;

public class Lion implements Animal {

    @Override
    public void eat() {
        System.out.println("Inside Lion::eat() method, purr");
    }
}

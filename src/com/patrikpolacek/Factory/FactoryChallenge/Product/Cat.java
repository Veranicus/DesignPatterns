package com.patrikpolacek.Factory.FactoryChallenge.Product;

public class Cat implements Animal {

    @Override
    public void eat() {
        System.out.println("Inside Cat::eat() method, MEOW.");
    }
}

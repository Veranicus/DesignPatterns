package com.patrikpolacek.Factory.FactoryChallenge.Product;

public class Lion implements Animal {

    @Override
    public void eat() {
        System.out.println("Inside Lion::eat() method, purr");
    }
}

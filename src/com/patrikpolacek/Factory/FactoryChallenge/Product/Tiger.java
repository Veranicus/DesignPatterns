package com.patrikpolacek.Factory.FactoryChallenge.Product;

public class Tiger implements Animal {

    @Override
    public void eat() {
        System.out.println("Inside Tiger::eat() method, roar");
    }
}

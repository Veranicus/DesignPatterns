package com.patrikpolacek.creational.factory.FactoryStaticCreator.product;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}

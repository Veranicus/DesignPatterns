package com.patrikpolacek.Factory.FactoryStaticCreator.product;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method");
    }
}

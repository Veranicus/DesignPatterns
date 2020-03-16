package com.patrikpolacek.Factory.FactoryAbstractCreator.products;
//Those represents the product, instances which are going to be created

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}

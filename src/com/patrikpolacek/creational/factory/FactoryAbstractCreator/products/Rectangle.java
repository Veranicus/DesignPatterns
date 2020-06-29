package com.patrikpolacek.creational.factory.FactoryAbstractCreator.products;
//Those represents the product, instances which are going to be created
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}

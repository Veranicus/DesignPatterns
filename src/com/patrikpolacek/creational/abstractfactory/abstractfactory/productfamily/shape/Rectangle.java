package com.patrikpolacek.creational.abstractfactory.abstractfactory.productfamily.shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}

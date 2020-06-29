package com.patrikpolacek.creational.abstractfactory.abstractfactory.productfamily.shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}

package com.patrikpolacek.creational.abstractfactory.abstractfactory.productfamily.shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}

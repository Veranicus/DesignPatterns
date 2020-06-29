package com.patrikpolacek.creational.abstractfactory.abstractfactory.productfamily.color;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside " + this.getClass().getSimpleName() + "::fill() method");
    }
}

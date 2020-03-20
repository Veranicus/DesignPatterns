package com.patrikpolacek.abstractfactory.abstractfactory.productfamily.color;

public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside " + this.getClass().getSimpleName() + "::fill() method");
    }
}

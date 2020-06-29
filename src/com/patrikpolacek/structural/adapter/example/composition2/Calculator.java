package com.patrikpolacek.structural.adapter.example.composition2;

public class Calculator implements CalculatorInterface {

    @Override
    public double getArea(Rectangle rectangle) {
        return rectangle.getLength() * rectangle.getWidth();
    }


}

package com.patrikpolacek.structural.decorator.decoratorChallenge.component;

abstract class AbstractShape {
    private String color;

    public AbstractShape() {
        //Default color
        this.color = "White";
    }

    public String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }
}

package com.patrikpolacek.structural.decorator.decoratorChallenge.decorator;

import com.patrikpolacek.structural.decorator.decoratorChallenge.component.Shape;

abstract class AbstractDecorator implements Shape {

    private Shape shape;

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void setColor(String color) {
        shape.setColor(color);
    }

    @Override
    public void draw() {
        if (shape != null) {
            shape.draw();
        }
    }


}

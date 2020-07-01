package com.patrikpolacek.structural.decorator.decoratorChallenge.decorator;

public class BlueColorDecorator extends AbstractDecorator {

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public void draw() {
        setColor("Blue");
        System.out.println("Explicitly in " + this.getClass().getSimpleName() + ". Adding blue color");
        super.draw();
    }
}

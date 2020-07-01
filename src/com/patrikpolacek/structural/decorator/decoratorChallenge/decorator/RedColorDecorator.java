package com.patrikpolacek.structural.decorator.decoratorChallenge.decorator;

public class RedColorDecorator extends AbstractDecorator {

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public void draw() {
        setColor("Red");
        super.draw();
        System.out.println("Explicitly in " + this.getClass().getSimpleName() + ". Adding red color");
    }
}

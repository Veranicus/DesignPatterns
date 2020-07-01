package com.patrikpolacek.structural.decorator.decoratorChallenge.component;

public class Rectangle extends AbstractShape implements Shape {

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public void draw() {
        try {
            System.out.println("Inside " + this.getClass().getSimpleName() + "class " +
                    "in method " + this.getClass().getMethod("draw"));
            System.out.println("Color is " + this.getColor());
        }catch (NoSuchMethodException e){
            e.printStackTrace();
        }
    }
}

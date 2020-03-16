package com.patrikpolacek.Factory.FactoryConcreteCreator;

import com.patrikpolacek.Factory.FactoryConcreteCreator.creator.ConcreteShapeFactory;
import com.patrikpolacek.Factory.FactoryConcreteCreator.products.Shape;

public class Client {
    public static void main(String[] args) {
        ConcreteShapeFactory concreteShapeFactory = new ConcreteShapeFactory();
        Shape circle = concreteShapeFactory.getShape("circle");
        circle.draw();
        Shape rectangle = concreteShapeFactory.getShape("rectangle");
        rectangle.draw();
        Shape square = concreteShapeFactory.getShape("square");
        square.draw();
    }
}

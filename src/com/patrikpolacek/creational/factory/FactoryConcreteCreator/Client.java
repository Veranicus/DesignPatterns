package com.patrikpolacek.creational.factory.FactoryConcreteCreator;

import com.patrikpolacek.creational.factory.FactoryConcreteCreator.creator.ConcreteShapeFactory;
import com.patrikpolacek.creational.factory.FactoryConcreteCreator.products.Shape;

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

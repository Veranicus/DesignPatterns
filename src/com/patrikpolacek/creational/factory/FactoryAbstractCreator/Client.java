package com.patrikpolacek.creational.factory.FactoryAbstractCreator;

import com.patrikpolacek.creational.factory.FactoryAbstractCreator.creator.CircleFactory;
import com.patrikpolacek.creational.factory.FactoryAbstractCreator.creator.RectangleFactory;
import com.patrikpolacek.creational.factory.FactoryAbstractCreator.creator.SquareFactory;
import com.patrikpolacek.creational.factory.FactoryAbstractCreator.products.Shape;

//Abstract Creator is the most strict implementation of factory design principle
public class Client {

    public static void main(String[] args) {
//        get an object of circle
//        Client doesn't know anything about the factory method
        Shape circle = new CircleFactory().getShape();
        circle.draw();
        Shape rectangle = new RectangleFactory().getShape();
        rectangle.draw();
        Shape square = new SquareFactory().getShape();
        square.draw();
    }
}

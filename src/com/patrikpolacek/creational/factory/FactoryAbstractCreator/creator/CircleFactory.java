package com.patrikpolacek.creational.factory.FactoryAbstractCreator.creator;

import com.patrikpolacek.creational.factory.FactoryAbstractCreator.products.Circle;
import com.patrikpolacek.creational.factory.FactoryAbstractCreator.products.Shape;

public class CircleFactory extends AbstractShapeFactory {

    public Shape factoryMethod() {
        return new Circle();
    }
}

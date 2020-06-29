package com.patrikpolacek.creational.factory.FactoryAbstractCreator.creator;

import com.patrikpolacek.creational.factory.FactoryAbstractCreator.products.Shape;

public abstract class AbstractShapeFactory {

    abstract Shape factoryMethod();

    public Shape getShape() {
        return factoryMethod();
    }


//    Other helper methods ...
}


package com.patrikpolacek.Factory.FactoryAbstractCreator.creator;

import com.patrikpolacek.Factory.FactoryAbstractCreator.products.Shape;

public abstract class AbstractShapeFactory {

    abstract Shape factoryMethod();

    public Shape getShape() {
        return factoryMethod();
    }


//    Other helper methods ...
}


package com.patrikpolacek.creational.factory.FactoryAbstractCreator.creator;

import com.patrikpolacek.creational.factory.FactoryAbstractCreator.products.Shape;
import com.patrikpolacek.creational.factory.FactoryAbstractCreator.products.Square;

public class SquareFactory extends AbstractShapeFactory {

    public Shape factoryMethod() {
        return new Square();
    }
}

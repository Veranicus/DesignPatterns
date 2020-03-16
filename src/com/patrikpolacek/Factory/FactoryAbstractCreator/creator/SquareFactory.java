package com.patrikpolacek.Factory.FactoryAbstractCreator.creator;

import com.patrikpolacek.Factory.FactoryAbstractCreator.products.Shape;
import com.patrikpolacek.Factory.FactoryAbstractCreator.products.Square;

public class SquareFactory extends AbstractShapeFactory {

    public Shape factoryMethod() {
        return new Square();
    }
}

package com.patrikpolacek.creational.factory.FactoryAbstractCreator.creator;

import com.patrikpolacek.creational.factory.FactoryAbstractCreator.products.Rectangle;
import com.patrikpolacek.creational.factory.FactoryAbstractCreator.products.Shape;

public class RectangleFactory extends AbstractShapeFactory {

    public Shape factoryMethod() {
        return new Rectangle();
    }
}

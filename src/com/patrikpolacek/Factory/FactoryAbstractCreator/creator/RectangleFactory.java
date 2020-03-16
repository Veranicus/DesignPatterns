package com.patrikpolacek.Factory.FactoryAbstractCreator.creator;

import com.patrikpolacek.Factory.FactoryAbstractCreator.products.Rectangle;
import com.patrikpolacek.Factory.FactoryAbstractCreator.products.Shape;

public class RectangleFactory extends AbstractShapeFactory {

    public Shape factoryMethod() {
        return new Rectangle();
    }
}

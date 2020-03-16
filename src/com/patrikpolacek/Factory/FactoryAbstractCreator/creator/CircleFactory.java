package com.patrikpolacek.Factory.FactoryAbstractCreator.creator;

import com.patrikpolacek.Factory.FactoryAbstractCreator.products.Circle;
import com.patrikpolacek.Factory.FactoryAbstractCreator.products.Shape;

public class CircleFactory extends AbstractShapeFactory {

    public Shape factoryMethod() {
        return new Circle();
    }
}

package com.patrikpolacek.creational.factory.FactoryConcreteCreator.creator;

import com.patrikpolacek.creational.factory.FactoryConcreteCreator.products.Circle;
import com.patrikpolacek.creational.factory.FactoryConcreteCreator.products.Rectangle;
import com.patrikpolacek.creational.factory.FactoryConcreteCreator.products.Shape;
import com.patrikpolacek.creational.factory.FactoryConcreteCreator.products.Square;

public class ConcreteShapeFactory {

//    use getShape method to get and object of type shape

    public Shape getShape(String shapeType) {
        if (shapeType.isEmpty()) {
            return null;
        } else if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        } else return null;
    }
}

package com.patrikpolacek.creational.factory.FactoryStaticCreator.creator;

import com.patrikpolacek.creational.factory.FactoryStaticCreator.product.Circle;
import com.patrikpolacek.creational.factory.FactoryStaticCreator.product.Rectangle;
import com.patrikpolacek.creational.factory.FactoryStaticCreator.product.Shape;
import com.patrikpolacek.creational.factory.FactoryStaticCreator.product.Square;

public class StaticShapeFactory {

    public static Shape getShape(String shapeType) throws Exception {
        String shapeTypeChecked = shapeType.toUpperCase();
        Shape shape;
        switch (shapeTypeChecked) {
            case "SQUARE":
                shape = new Square();
                break;
            case "CIRCLE":
                shape = new Circle();
                break;
            case "RECTANGLE":
                shape = new Rectangle();
                break;
            default:
                throw new Exception("Object of that type not found");
        }
        return shape;
    }
}

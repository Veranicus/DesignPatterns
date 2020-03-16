package com.patrikpolacek.Factory.FactoryStaticCreator.creator;

import com.patrikpolacek.Factory.FactoryStaticCreator.product.Circle;
import com.patrikpolacek.Factory.FactoryStaticCreator.product.Rectangle;
import com.patrikpolacek.Factory.FactoryStaticCreator.product.Shape;
import com.patrikpolacek.Factory.FactoryStaticCreator.product.Square;

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

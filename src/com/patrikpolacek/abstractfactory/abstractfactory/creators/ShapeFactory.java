package com.patrikpolacek.abstractfactory.abstractfactory.creators;

import com.patrikpolacek.abstractfactory.abstractfactory.productfamily.color.Color;
import com.patrikpolacek.abstractfactory.abstractfactory.productfamily.shape.Circle;
import com.patrikpolacek.abstractfactory.abstractfactory.productfamily.shape.Rectangle;
import com.patrikpolacek.abstractfactory.abstractfactory.productfamily.shape.Shape;
import com.patrikpolacek.abstractfactory.abstractfactory.productfamily.shape.Square;

public class ShapeFactory implements AbstractFactory {
    //    code smell, something is wrong, violating interface segregation
//    principle
    @Override
    public Color getColor(String colorType) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else return null;
    }
}


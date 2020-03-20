package com.patrikpolacek.abstractfactory.abstractfactory.creators;

import com.patrikpolacek.abstractfactory.abstractfactory.productfamily.color.Blue;
import com.patrikpolacek.abstractfactory.abstractfactory.productfamily.color.Color;
import com.patrikpolacek.abstractfactory.abstractfactory.productfamily.color.Green;
import com.patrikpolacek.abstractfactory.abstractfactory.productfamily.color.Red;
import com.patrikpolacek.abstractfactory.abstractfactory.productfamily.shape.Shape;

public class ColorFactory implements AbstractFactory {
    @Override
    public Color getColor(String colorType) {
        if (colorType.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (colorType.equalsIgnoreCase("BLUE")) {
            return new Blue();
        } else if (colorType.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }
}

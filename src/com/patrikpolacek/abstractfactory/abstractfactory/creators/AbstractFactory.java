package com.patrikpolacek.abstractfactory.abstractfactory.creators;

import com.patrikpolacek.abstractfactory.abstractfactory.productfamily.color.Color;
import com.patrikpolacek.abstractfactory.abstractfactory.productfamily.shape.Shape;

//violating interface segregation principle
public interface AbstractFactory {

      Color getColor(String colorType);

      Shape getShape(String shapeType);
}

package com.patrikpolacek.Factory.FactoryStaticCreator;

import com.patrikpolacek.Factory.FactoryStaticCreator.creator.StaticShapeFactory;
import com.patrikpolacek.Factory.FactoryStaticCreator.product.Shape;

public class Client {

    public static void main(String[] args) throws Exception{
//We are calling just the static method, we don't have to create instance of the class
        Shape circle = StaticShapeFactory.getShape("Circle");
        circle.draw();
        Shape square = StaticShapeFactory.getShape("Square");
        square.draw();
        Shape rectangle = StaticShapeFactory.getShape("Rectangle");
        rectangle.draw();
        Shape error = StaticShapeFactory.getShape("Rectangles");
        error.draw();
    }
}

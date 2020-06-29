package com.patrikpolacek.creational.abstractfactory;

import com.patrikpolacek.creational.abstractfactory.abstractfactory.creators.AbstractFactory;
import com.patrikpolacek.creational.abstractfactory.abstractfactory.creators.FactoryProducer;
import com.patrikpolacek.creational.abstractfactory.abstractfactory.productfamily.color.Color;
import com.patrikpolacek.creational.abstractfactory.abstractfactory.productfamily.shape.Shape;

public class Client {

    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Shape circle = shapeFactory.getShape("Rectangle");
        circle.draw();
        Color red = colorFactory.getColor("RED");
        red.fill();


    }
}

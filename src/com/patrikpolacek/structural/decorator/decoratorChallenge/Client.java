package com.patrikpolacek.structural.decorator.decoratorChallenge;

import com.patrikpolacek.structural.decorator.decoratorChallenge.component.Circle;
import com.patrikpolacek.structural.decorator.decoratorChallenge.decorator.BlueColorDecorator;
import com.patrikpolacek.structural.decorator.decoratorChallenge.decorator.RedColorDecorator;

public class Client {

    public static void main(String[] args) {
        Circle circle = new Circle();
        BlueColorDecorator blueColorDecorator = new BlueColorDecorator();
        RedColorDecorator redColorDecorator = new RedColorDecorator();

        blueColorDecorator.setShape(circle);
        blueColorDecorator.draw();
        System.out.println(circle.getColor());

        redColorDecorator.setShape(circle);
        redColorDecorator.draw();
        System.out.println(circle.getColor());
    }
}

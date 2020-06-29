package com.patrikpolacek.structural.adapter.example.composition2;

//Calculator interface is the target, calculator is the adaptee

//We are converting triangle to rectangle and calling get area on rectangle
public class CalculatorAdapter implements CalculatorInterface {

    Calculator calculator;
    Triangle triangle;

    public CalculatorAdapter(Triangle triangle) {
        this.triangle = triangle;
    }

    @Override
    public double getArea(Rectangle rectangle) {
        calculator = new Calculator();
        Rectangle rectangle1 = new Rectangle();
        rectangle1.setLength(triangle.getBase());
        rectangle1.setWidth(0.5 * triangle.getHeight());
        return calculator.getArea(rectangle1);
    }
}

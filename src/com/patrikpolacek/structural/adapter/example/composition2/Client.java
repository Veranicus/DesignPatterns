package com.patrikpolacek.structural.adapter.example.composition2;

public class Client {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(20, 10);

        CalculatorInterface calculatorAdapter = new CalculatorAdapter(triangle);
        System.out.println("Area of the triangle is "
        + calculatorAdapter.getArea(null));
    }
}

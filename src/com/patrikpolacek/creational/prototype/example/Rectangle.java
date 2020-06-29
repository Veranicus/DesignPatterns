package com.patrikpolacek.creational.prototype.example;

public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Drawing Rectangle inside Rectangle::draw()");
    }


}

package com.patrikpolacek.structural.flyweight.example;
//Flyweight interface, clients know how to can extrinsic data
//In this example we don't have any extrinsic data, so it's going to just print something out
public interface Robot {

    void print();

//    extrinsic data passed as arguments
    void setColor(String colorOfRobot);

}

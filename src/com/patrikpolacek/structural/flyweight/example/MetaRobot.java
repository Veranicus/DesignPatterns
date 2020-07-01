package com.patrikpolacek.structural.flyweight.example;

public class MetaRobot implements Robot {
    private String robotType;

    public String colorOfRobot;

    public MetaRobot(String robotType) {
        this.robotType = robotType;
    }

    @Override
    public void print() {
        System.out.println("This is a :" + robotType + " With color: " + colorOfRobot);
    }

    @Override
    public void setColor(String colorOfRobot) {
        this.colorOfRobot = colorOfRobot;
    }
}

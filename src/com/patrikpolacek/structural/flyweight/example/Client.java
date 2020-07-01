package com.patrikpolacek.structural.flyweight.example;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) throws Exception {
        List<Robot> testRobots = new ArrayList<>();
        RobotFactory robotFactory = new RobotFactory();

        Robot shape;

//        New istances wont be created but the same one is going to be used
        for (int i = 0; i < 20; i++) {
            testRobots.add(robotFactory.getRobotFromFactory("King"));
            testRobots.add(robotFactory.getRobotFromFactory("Queen"));
            shape = robotFactory.getRobotFromFactory("King");
            shape.setColor(getRandomColor());
            shape.print();
        }
        for (int i = 0; i < testRobots.size() - 1; i++) {
            System.out.println(testRobots.get(i).equals(testRobots.get(i + 1)));
        }
        System.out.println(robotFactory.totalObjectsCreated());

    }

    private static String getRandomColor() {
        if ((Math.random() * 100) < 50) {
            return "Blue";
        } else return "Red";
    }
}

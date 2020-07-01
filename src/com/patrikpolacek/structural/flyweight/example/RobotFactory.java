package com.patrikpolacek.structural.flyweight.example;

import java.util.HashMap;
import java.util.Map;

//Going to manage all flyweight objects
//This factory creates new ones or provide existing objects
public class RobotFactory {
    Map<String, Robot> shapes = new HashMap<>();

    public int totalObjectsCreated() {
        return shapes.size();
    }

    public Robot getRobotFromFactory(String robotType) throws Exception {
        Robot returnedRobot = null;
        if (shapes.containsKey(robotType)) {
            returnedRobot = shapes.get(robotType);
        } else {
            switch (robotType) {
                case "King":
                    System.out.println("We don't have a King robot. Making new King Robot");
                    returnedRobot = new MetaRobot("King");
                    shapes.put("King", returnedRobot);
                    break;
                case "Queen":
                    System.out.println("We don't have Queen robot. Making new Queen robot.");
                    returnedRobot = new MetaRobot("Queen");
                    shapes.put("Queen", returnedRobot);
                    break;

                default:
                    throw new Exception("Robot factory cannot create " + robotType + " type of robot.");
            }
        }
        return returnedRobot;
    }

}

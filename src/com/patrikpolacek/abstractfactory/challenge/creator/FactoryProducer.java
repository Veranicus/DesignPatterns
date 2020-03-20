package com.patrikpolacek.abstractfactory.challenge.creator;

public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("HOLLYWOODFACTORY")) {
            return new HollywoodMovieFactory();
        } else if (choice.equalsIgnoreCase("BOLLYWOODFACTORY")) {
            return new BollywoodMovieFactory();
        } else return null;
    }
}

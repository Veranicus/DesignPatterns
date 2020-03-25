package com.patrikpolacek.Builder.Challenge;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        BuilderInterface vegBuilder = new VegMealBuilder();
        BuilderInterface chickenBuilder = new ChickenMealBuilder();

        director.construct(vegBuilder);
        Meal meal1 = vegBuilder.getMeal();
        Meal meal2 = chickenBuilder.getMeal();

        meal1.cost();
        meal1.showItems();
        meal2.cost();
        meal2.showItems();
    }
}

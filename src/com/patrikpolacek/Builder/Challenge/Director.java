package com.patrikpolacek.Builder.Challenge;

public class Director {
    BuilderInterface myBuilder;

    public void construct(BuilderInterface builderInterface){
        myBuilder = builderInterface;
        myBuilder.buildBurger();
        myBuilder.buildDrink();
    }
}

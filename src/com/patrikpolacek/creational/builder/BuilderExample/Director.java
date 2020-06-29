package com.patrikpolacek.creational.builder.BuilderExample;

public class Director {
    BuilderInterface myBuilder;

    public void construct(BuilderInterface builderInterface){
        myBuilder = builderInterface;
        myBuilder.buildBody();
        myBuilder.insertWheels();
        myBuilder.addHeadlights();
    }

}

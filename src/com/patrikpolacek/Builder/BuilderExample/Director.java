package com.patrikpolacek.Builder.BuilderExample;

public class Director {
    BuilderInterface myBuilder;

    public void construct(BuilderInterface builderInterface){
        myBuilder = builderInterface;
        myBuilder.buildBody();
        myBuilder.insertWheels();
        myBuilder.addHeadlights();
    }

}

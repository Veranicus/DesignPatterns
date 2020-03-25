package com.patrikpolacek.Builder.BuilderExample;
//Steps for director
public interface BuilderInterface {
    void buildBody();

    void insertWheels();

    void addHeadlights();

    Product getVehicle();
}

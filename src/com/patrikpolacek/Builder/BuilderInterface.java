package com.patrikpolacek.Builder;
//Steps for director
public interface BuilderInterface {
    void buildBody();

    void insertWheels();

    void addHeadlights();

    Product getVehicle();
}

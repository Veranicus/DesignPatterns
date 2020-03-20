package com.patrikpolacek.Builder;

public class Car implements BuilderInterface {

    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("This is a body of a car");

    }

    @Override
    public void insertWheels() {
        product.add("4 wheels are added");

    }

    @Override
    public void addHeadlights() {
        product.add("2 headlights added");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}

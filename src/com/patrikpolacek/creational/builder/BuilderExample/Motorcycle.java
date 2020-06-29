package com.patrikpolacek.creational.builder.BuilderExample;

public class Motorcycle implements BuilderInterface {

    private Product product = new Product();
    @Override
    public void buildBody() {
        product.add("Added motorcycle body");
    }

    @Override
    public void insertWheels() {
        product.add("Added 2 wheels");
    }

    @Override
    public void addHeadlights() {
        product.add("Added 1 headlight");

    }

    @Override
    public Product getVehicle() {
        return product;
    }
}

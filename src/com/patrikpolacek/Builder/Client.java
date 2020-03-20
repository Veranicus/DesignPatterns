package com.patrikpolacek.Builder;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        BuilderInterface carBuilder = new Car();
        BuilderInterface motorBuilder = new Motorcycle();

        director.construct(carBuilder);
        Product product1 = carBuilder.getVehicle();
        product1.show();

        director.construct(motorBuilder);
        Product product2 = motorBuilder.getVehicle();
        product2.show();
    }
}

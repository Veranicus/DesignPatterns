package com.patrikpolacek.structural.bridge;

public class Client {

    public static void main(String[] args) {
        Vehicle vehicle1 = new Car(new Produce(), new Assembly());
        vehicle1.manufacture();

        Vehicle vehicle2 = new Bike(new Produce(), new Assembly());
        vehicle2.manufacture();
    }


//    we can change produce and assembly at runtime
//    vehicle and bike are abstracted from worksop(implementers)
}

package com.patrikpolacek.creational.prototype.challenge;

import java.util.Hashtable;

public class BasicCarCache {

    private static Hashtable<String, BasicCar> basicCarHasTable = new Hashtable<>();

    public static BasicCar getBasicCar(String name){
        BasicCar cachedBasicCar = basicCarHasTable.get(name);
        return (BasicCar) cachedBasicCar;
    }

    public static void loadBasicCars(){
        Ford ford = new Ford();
        basicCarHasTable.put("1", ford);

        Nano nano = new Nano();
        basicCarHasTable.put("2", nano);
    }
}

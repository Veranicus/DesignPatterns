package com.patrikpolacek.singleton.synchronization_approach_example;

public class Singleton {

    //    the private reference to one and only instance
    private static Singleton uniqueInstance;

    //    an instance attribute
    private int data = 0;

    //    Private constructor, it can never be called !
    private Singleton() {
    }
//Only difference from lazy initialization, only one active thread at a time
//    can get instance of singleton
    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

//    add a set data here

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }
}

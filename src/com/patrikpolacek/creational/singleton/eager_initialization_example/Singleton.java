package com.patrikpolacek.creational.singleton.eager_initialization_example;

public class Singleton {

    //    the private reference to one and only instance
    private static Singleton uniqueInstance = new Singleton();

    //    an instance attribute
    private int data = 0;

    //    Private constructor, it can never be called !
    private Singleton() {
    }

    public static Singleton getInstance() {
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

package com.patrikpolacek.creational.singleton.double_checked_locking_example;

public class Singleton {

    //    the private reference to one and only instance
    private volatile static Singleton uniqueInstance;

    //    an instance attribute
    private int data = 0;

    //    Private constructor, it can never be called !
    private Singleton() {
    }
//we are using multithreading only once, then the instance is already
//    created
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
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

package com.patrikpolacek.creational.singleton.bill_pugh_approach;

public class Singleton {


    //    an instance attribute
    private int data = 0;

//    this class is loaded into memory after someone calls getInstance!
    private static class SingletonHelper {
        //        nested class is referenced after get instance is called
        private static final Singleton uniqueInstance = new Singleton();
    }

    //    Private constructor, it can never be called !
    private Singleton() {
    }

    public static Singleton getInstance() {
        return SingletonHelper.uniqueInstance;
    }

//    add a set data here

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }
}

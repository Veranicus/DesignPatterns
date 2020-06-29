package com.patrikpolacek.creational.singleton.synchronization_approach_example;

public class TestSingeton {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();

//        set the data value
        singleton.setData(25);

        System.out.println(singleton);
        System.out.println(singleton.getData());
        singleton = null;
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2);
        System.out.println(singleton2.getData());

//Problem with performance, we can have huge bottleneck
//        after creating first instance, we dont need synchronization
    }
}

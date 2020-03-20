package com.patrikpolacek.singleton.double_checked_locking_example;

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

//doesnt work in java 1.4 or sooner
    }
}

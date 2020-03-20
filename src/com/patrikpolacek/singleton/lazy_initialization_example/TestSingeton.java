package com.patrikpolacek.singleton.lazy_initialization_example;

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

//        why is this lazy ? We make instance after we need to use it
//        isn't thread safe
//        if its stateles, when it has to members, like data in our case
//        then its thread safe, but right now it is statefull
//        two instances in two separate threads, extremely hard to debug
    }
}

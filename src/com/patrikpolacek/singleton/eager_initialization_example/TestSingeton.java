package com.patrikpolacek.singleton.eager_initialization_example;

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

//        We use static initialization, JVM always creates instance
//        sometimes we don' need to create this instance all the time,
//        it depends how resource expensive is the singleton instance
//        database, file system....
    }
}

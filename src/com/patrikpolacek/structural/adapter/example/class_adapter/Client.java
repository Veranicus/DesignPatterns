package com.patrikpolacek.structural.adapter.example.class_adapter;

public class Client {

    public static void main(String[] args) {
        ClassAdapter classAdapter = new ClassAdapter();
        System.out.println("ClassAdapter returns: " + classAdapter.getInteger());

        ObjectAdapter objectAdapter = new ObjectAdapter(new IntegerValue());
        System.out.println("ObjectAdapter returns: " + objectAdapter.getInteger());

    }
}

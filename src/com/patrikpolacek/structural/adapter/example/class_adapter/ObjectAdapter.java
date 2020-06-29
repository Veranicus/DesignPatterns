package com.patrikpolacek.structural.adapter.example.class_adapter;

public class ObjectAdapter {
//    target interface
    private IntegerValueInterface integerValueInterface;

    public ObjectAdapter(IntegerValueInterface integerValueInterface) {
        this.integerValueInterface = integerValueInterface;
    }

    public int getInteger(){
        return 2 + integerValueInterface.getInteger();
    }
}

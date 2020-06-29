package com.patrikpolacek.creational.builder.Challenge;

public class Bottle implements Packing {
    @Override
    public void makeAction() {
        System.out.println("Bottling drink");
    }
}

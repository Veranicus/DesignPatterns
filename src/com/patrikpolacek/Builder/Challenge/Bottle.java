package com.patrikpolacek.Builder.Challenge;

public class Bottle implements Packing {
    @Override
    public void makeAction() {
        System.out.println("Bottling drink");
    }
}

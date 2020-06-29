package com.patrikpolacek.structural.adapter.example.composition;

public class MallarDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("fly");
    }
}

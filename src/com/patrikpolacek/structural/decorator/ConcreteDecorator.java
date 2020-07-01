package com.patrikpolacek.structural.decorator;

public class ConcreteDecorator extends AbstractDecorator {
    public void doJob() {
        super.doJob();

        // add additional responsibilities
        System.out.println("I am explicity from Ex_1");
    }
}

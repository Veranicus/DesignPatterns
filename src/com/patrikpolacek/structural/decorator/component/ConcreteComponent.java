package com.patrikpolacek.structural.decorator.component;

public class ConcreteComponent extends Component {
    @Override
    public void doJob() {
        System.out.println("I am from a Concrete Component - I am closed for modification");

    }
}
package com.patrikpolacek.structural.adapter.example.composition;

public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    //no quack inside turkey interface, we have to adapt it
    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
//        Turkeys fly only short distances, unlike ducks, we will
//        fly "5 times", to adapt turkey to duck, just example of
//        adapting the business logic to make two types compatible
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}

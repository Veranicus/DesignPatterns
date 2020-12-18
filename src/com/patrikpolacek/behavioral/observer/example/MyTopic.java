package com.patrikpolacek.behavioral.observer.example;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject {

    List<Observer> registeredObservers;
    private String message;
    private boolean changed;


    public MyTopic() {
        this.registeredObservers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        if (observer == null) {
            throw new NullPointerException();
        }
        if (!registeredObservers.contains(observer)) {
            registeredObservers.add(observer);
        }
    }

    @Override
    public void unregister(Observer observer) {
        registeredObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {

        List<Observer> observersLocal;

        if (changed){
            observersLocal = new ArrayList<>(registeredObservers);
            this.changed = false;
        }

        for (Observer observer : observersLocal){
            observer.update();
        }



    }

    @Override
    public Object getUpdate(Observer obj) {
        return null;
    }
}

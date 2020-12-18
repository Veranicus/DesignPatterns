package com.patrikpolacek.behavioral.observer.example;


public interface Subject {

    //    methods to register and unregister observers
    public void register(Observer observer);

    public void unregister(Observer observer);


    //    Method to notify observers of changes
    public void notifyObservers();

    //A way how to get informatiotn back from observers
    public Object getUpdate(Observer obj);
}

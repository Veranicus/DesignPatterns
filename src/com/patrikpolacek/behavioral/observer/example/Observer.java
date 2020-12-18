package com.patrikpolacek.behavioral.observer.example;

public interface Observer {

//    Method to update the observer used by subject
    public void update();

//    Attach witch subject to observer, not required but added
//    so that the observer can query the subject to see if an
//    update has occurred.
    public void setSubject(Subject subject);
}

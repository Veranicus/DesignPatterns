package com.patrikpolacek.behavioral.memento.challenge;

import java.util.Stack;

public class Caretaker {

    private Stack<Object> mementoObjects = new Stack<>();

    public void save(Originator originator){
        mementoObjects.add(originator.save());
    }

    public void undoToLastSave(Originator originator){
        if (!mementoObjects.empty()) {
            originator.undoToLastSave(mementoObjects.pop());
        }else System.out.printf("You cannot go back any further.");
    }

//    public void undoToSpecificSave(Originator originator, int index){
//        originator.undoToLastSave(mementoObjects.get(mementoObjects.size()));
//    }
}

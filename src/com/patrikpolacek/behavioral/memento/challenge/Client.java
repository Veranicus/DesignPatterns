package com.patrikpolacek.behavioral.memento.challenge;

public class Client {

    public static void main(String[] args) {

        Originator originator = new Originator(25,"John");

        Caretaker caretaker = new Caretaker();

        originator.write("London 25");
        caretaker.save(originator);

        originator.write("New Street Miami");

        caretaker.save(originator);

        originator.write("Bangkok 45");

        caretaker.save(originator);

        System.out.println(originator);

        caretaker.undoToLastSave(originator);
        System.out.println(originator);
        caretaker.undoToLastSave(originator);
        System.out.println(originator);
        caretaker.undoToLastSave(originator);
        System.out.println(originator);

        caretaker.undoToLastSave(originator);
        System.out.println(originator);


    }
}

package com.patrikpolacek.behavioral.memento.challenge;

public class Originator {

    private int age;

    private String name;

    private StringBuilder address;

    public Originator(int age, String name) {
        this.age = age;
        this.name = name;
        this.address = new StringBuilder();
    }

    public void write(String str) {
        address.append(str);
    }

    public Memento save() {
        return new Memento(this.age, this.name, this.address);
    }


    public void undoToLastSave(Object obj) {
        Memento memento = (Memento) obj;
        this.age = memento.age;
        this.name = memento.name;
        this.address = memento.address;
    }
    public void undoToSpecificSave(Object obj, int index) {
        Memento memento = (Memento) obj;
        this.age = memento.age;
        this.address = memento.address;
    }

    @Override
    public String toString() {
        return "Originator{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    private class Memento {
        private int age;

        private String name;

        private StringBuilder address;

        public Memento(int age, String name, StringBuilder address) {
            this.age = age;
            this.name = name;
            this.address = new StringBuilder(address);
        }
    }
}

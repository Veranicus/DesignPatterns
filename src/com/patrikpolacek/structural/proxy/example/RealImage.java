package com.patrikpolacek.structural.proxy.example;

public class RealImage implements Image {

    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk(filename);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + filename + " image.");
    }


    private void loadFromDisk(String filename) {
        System.out.println("Loading " + filename + " image from disk.");
    }
}

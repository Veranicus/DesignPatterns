package com.patrikpolacek.structural.proxy.example;

public class Client {

    public static void main(String[] args) {
        Image image = new ProxyImage("someFilename.jpeg");

//        Image will be loaded from disk
        image.display();
        System.out.println("*********");

        image.display();


    }
}

package com.patrikpolacek.structural.proxy.challenge;

public class RealInternet implements Internet {


    @Override
    public void connect(String hostname) {
        System.out.println("Connecting to " + hostname);
    }
}

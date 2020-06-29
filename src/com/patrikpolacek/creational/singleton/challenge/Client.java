package com.patrikpolacek.creational.singleton.challenge;

public class Client {
    public static void main(String[] args) {

        Captain captain = Captain.getSingleCaptainInstance();
        System.out.println(captain);
        Captain jack2 = Captain.getSingleCaptainInstance();
        System.out.println(jack2);
        
    }
}


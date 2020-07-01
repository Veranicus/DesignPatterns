package com.patrikpolacek.structural.proxy.challenge;

public class Client {

    public static void main(String[] args) throws Exception {
        Internet proxyInternet = new ProxyInternet();
        proxyInternet.connect("hi8.com");
    }
}

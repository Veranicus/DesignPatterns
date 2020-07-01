package com.patrikpolacek.structural.proxy.challenge;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {

    private RealInternet realInternet;
    private List<String> restrictedHostnames = new ArrayList<>();

    public ProxyInternet() {
        restrictedHostnames.add("hi.com");
        restrictedHostnames.add("hi5.com");
    }

    @Override
    public void connect(String hostname) throws Exception {
        if (realInternet == null){
            realInternet = new RealInternet();
        }
        for (String name : restrictedHostnames){
            if (hostname.equalsIgnoreCase(name)){
                throw  new Exception(hostname +  " is restricted");
            }
        }
        realInternet.connect(hostname);
    }
}

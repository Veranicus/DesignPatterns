package com.patrikpolacek.singleton.challenge;

public class Captain {

    private static class SingletonHelper {
        private static final Captain uniqueCapitanInstance = new Captain();
    }

    private Captain() {
        System.out.println("Captain Jack created");
    }

    public static Captain getSingleCaptainInstance() {
        return SingletonHelper.uniqueCapitanInstance;
    }
}

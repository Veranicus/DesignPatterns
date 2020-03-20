package com.patrikpolacek.abstractfactory.challenge.productFamily.bollywoodmovie;

public class BollywoodComedyMovie implements BollywoodMovie {

    @Override
    public void getName() {
        System.out.println("Inside " + this.getClass().getSimpleName() + "::getName() Method." +
                "The name of the movie is Action5");
    }
}

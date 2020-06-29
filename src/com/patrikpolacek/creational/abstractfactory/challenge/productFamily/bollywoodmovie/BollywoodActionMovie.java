package com.patrikpolacek.creational.abstractfactory.challenge.productFamily.bollywoodmovie;

public class BollywoodActionMovie implements BollywoodMovie {
    @Override
    public void getName() {
        System.out.println("Inside " + this.getClass().getSimpleName() + "::getName() Method." +
                "The name of the movie is Cassandro");
    }
}

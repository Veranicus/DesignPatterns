package com.patrikpolacek.creational.abstractfactory.challenge.productFamily.hollywoodmovie;

public class HollywoodActionMovie implements HollywoodMovie

{
    @Override
    public void getName() {
        System.out.println("Inside " + this.getClass().getSimpleName() + "::getName() Method." +
                "The name of the movie is Rambo 5");
    }
}

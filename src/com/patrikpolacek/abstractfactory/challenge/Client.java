package com.patrikpolacek.abstractfactory.challenge;

import com.patrikpolacek.abstractfactory.challenge.creator.AbstractFactory;
import com.patrikpolacek.abstractfactory.challenge.creator.FactoryProducer;
import com.patrikpolacek.abstractfactory.challenge.productFamily.hollywoodmovie.HollywoodMovie;

public class Client {
    public static void main(String[] args) {
        AbstractFactory hollywoodFactory = FactoryProducer.getFactory("hollywoodfactory");
        HollywoodMovie actionHollywoodMovie = hollywoodFactory.getHollywoodMovie("actionmovie");
        actionHollywoodMovie.getName();
    }
}

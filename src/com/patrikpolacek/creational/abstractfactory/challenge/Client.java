package com.patrikpolacek.creational.abstractfactory.challenge;

import com.patrikpolacek.creational.abstractfactory.challenge.creator.AbstractFactory;
import com.patrikpolacek.creational.abstractfactory.challenge.creator.FactoryProducer;
import com.patrikpolacek.creational.abstractfactory.challenge.productFamily.hollywoodmovie.HollywoodMovie;

public class Client {
    public static void main(String[] args) {
        AbstractFactory hollywoodFactory = FactoryProducer.getFactory("hollywoodfactory");
        HollywoodMovie actionHollywoodMovie = hollywoodFactory.getHollywoodMovie("actionmovie");
        actionHollywoodMovie.getName();
    }
}

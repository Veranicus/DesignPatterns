package com.patrikpolacek.creational.abstractfactory.challenge.creator;

import com.patrikpolacek.creational.abstractfactory.challenge.productFamily.bollywoodmovie.BollywoodMovie;
import com.patrikpolacek.creational.abstractfactory.challenge.productFamily.hollywoodmovie.HollywoodMovie;

public interface AbstractFactory {

    abstract BollywoodMovie getBollywoodMovie(String movieType);

    abstract HollywoodMovie getHollywoodMovie(String movieType);

}

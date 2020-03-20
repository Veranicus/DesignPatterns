package com.patrikpolacek.abstractfactory.challenge.creator;

import com.patrikpolacek.abstractfactory.challenge.productFamily.bollywoodmovie.BollywoodMovie;
import com.patrikpolacek.abstractfactory.challenge.productFamily.hollywoodmovie.HollywoodMovie;

public interface AbstractFactory {

    abstract BollywoodMovie getBollywoodMovie(String movieType);

    abstract HollywoodMovie getHollywoodMovie(String movieType);

}

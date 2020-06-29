package com.patrikpolacek.creational.abstractfactory.challenge.creator;

import com.patrikpolacek.creational.abstractfactory.challenge.productFamily.bollywoodmovie.BollywoodActionMovie;
import com.patrikpolacek.creational.abstractfactory.challenge.productFamily.bollywoodmovie.BollywoodComedyMovie;
import com.patrikpolacek.creational.abstractfactory.challenge.productFamily.bollywoodmovie.BollywoodMovie;
import com.patrikpolacek.creational.abstractfactory.challenge.productFamily.hollywoodmovie.HollywoodMovie;

public class BollywoodMovieFactory implements AbstractFactory {
    @Override
    public BollywoodMovie getBollywoodMovie(String movieType) {
        if (movieType.equalsIgnoreCase("ACTIONMOVIE")) {
            return new BollywoodActionMovie();
        } else if (movieType.equalsIgnoreCase("COMEDYMOVIE")) {
            return new BollywoodComedyMovie();
        } else return null;
    }

    @Override
    public HollywoodMovie getHollywoodMovie(String movieType) {
        return null;
    }
}

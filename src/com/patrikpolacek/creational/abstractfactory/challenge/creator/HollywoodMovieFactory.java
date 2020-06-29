package com.patrikpolacek.creational.abstractfactory.challenge.creator;

import com.patrikpolacek.creational.abstractfactory.challenge.productFamily.bollywoodmovie.BollywoodMovie;
import com.patrikpolacek.creational.abstractfactory.challenge.productFamily.hollywoodmovie.HollywoodActionMovie;
import com.patrikpolacek.creational.abstractfactory.challenge.productFamily.hollywoodmovie.HollywoodComedyMovie;
import com.patrikpolacek.creational.abstractfactory.challenge.productFamily.hollywoodmovie.HollywoodMovie;

public class HollywoodMovieFactory implements AbstractFactory {

    @Override
    public BollywoodMovie getBollywoodMovie(String movieType) {
        return null;
    }

    @Override
    public HollywoodMovie getHollywoodMovie(String movieType) {
        if (movieType.equalsIgnoreCase("ACTIONMOVIE")) {
            return new HollywoodActionMovie();
        } else if (movieType.equalsIgnoreCase("COMEDYMOVIE")) {
            return new HollywoodComedyMovie();
        } else return null;
    }
}

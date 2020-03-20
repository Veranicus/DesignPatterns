package com.patrikpolacek.abstractfactory.challenge.creator;

import com.patrikpolacek.abstractfactory.challenge.productFamily.bollywoodmovie.BollywoodMovie;
import com.patrikpolacek.abstractfactory.challenge.productFamily.hollywoodmovie.HollywoodActionMovie;
import com.patrikpolacek.abstractfactory.challenge.productFamily.hollywoodmovie.HollywoodComedyMovie;
import com.patrikpolacek.abstractfactory.challenge.productFamily.hollywoodmovie.HollywoodMovie;

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

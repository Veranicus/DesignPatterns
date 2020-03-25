package com.patrikpolacek.Builder.Challenge.burger;

import com.patrikpolacek.Builder.Challenge.Packing;
import com.patrikpolacek.Builder.Challenge.Wrapper;

import java.math.BigDecimal;

public class VegBurger extends Burger {

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal(19);
    }

    @Override
    public String getName() {
        return "Veggy Burger";
    }

    @Override
    public Packing getPackingType() {
        return new Wrapper();
    }
}

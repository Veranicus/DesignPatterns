package com.patrikpolacek.Builder.Challenge.burger;

import com.patrikpolacek.Builder.Challenge.Packing;
import com.patrikpolacek.Builder.Challenge.Wrapper;

import java.math.BigDecimal;

public class ChickenBurger extends Burger {

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal(14);
    }

    @Override
    public String getName() {
        return "Chicken Burger";
    }

    @Override
    public Packing getPackingType() {
        return new Wrapper();
    }
}

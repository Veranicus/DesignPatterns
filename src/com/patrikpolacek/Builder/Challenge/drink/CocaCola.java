package com.patrikpolacek.Builder.Challenge.drink;

import com.patrikpolacek.Builder.Challenge.Bottle;
import com.patrikpolacek.Builder.Challenge.Packing;

import java.math.BigDecimal;

public class CocaCola extends ColdDrink {

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal(10);
    }

    @Override
    public String getName() {
        return "Coca Cola";
    }

    @Override
    public Packing getPackingType() {
        return new Bottle();
    }


}

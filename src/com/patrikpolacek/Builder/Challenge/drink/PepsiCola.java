package com.patrikpolacek.Builder.Challenge.drink;

import com.patrikpolacek.Builder.Challenge.Bottle;
import com.patrikpolacek.Builder.Challenge.Packing;

import java.math.BigDecimal;

public class PepsiCola extends ColdDrink {

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal(5);
    }

    @Override
    public String getName() {
        return "Pepsi";
    }

    @Override
    public Packing getPackingType() {
        return new Bottle();
    }
}

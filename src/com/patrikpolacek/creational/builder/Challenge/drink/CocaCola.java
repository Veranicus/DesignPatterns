package com.patrikpolacek.creational.builder.Challenge.drink;

import com.patrikpolacek.creational.builder.Challenge.Bottle;
import com.patrikpolacek.creational.builder.Challenge.Packing;

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

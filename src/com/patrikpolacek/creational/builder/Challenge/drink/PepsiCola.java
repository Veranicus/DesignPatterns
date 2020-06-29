package com.patrikpolacek.creational.builder.Challenge.drink;

import com.patrikpolacek.creational.builder.Challenge.Bottle;
import com.patrikpolacek.creational.builder.Challenge.Packing;

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

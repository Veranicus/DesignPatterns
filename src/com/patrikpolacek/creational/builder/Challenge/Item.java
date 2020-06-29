package com.patrikpolacek.creational.builder.Challenge;

import java.math.BigDecimal;

public interface Item {
    BigDecimal getPrice();
    String getName();
    Packing getPackingType();

}

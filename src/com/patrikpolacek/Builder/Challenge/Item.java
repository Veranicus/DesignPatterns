package com.patrikpolacek.Builder.Challenge;

import java.math.BigDecimal;

public interface Item {
    BigDecimal getPrice();
    String getName();
    Packing getPackingType();

}

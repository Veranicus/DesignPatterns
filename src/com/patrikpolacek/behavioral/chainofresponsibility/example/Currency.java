package com.patrikpolacek.behavioral.chainofresponsibility.example;

import java.math.BigDecimal;

public class Currency {

    private BigDecimal amount;

    public Currency(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}

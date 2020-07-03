package com.patrikpolacek.behavioral.chainofresponsibility.example;

import java.math.BigDecimal;

public class Dollar50Dispensor implements DispenseChain {

    private DispenseChain dispenseChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.dispenseChain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        BigDecimal baseCurrency = new BigDecimal(50);
        if (currency.getAmount().compareTo(baseCurrency) >= 0) {
            BigDecimal num = currency.getAmount().divide(baseCurrency);
            BigDecimal remainder = currency.getAmount().remainder(baseCurrency);

            System.out.println("Dispensing " + num  + "50$ note");
            BigDecimal noRemainder = new BigDecimal(0);
            if ((remainder.compareTo(noRemainder)) != 0){
                this.dispenseChain.dispense(new Currency(remainder));
            }
        }else {
            this.dispenseChain.dispense(currency);
        }
    }
}

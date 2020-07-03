package com.patrikpolacek.behavioral.chainofresponsibility.example;
//We have three types of currensy so three dispense chains, if one can it will if not
//it sets next chain to another dispensor.
public interface DispenseChain {
    void setNextChain(DispenseChain nextChain);

    void dispense(Currency currency);

}

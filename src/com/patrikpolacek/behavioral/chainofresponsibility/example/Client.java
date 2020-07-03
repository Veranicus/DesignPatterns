package com.patrikpolacek.behavioral.chainofresponsibility.example;

import java.math.BigDecimal;
import java.util.Scanner;

//It's hard to create client, must be carefull
//Client responsible for that
public class Client {

    private DispenseChain dispenseChain1;

    public Client() {
        this.dispenseChain1 = new Dollar50Dispensor();
        DispenseChain dispenseChain2 = new Dollar20Dispensor();
        DispenseChain dispenseChain3 = new Dollar10Dispensor();

//        set the chain of responsibility
        dispenseChain1.setNextChain(dispenseChain2);
        dispenseChain2.setNextChain(dispenseChain3);
    }

    public static void main(String[] args) {
        Client atmDispensor = new Client();

        while (true){
            BigDecimal amount = new BigDecimal(0);
            BigDecimal baseAmount = new BigDecimal(10);
            System.out.println("Enter amount to dispense");
            Scanner input = new Scanner(System.in);
            amount = input.nextBigDecimal();
            BigDecimal noRemainder = new BigDecimal(0);
            if ((amount.remainder(baseAmount)).compareTo(noRemainder) != 0){
                System.out.println("Amount should be multiple of 10");
                return;
            }

//            process the request
            atmDispensor.dispenseChain1.dispense(new Currency(amount));
        }
    }
}

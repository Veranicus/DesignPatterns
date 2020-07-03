package com.patrikpolacek.behavioral.command.challenge;

public class BuyStockOrder implements Order {

    private OrderReceiver orderReceiver;

    public BuyStockOrder(OrderReceiver orderReceiver) {
        this.orderReceiver = orderReceiver;
    }

    @Override
    public void execute() {
        System.out.println("Buying Stock");
        orderReceiver.buyStock();
    }
}

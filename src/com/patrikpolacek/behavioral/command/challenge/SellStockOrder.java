package com.patrikpolacek.behavioral.command.challenge;

public class SellStockOrder implements Order {

    private OrderReceiver orderReceiver;

    public SellStockOrder(OrderReceiver orderReceiver) {
        this.orderReceiver = orderReceiver;
    }

    @Override
    public void execute() {
        System.out.println("Selling stock");
        orderReceiver.sellStock();
    }
}

package com.patrikpolacek.behavioral.command.challenge;

public class Client {

    public static void main(String[] args) {

        OrderReceiver orderReceiver = new OrderReceiverUtil().receiverOrder("sell");

        SellStockOrder sellStockOrder = new SellStockOrder(orderReceiver);

        OrderInvoker orderInvoker = new OrderInvoker(sellStockOrder);

        orderInvoker.execute();

    }
}

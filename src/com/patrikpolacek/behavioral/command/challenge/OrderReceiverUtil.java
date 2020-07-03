package com.patrikpolacek.behavioral.command.challenge;

public class OrderReceiverUtil {

    public static OrderReceiver receiverOrder(String command) {
        if (command.contains("sell")) {
            System.out.println("Sell order placed");
        }else {
            System.out.println("Buy order placed");
        }
        return new StockReceiver();
    }

}

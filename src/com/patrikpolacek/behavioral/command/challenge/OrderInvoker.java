package com.patrikpolacek.behavioral.command.challenge;

public class OrderInvoker {

    private Order order;

    public OrderInvoker(Order order) {
        this.order = order;
    }

    public void execute(){
        order.execute();
    }
}

package com.patrikpolacek.behavioral.mediator.challenge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class AuctionMediatorImpl implements AuctionMediator {

    List<Buyer> buyers;

    public AuctionMediatorImpl() {
        this.buyers = new ArrayList<>();
    }

    @Override
    public void addBuyers(Buyer buyer) {
        buyers.add(buyer);
    }

    @Override
    public void sendWinningMessage(String msg, Buyer buyer) {
        for (Buyer b: buyers){
//            message should not be send to ourselves
            if (b != buyer){
                b.receiveMessage(msg);
            }else b.receiveMessage("I have won");
        }
    }

    @Override
    public Buyer determineWinner() {
        Buyer winningBuyer = buyers.stream()
                .max(Comparator.comparing(Buyer::getBid))
                .orElseThrow(NoSuchElementException::new);;
       String msg = winningBuyer.getName() + " has won";
        sendWinningMessage(msg,winningBuyer);
        return winningBuyer;
    }
}

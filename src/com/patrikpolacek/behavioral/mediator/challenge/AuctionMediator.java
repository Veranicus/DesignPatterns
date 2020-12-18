package com.patrikpolacek.behavioral.mediator.challenge;

public interface AuctionMediator {

    void addBuyers(Buyer buyer);

    void sendWinningMessage(String msg, Buyer buyer);

    Buyer determineWinner();
}

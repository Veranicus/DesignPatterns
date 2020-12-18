package com.patrikpolacek.behavioral.mediator.challenge;

public class Client {

    public static void main(String[] args) {
        AuctionMediator  auctionMediator = new AuctionMediatorImpl();

        Buyer buyer1 = new BuyerImpl(auctionMediator,"john",20);
        Buyer buyer2 = new BuyerImpl(auctionMediator,"Nella",8);
        Buyer buyer3 = new BuyerImpl(auctionMediator,"Mike",2);

        auctionMediator.addBuyers(buyer1);
        auctionMediator.addBuyers(buyer2);
        auctionMediator.addBuyers(buyer3);

//        auctionMediator.sendWinningMessage("He won",auctionMediator.determineWinner());

        auctionMediator.determineWinner();

//        buyer1.sendWinningMessage("fsfs");
    }

}

package com.patrikpolacek.behavioral.mediator.challenge;

public class BuyerImpl extends Buyer {

    public BuyerImpl(AuctionMediator auctionMediator, String name, int bid) {
        super(auctionMediator, name, bid);
    }


    @Override
    public void sendWinningMessage(String msg) {
        System.out.println("Sending " + msg);
        auctionMediator.sendWinningMessage(msg, this);
    }

    @Override
    public void receiveMessage(String msg) {
        System.out.println(name + " : " + msg);
    }

    @Override
    public void setBid(int bidValue) {
        super.setBid(bidValue);
    }

    @Override
    public void cancelBid() {
        super.setBid(0);
    }
}

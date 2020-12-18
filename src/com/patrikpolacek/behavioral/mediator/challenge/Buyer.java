package com.patrikpolacek.behavioral.mediator.challenge;

public abstract class Buyer {

    protected AuctionMediator auctionMediator;

    protected String name;

    private int bid;

    public Buyer(AuctionMediator auctionMediator, String name, int bid) {
        this.auctionMediator = auctionMediator;
        this.name = name;
        this.bid = bid;
    }

    public abstract void sendWinningMessage(String msg);

    public abstract void receiveMessage(String msg);

    public abstract void cancelBid();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Buyer buyer = (Buyer) o;

        if (bid != buyer.bid) return false;
        if (auctionMediator != null ? !auctionMediator.equals(buyer.auctionMediator) : buyer.auctionMediator != null)
            return false;
        return name != null ? name.equals(buyer.name) : buyer.name == null;
    }

    @Override
    public int hashCode() {
        int result = auctionMediator != null ? auctionMediator.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + bid;
        return result;
    }
}

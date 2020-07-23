package com.patrikpolacek.behavioral.Iterator.example;

public class NotificationCollection implements Collection {
    static final int MAX_ITEMS = 6;

    int numberOfItems = 0;

    Notification[] notificationList;

    public NotificationCollection() {
        notificationList = new Notification[MAX_ITEMS];
        addItem("testNot1");
        addItem("testNot2");
        addItem("testNot3");

    }

    @Override
    public Iterator createIterator() {
        return new NotificationIterator(notificationList);
    }

    public void addItem(String str) {
        Notification notification = new Notification(str);
        if (numberOfItems > MAX_ITEMS) {
            System.err.println("Full");
        } else {
            notificationList[numberOfItems] = notification;
            numberOfItems++;
        }

    }

}

package com.patrikpolacek.behavioral.Iterator.example;

public class Client {

    public static void main(String[] args) {
        NotificationCollection nc = new NotificationCollection();

        NotificationBar notificationBar = new NotificationBar(nc);

        notificationBar.printNotifications();
    }
}

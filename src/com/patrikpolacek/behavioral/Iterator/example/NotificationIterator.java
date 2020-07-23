package com.patrikpolacek.behavioral.Iterator.example;

public class NotificationIterator implements Iterator {

    Notification[] notificationList;

    private int position = 0;


    public NotificationIterator(Notification[] notificationList) {
        this.notificationList = notificationList;
    }

    @Override
    public boolean hasNext() {
        if (position > notificationList.length || notificationList[position] == null){
            return false;
        }else return true;
    }

    @Override
    public Object next() {
        Notification notification = notificationList[position];
        position += 1;
        return notification;
    }
}

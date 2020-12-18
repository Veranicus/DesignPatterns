package com.patrikpolacek.behavioral.mediator.example;

public class Client {

    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();

        User user1 = new UserImpl(mediator,"John");
        User user2 = new UserImpl(mediator,"Frank");
        User user3 = new UserImpl(mediator,"Diana");
        User user4 = new UserImpl(mediator,"Kama");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);


        user1.send("Hi All");


    }
}

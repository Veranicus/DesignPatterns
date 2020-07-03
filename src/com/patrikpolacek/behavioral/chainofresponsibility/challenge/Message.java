package com.patrikpolacek.behavioral.chainofresponsibility.challenge;

public class Message {
    String text;

    MessagePriority messagePriority;

    public Message(String text, MessagePriority messagePriority) {
        this.text = text;
        this.messagePriority = messagePriority;
    }

    public String getText() {
        return text;
    }

    public MessagePriority getMessagePriority() {
        return messagePriority;
    }
}

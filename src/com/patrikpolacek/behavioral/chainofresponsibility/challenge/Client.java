package com.patrikpolacek.behavioral.chainofresponsibility.challenge;

public class Client {


    private ErrorHandler errorHandler;

    public Client() {
        this.errorHandler = new FaxErrorHandler();
        ErrorHandler emailErrorHandler = new EmailErrorHandler();
        errorHandler.setNextHandler(emailErrorHandler);
    }

    public static void main(String[] args) {
        Client messager = new Client();
        IssueRiser issueRiser = new IssueRiser();
        issueRiser.setErrorHandler(messager.getErrorHandler());
        Message message = new Message("fax is broken", MessagePriority.HIGH);
        Message message2 = new Message("email is broken", MessagePriority.HIGH);
        Message message3 = new Message("fax is broken", MessagePriority.HIGH);
        issueRiser.raiseMessage(message);
        issueRiser.raiseMessage(message2);
        issueRiser.raiseMessage(message3);


    }

    public ErrorHandler getErrorHandler() {
        return errorHandler;
    }
}

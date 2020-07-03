package com.patrikpolacek.behavioral.chainofresponsibility.challenge;

public class IssueRiser {
    private ErrorHandler errorHandler;

    public void raiseMessage(Message message){
        this.errorHandler.handleError(message);
    }

    public void setErrorHandler(ErrorHandler errorHandler) {
        this.errorHandler = errorHandler;
    }

}

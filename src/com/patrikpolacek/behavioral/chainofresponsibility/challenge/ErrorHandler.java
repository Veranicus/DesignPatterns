package com.patrikpolacek.behavioral.chainofresponsibility.challenge;

public interface ErrorHandler {

    void setNextHandler(ErrorHandler errorHandler);

    void handleError(Message errorMessage);
}

package com.patrikpolacek.behavioral.chainofresponsibility.challenge;

public class EmailErrorHandler implements ErrorHandler {

    private ErrorHandler errorHandler;


    @Override
    public void setNextHandler(ErrorHandler errorHandler) {
        this.errorHandler = errorHandler;
    }

    @Override
    public void handleError(Message errorMessage) {
        if (errorMessage.getText().contains("email")) {
            System.out.println(this.getClass().getSimpleName() + " handles fax error with priority" +
                    errorMessage.getMessagePriority());
        } else System.out.println("No handler found for this exception.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmailErrorHandler that = (EmailErrorHandler) o;

        return errorHandler != null ? errorHandler.equals(that.errorHandler) : that.errorHandler == null;
    }

    @Override
    public int hashCode() {
        return errorHandler != null ? errorHandler.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "EmailErrorHandler{" +
                "errorHandler=" + errorHandler +
                '}';
    }
}

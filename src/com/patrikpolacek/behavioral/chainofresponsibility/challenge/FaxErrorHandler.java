package com.patrikpolacek.behavioral.chainofresponsibility.challenge;

public class FaxErrorHandler implements ErrorHandler {

    private ErrorHandler errorHandler;

    public FaxErrorHandler() {
    }

    @Override
    public void setNextHandler(ErrorHandler errorHandler) {
        this.errorHandler = errorHandler;
    }

    @Override
    public void handleError(Message errorMessage) {
        if (errorMessage.getText().contains("fax")) {
            System.out.println(this.getClass().getSimpleName() + " handles fax error with priority" +
                    errorMessage.getMessagePriority());
        } else errorHandler.handleError(errorMessage);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FaxErrorHandler that = (FaxErrorHandler) o;

        return errorHandler != null ? errorHandler.equals(that.errorHandler) : that.errorHandler == null;
    }

    @Override
    public int hashCode() {
        return errorHandler != null ? errorHandler.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "FaxErrorHandler{" +
                "errorHandler=" + errorHandler +
                '}';
    }
}

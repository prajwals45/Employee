package com.example.flipzone.Exception;

public class SystemException extends Exception {
    private Error error;

    public SystemException(Error error) {
        this.error = error;
    }

    public SystemException(String message, Error error) {
        super(message);
        this.error = error;
    }
}

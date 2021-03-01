package com.example.flipzone.Exception;

import lombok.Getter;

import java.util.Date;

@Getter
public class errorDetails {
    private final Date timestamp;
    private final String message;
    private final String details;

    public errorDetails(Date timestamp, String message, String details) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }
    public Date getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }
}
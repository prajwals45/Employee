package com.example.flipzone.Exception;

import org.springframework.http.HttpStatus;

public enum Error {

    IO_EXCEPTON(1, "Invalid Id", HttpStatus.BAD_REQUEST);

    private int errorCode;
    private String message;
    private HttpStatus httpStatus;

    Error(int errorCode, String message, HttpStatus httpStatus) {
        this.errorCode = errorCode;
        this.message = message;
        this.httpStatus = httpStatus;
    }

    private String getMessage() { return message;}
}

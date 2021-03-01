package com.example.flipzone.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class notFoundException extends Exception{

    public notFoundException(String message){
        super(message);
    }
}
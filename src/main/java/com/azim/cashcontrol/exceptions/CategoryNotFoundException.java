package com.azim.cashcontrol.exceptions;

public class CategoryNotFoundException extends Exception{
    public CategoryNotFoundException(String message) {
        super(message);
    }

    public CategoryNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}

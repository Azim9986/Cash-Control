package com.azim.cashcontrol.exceptions;

public class ExpenseExistsException extends Exception{
    public ExpenseExistsException(String message) {
        super(message);
    }

    public ExpenseExistsException(String message, Throwable cause) {
        super(message, cause);
    }
}

package com.cts.proxy;

public class UnauthorisedUserException extends Exception{
    public UnauthorisedUserException(String message) {
        super(message);
    }
}

package com.cts.proxy;


public interface Phone {

    void checkMessages() throws UnauthorisedUserException;
    void takePhotos();
    void makePhoneCall();
    void viewPhotos() throws UnauthorisedUserException;

}

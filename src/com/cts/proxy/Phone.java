package com.cts.proxy;

import javax.swing.*;

public interface Phone {

    void checkMessages() throws UnauthorisedUserException;
    void takePhotos();
    void makePhoneCall();
    void viewPhotos() throws UnauthorisedUserException;

}

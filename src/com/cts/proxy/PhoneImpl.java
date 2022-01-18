package com.cts.proxy;

public class PhoneImpl implements Phone{
    @Override
    public void checkMessages() throws UnauthorisedUserException {
        System.out.println("I've checked my messages. All good here!");
    }

    @Override
    public void takePhotos() {
        System.out.println("I've just taken some beautiful photos from the roof top");
    }

    @Override
    public void makePhoneCall() {
        System.out.println("Gotta call my mum and ask her about that recipe");
    }

    @Override
    public void viewPhotos() throws UnauthorisedUserException {
        System.out.println("Good memories right there!");
    }
}

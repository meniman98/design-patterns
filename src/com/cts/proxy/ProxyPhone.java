package com.cts.proxy;

public class ProxyPhone implements Phone {

    boolean isAuthorised = false;
    PhoneImpl phone;

    public ProxyPhone(int passcode) {
        if (passcode == 1234) {
            isAuthorised = true;
        }
        phone = new PhoneImpl();
    }

    @Override
    public void checkMessages() throws UnauthorisedUserException {
        if (isAuthorised) {
            phone.checkMessages();
        }
        else {
            throw new UnauthorisedUserException("Not authorised to check messages");
        }
    }

    @Override
    public void takePhotos() {
//        Authentication not required
        phone.takePhotos();
    }

    @Override
    public void makePhoneCall() {
//        Authentication not required
        phone.makePhoneCall();
    }

    @Override
    public void viewPhotos() throws UnauthorisedUserException {
        if (isAuthorised) {
            phone.viewPhotos();
        }
        else {
            throw new UnauthorisedUserException("Not authorised to view photos");
        }
    }
}

package com.cts;

import com.cts.proxy.ProxyPhone;
import com.cts.proxy.UnauthorisedUserException;
import com.cts.singleton.CarSingleton;

public class Main {
    public static void main(String[] args) {

        singletonSimulation();


        try {
            proxySimulation();
        } catch (UnauthorisedUserException e) {
            e.printStackTrace();
        }
    }

    private static void singletonSimulation() {
        CarSingleton audi = CarSingleton.getInstance();
        audi.setModel("A7");
        audi.setPrice(70000);
        audi.setColour("Grey");

        CarSingleton BMW = CarSingleton.getInstance();
    }

    private static void proxySimulation() throws UnauthorisedUserException {
//        Wrong passcode deliberately
        ProxyPhone unauthorisedProxyPhone = new ProxyPhone(9876);

//        This works fine because unauthorised users can still make phone calls
        unauthorisedProxyPhone.makePhoneCall();

//        This won't work because the user is unauthorised (
//        will throw an exception
//        unauthorisedProxyPhone.checkMessages();

        ProxyPhone authorisedProxyPhone = new ProxyPhone(1234);

//        Allowed for everyone
        authorisedProxyPhone.takePhotos();

//        Only allowed for authorised users
        authorisedProxyPhone.viewPhotos();
    }
}

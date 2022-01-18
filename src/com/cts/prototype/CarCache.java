package com.cts.prototype;

import java.util.Hashtable;

public class CarCache {

    private static Hashtable<Integer, Car> carMap = new Hashtable<>();

    public static Car getCar(Integer id) {
        Car cachedCar = carMap.get(id);
        return (Car) cachedCar.clone();
    }

    public static void loadCache() {
        Audi audi = new Audi();
        audi.setModel("A7");
        audi.setColour("Grey");
        audi.setPrice(100_000);
        audi.setId(1);

        BMW bmw = new BMW();
        bmw.setColour("Blue");
        bmw.setModel("M4");
        bmw.setPrice(70_000);
        bmw.setId(2);

        Mercedes mercedes = new Mercedes();
        mercedes.setColour("White");
        mercedes.setModel("CLS");
        mercedes.setPrice(80_000);
        mercedes.setId(3);

        carMap.put(audi.getId(), audi);
        carMap.put(bmw.getId(), bmw);
        carMap.put(mercedes.getId(), mercedes);


    }
}

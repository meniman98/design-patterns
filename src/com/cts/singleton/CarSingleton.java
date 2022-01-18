package com.cts.singleton;

import java.io.Serializable;

public class CarSingleton implements Serializable {
    private static final long serialVersionUID = 1L;
    private String model;
    private int price;
    private String colour;

    private CarSingleton() {

    }

    private static class CarSingletonHolder {
        public static final CarSingleton INSTANCE = new CarSingleton();
    }

    public static CarSingleton getInstance() {
        return CarSingletonHolder.INSTANCE;
    }

    protected Object readResolve() {
        return getInstance();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}

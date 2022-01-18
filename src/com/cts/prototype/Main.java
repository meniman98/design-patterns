package com.cts.prototype;

public class Main {
    public static void main(String[] args) {
        CarCache.loadCache();

        Car clonedAudi = (Audi) CarCache.getCar(1);
        System.out.println(clonedAudi);

        Car clonedBmw = (BMW) CarCache.getCar(2);
        System.out.println(clonedBmw);

        Car clonedMercedes = (Mercedes) CarCache.getCar(3);
        System.out.println(clonedMercedes);
    }
}

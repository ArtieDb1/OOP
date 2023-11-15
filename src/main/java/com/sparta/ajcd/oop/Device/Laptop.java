package com.sparta.ajcd.oop.Device;

public class Laptop extends Device{
    public Laptop(String brand, String model, double price, int memorySize, int screenSize) {
        super(brand, model, price, memorySize, screenSize);
    }

    @Override
    public void turnOn() {
        System.out.println("Laptop is turning on");
    }
    public void turnOn(String deviceBrand) {
        System.out.println(deviceBrand + "is turning on");
    }
}

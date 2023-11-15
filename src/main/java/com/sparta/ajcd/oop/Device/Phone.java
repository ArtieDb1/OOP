package com.sparta.ajcd.oop.Device;

public class Phone extends Device{
    public Phone(String brand, String model, double price, int memorySize, int screenSize) {
        super(brand, model, price, memorySize, screenSize);
    }

    @Override
    public void turnOn() {
        System.out.println("Phone is turning on");
    }
    public void turnOn(String deviceType) {
        System.out.println(deviceType + "is turning on");
    }
}

package com.sparta.ajcd.oop.Device;

public abstract class Device {

    private String brand;
    private String model;
    private double price;
    private int memorySize;
    private int screenSize;

    public Device(String brand, String model, double price, int memorySize, int screenSize) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.memorySize = memorySize;
        this.screenSize = screenSize;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", memorySize=" + memorySize +
                ", screenSize=" + screenSize +
                '}';
    }

    public void turnOn(){
        System.out.println("is showing loading screen");
    }


}

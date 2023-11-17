package com.sparta.ajcd.oop.Animals;

public class CatDog extends Cat implements Flyable{
    public CatDog(String name, String breed, int age) {
        super(name, breed, age);
    }

    @Override
    void doSomething() {

    }

    @Override
    public void Fly() {
        System.out.println("CatDog is flying");
    }

    @Override
    public void Stop() {

    }

    @Override
    public int slowdown(int amount) {
        return 0;
    }
}

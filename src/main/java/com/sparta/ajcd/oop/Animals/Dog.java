package com.sparta.ajcd.oop.Animals;

public class Dog extends Animal{

    public Dog(String name, String breed, int age) {
        super(name, breed, age);
    }


    //play without overriding
    //when you dont override then you have 2 methods with the same name which is possible
    // this is called function overloading
    public void play(String toy) {

        System.out.println(getName() + " is playing with " + toy);
    }

    public void play(int toy) {

        System.out.println(getName() + " is playing with " + toy);
    }
}

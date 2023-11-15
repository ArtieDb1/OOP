package com.sparta.ajcd.oop.Animals;

public class Cat extends Animal {
    //encapsulation, determining what data one has access to and doesn't have access to
    //To change name you have to use a method to do it

    public Cat(String name, String breed, int age) {
        super(name, breed, age);

    }

    @Override
    public void play() {

        System.out.println("mmeeEEAOOOw ball of yarn");

    }
    /**
     *
     * when are setters better than constructors?
     * Setters are only for setting values
     * constructors are for initializing an object
     *
     * */
}

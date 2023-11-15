package com.sparta.ajcd.oop.ATMSimulator;

public class User {

    String userName;
    public int balance;

    public User(String userName, int balance) {
        this.userName = userName;
        this.balance = balance;
    }

    public void withdrawValue(int amount){
        balance -= amount;
    }
}

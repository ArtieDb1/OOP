package com.sparta.ajcd.oop;

import com.sparta.ajcd.oop.ATMSimulator.ATM;
import com.sparta.ajcd.oop.ATMSimulator.User;
import com.sparta.ajcd.oop.Animals.Cat;
import com.sparta.ajcd.oop.Animals.Dog;
import com.sparta.ajcd.oop.Device.Phone;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int amount = 0;


        User Artie = new User("Artie",1000);
        System.out.println("Welcome to the ATM");
        System.out.println("Your balance is: "+ Artie.balance);
        System.out.println("how much would you like to withdraw?");
        Scanner scanner = new Scanner(System.in);
        amount = scanner.nextInt();
        scanner.close();
        Artie.withdrawValue(amount);
        System.out.println("Your new Balance is: "+ Artie.balance);


        ATM.withdrawValue(amount);
        ATM.printStatement(ATM.amount);
        ATM.printRemaining();



    }


}

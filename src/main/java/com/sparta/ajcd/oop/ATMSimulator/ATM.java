package com.sparta.ajcd.oop.ATMSimulator;

public class ATM {
    static int numberOf50 = 12;
    static int numberOf20 = 20;
    static int numberOf10 = 50;
    static int numberOf5 = 100;
    static int numberOf2 = 250;
    static int numberOf1 = 500;
    int totalNotes;
    //Notes used after withdrawal
    static int count50 = 0;
    static int count20 = 0;
    static int count10 = 0;
    static int count5 = 0;
    static int count2 = 0;
    static int count1 = 0;

    public static int amount;

    public static void withdrawValue(int amount){

        ATM.amount = amount;
        int newDivisor;
        newDivisor = update50(amount);

        newDivisor = update20(newDivisor);

        newDivisor = update10(newDivisor);
        newDivisor = update5(newDivisor);
        newDivisor = update2(newDivisor);
        newDivisor = update1(newDivisor);


    }
    public static int update50(int amount){
        int quotient = amount/50;
        int remainder= amount%50;

        if (quotient > numberOf50){
            count50 = numberOf50;
            amount = amount - (count50 * 50);
            numberOf50 = 0;
            return amount;
        }

    else{
        numberOf50 -= quotient;
        count50 = quotient;
        amount = amount - (count50 * 50);
        if (amount/50 >= 1 && numberOf50 > 0)
            return remainder;
        else
            return amount;}
    };
    public static int update20(int amount){
        int quotient;
        int remainder;
        quotient = amount/20;
        remainder = amount%20;
        if (quotient > numberOf20){
            count20 = numberOf20;
            amount = amount - (numberOf20 * 20);
            numberOf20 = 0;
            return amount;
        }

        else{
            numberOf20 -= quotient;
            count20 = quotient;
            amount = amount - (count20 * 20);
            if (amount/20 >= 1 && numberOf20 > 0)
                return remainder;
            else
                return amount;}
    };
    public static int update10(int amount){
        int quotient;
        int remainder;
        quotient = amount/10;
        remainder = amount%10;
        if (quotient > numberOf10){
            count10 = numberOf10;
            amount = amount - (numberOf10 * 10);
            numberOf10 = 0;
            return amount;
        }

        else{
            numberOf10 -= quotient; //40 £10 left
            count10 = quotient; //
            amount = amount - (count10 * 10);
            if (amount/10 >= 1 && numberOf10 > 0)
                return remainder;
            else
                return amount;}
    };
    public static int update5(int amount){
        int quotient;
        int remainder;
        quotient = amount/5;
        remainder = amount%5;
        if (quotient > numberOf5){
            count5 = numberOf5;
            amount = amount - (numberOf5 * 5);
            numberOf5 = 0;
            return amount;
        }

        else{
            numberOf5 -= quotient;
            count5 = quotient;
            amount = amount - (count5 * 5);
            if (amount/5 >= 1 && numberOf5 > 0)
                return remainder;
            else
                return amount;}
    };
    public static int update2(int amount){
        int quotient;
        int remainder;
        quotient = amount/2; //1
        remainder = amount%2; //1
        if (quotient > numberOf2){
            count2 = numberOf2;
            amount = amount - (numberOf2 * 2);
            numberOf2 = 0;
            return amount;
        }

        else{
            numberOf2 -= quotient;
            count2 = quotient;
            amount = amount - (count2 * 2);
            if (amount/2 >= 1 && numberOf2 > 0)
                return remainder;
            else
                return amount;}
    };
    private static int update1(int amount){
        int quotient;
        int remainder;
        quotient = amount/2;
        remainder = amount%2;
        numberOf1 -=1;
        numberOf1 -= quotient;
        count1 = remainder;

            return remainder;

    };
    public int getTotalNotes() {
        totalNotes = numberOf1+numberOf2+numberOf5+numberOf10+numberOf20+numberOf50;
        return totalNotes;
    }
    public static int getNumberOf50() {
        return numberOf50;
    }
    public static void printStatement(int amount){
        System.out.println("Customer withdraws £" + amount + "\n");

        if (count50>0){
            System.out.println(count50 + "x £50");
        }
        if (count20>0){
            System.out.println(count20 + "x £20");
        }
        if (count10>0){
            System.out.println(count10 + "x £10");
        }
        if (count5>0){
            System.out.println(count5 + "x £5");
        }
        if (count2>0){
            System.out.println(count2 + "x £2");
        }
        if (count1>0){
            System.out.println(count1 + "x £1");
        }


    }

    public static void printRemaining(){;
        System.out.println("Here is the remaining content in this machine:");
        System.out.println("50: " + numberOf50);
        System.out.println("20: " + numberOf20);
        System.out.println("10: " + numberOf10);
        System.out.println("5: " + numberOf5);
        System.out.println("2: " + numberOf2);
        System.out.println("1: " + numberOf1);
    };


}


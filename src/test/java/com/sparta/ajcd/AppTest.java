package com.sparta.ajcd;

import static org.junit.Assert.assertTrue;

import com.sparta.ajcd.oop.ATMSimulator.ATM;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;


public class AppTest
{


    @Test
    @DisplayName("Checks that notes Available is correct after a withdrawal")
    public void checksThatAvailable50Is12(){
        Assert.assertEquals(12,ATM.getNumberOf50());
    }

    @Test
    @DisplayName("Checks that when withdrawing 203 deducts the correct amount")
    public void checksTotalAfter20isCorrect(){
        Assert.assertEquals(3,ATM.update20(203));
    }

    @Test
    @DisplayName("Checks that when withdrawing 103 deducts the correct amount ")
    public void checksTotalAfter10isCorrect(){
        Assert.assertEquals(3,ATM.update10(103));
    }

    @Test
    @DisplayName("Checks that when withdrawing 1003 deducts the correct amount ")
    public void checksTotalAfter5isCorrect(){
        Assert.assertEquals(4,ATM.update5(19));
    }

    @Test
    @DisplayName("Checks that when withdrawing 1003 deducts the correct amount ")
    public void checksTotalAfter2isCorrect(){
        Assert.assertEquals(1,ATM.update2(5));
    }




}

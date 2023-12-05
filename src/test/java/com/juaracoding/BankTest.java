package com.juaracoding;


import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTest {


    @Test
    public void checkBalance() {
        BankAccount bank = new BankAccount();
        bank.setAmount(10000);
        Assert.assertTrue(true);
        System.out.println("Balance is: " + bank.getAmount());
    }

    @Test
    public void display() {
        BankAccount bank = new BankAccount();
        bank.setAccount(12345,"BRI", 1250000);
        System.out.println("Account Bank = " + bank.getAcc_no() + " " + bank.getName() + " " + bank.getAmount());
    }
}



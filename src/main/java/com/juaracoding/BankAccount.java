package com.juaracoding;

public class BankAccount {

    private int acc_no;
    private String name;
    private double amount;
    private double amt;

    public double getAmt() {
        return amt;
    }

    public void setAmt(double amt) {
        this.amt = amt;
    }


    public int getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(int acc_no) {
        this.acc_no = acc_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public double setAmount(double amount) {
        this.amount = amount;
        return amount;
    }


    public void setAccount(int a, String n, double amt) {
        acc_no = a;
        name = n;
        amount = amt;
    }

    public double deposit(double amt) {
        amount = amount + amt;
        System.out.println(amt + " deposited");
        return amount;
    }


    public double withdraw(double amt) {
        if (amount < amt) {
            System.out.println("Insufficient Balance");
        } else {
            amount = amount - amt;
            System.out.println(amt + " withdrawn");
        }
        return amount;
    }

    public void checkBalance() {
        System.out.println("Balance is: " + amount);
    }

    public void display() {
        System.out.println(acc_no + " " + name + " " + amount);
    }
}

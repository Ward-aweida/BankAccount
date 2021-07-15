package com.example.bankaccount;

import java.util.Random;

public class BankAccount {
    // create attributs
    private double balance;
    private String accountNumber;
    private double cheekingBalance;
    private double SavingBalance;

    // declare the variable as a static int
    private static double numberOfAccount;
    private static int totalAmountOfMoney;

    // create private methods Randomly
    private double accountNumberRandom() {
        Random accountNumber = new Random();
        return accountNumber.nextDouble();
    }

    // create a constructor
    public BankAccount(String accountNumber, double cheekingBalance,double balance, double savingBalance) {
        this.accountNumber = accountNumber;
        this.balance=balance;
        this.cheekingBalance = cheekingBalance;
        this.SavingBalance = savingBalance;
        accountNumberRandom();
    }

    public double getCheekingBalance() {
        return cheekingBalance;
    }

    public void setCheekingBalance(double cheekingBalance) {
        this.cheekingBalance = cheekingBalance;
    }

    public double getSavingBalance() {
        return SavingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        SavingBalance = savingBalance;
    }

    public static double getTotalAmountOfMoney() {
        return totalAmountOfMoney;
    }

    public double DepostMony(double totalAmountOfMoney ) {
        double newBalance= balance-totalAmountOfMoney;
        balance=newBalance;
        return balance;

    }

    public double withdrawMoney(double totalAmountOfMoney) {
       double newBalnce = balance-totalAmountOfMoney;
       balance=newBalnce;
       return balance;
    }
    public void seeTotal(double totalAmountOfMoney){
        getTotalAmountOfMoney();

    }

}

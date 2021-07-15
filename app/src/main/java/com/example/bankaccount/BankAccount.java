package com.example.bankaccount;

import java.util.Random;

public class BankAccount {
    // create attributs
    private int size=0;
    private String accountNumber;
    private double cheekingBalance;
    private double SavingBalance;
    private BankAccount[]accounts;
    private static int account_count;
    // declare the variable as a static int
    private static double numberOfAccount;
    private static int totalAmountOfMoney;

    // create private methods Randomly
    private double accountNumberRandom() {
        Random accountNumber = new Random();
        return accountNumber.nextDouble();
    }

    // create a constructor
    public BankAccount(String accountNumber, double cheekingBalance, double savingBalance) {
        this.accountNumber = accountNumber;
        this.cheekingBalance = cheekingBalance;
        this.SavingBalance = savingBalance;
        accounts = new BankAccount[size];
        account_count++;
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



    public static void setTotalAmountOfMoney(int totalAmountOfMoney) {
        BankAccount.totalAmountOfMoney = totalAmountOfMoney;
    }

    public static int gettotalAmountOfMoney() {
        return totalAmountOfMoney;

    }

    public void checkDepostMony(double money ) {
       setCheekingBalance(getCheekingBalance()+money);
      setTotalAmountOfMoney((int) (gettotalAmountOfMoney()+money));
    }
    public void SavdDepositMony(double money){
       setSavingBalance(getSavingBalance()+ money);
       setTotalAmountOfMoney((int) (gettotalAmountOfMoney()+money));
    }

public  void   CheckwithdrawMoney(double mony){
        if (gettotalAmountOfMoney()<mony&& getCheekingBalance()<mony){
        }
        else{
            setCheekingBalance(getCheekingBalance()-mony);
            setTotalAmountOfMoney((int) (gettotalAmountOfMoney()-mony));
        }
}


    public void SavWithDaw(double money){
       if(gettotalAmountOfMoney() < money && getSavingBalance() < money){
       }
       else{
           setSavingBalance(getSavingBalance()- money);
            setTotalAmountOfMoney((int) (gettotalAmountOfMoney()- money));
        }
    }

    public void seeTotal(){
        gettotalAmountOfMoney();

    }

}

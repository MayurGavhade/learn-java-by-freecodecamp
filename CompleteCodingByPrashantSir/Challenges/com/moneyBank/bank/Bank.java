package com.moneyBank.bank;

public class Bank {
    private double balance;
    private int accountNumber;
    private String accountHolderName;

    public Bank(String accountHolderName,int accountNumber) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }
    public Bank(String accountHolderName,double balance,int accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    public String withdraw(int amount) {
        if(amount <= this.balance && amount > 0) {
            this.balance = this.balance - amount;
        } else {
            return "\n You did not have sufficient amount of money in account";
        }
        return "\n The remaining amount is: " + this.balance;
    }

    public String deposit(int amount) {
        this.balance = this.balance + amount;
        return "\n The new amount is: " + this.balance;
    }

    public void getInfo() {
        StringBuilder info = new StringBuilder();
        info.append("\n The account holder name is ").append(accountHolderName);
        info.append("\n The account number is ").append(accountNumber);
        info.append("\n The balance in account is ").append(balance);
        System.out.print(info);
    }
}

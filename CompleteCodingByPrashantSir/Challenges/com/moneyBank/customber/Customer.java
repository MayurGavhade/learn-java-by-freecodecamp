package com.moneyBank.customber;

import com.moneyBank.bank.Bank;

public class Customer {
    public static void main(String[] args) {
        Bank user1;
        user1 = new Bank("Mayur Gavhade",10000,62612055);
        user1.getInfo();
        System.out.println(user1.withdraw(200));
        System.out.println(user1.deposit(10));
        System.out.println(user1.withdraw(2000000));
    }
}

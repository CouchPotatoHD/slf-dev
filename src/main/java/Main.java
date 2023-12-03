package org.ismaylov;

import account.Account;
import account.IAccount;

public class Main {
    public static void main(String[] args) {

        IAccount account = new Account();

        int balance = account.getBalance();

        System.out.println(balance);
        int amountToAdd = 100;
        account.deposit(amountToAdd);

        System.out.println(account.getBalance());

        account.printStatement();

        account.withdraw(25);

        account.withdraw(100);

        account.printStatement();

    }
}
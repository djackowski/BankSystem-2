package main.java;

import main.java.products.BankAccount;

public class Bank {

    public static void main(String[] args) {
        BankAccount firstAccount = new BankAccount(1203);
        BankAccount secondAccount = new BankAccount(1204);
        firstAccount.getOperationService().deposit(1200);
        firstAccount.getOperationService().withdraw(1000);
        firstAccount.getOperationService().transfer(120, secondAccount);

        int firstAccountBalance = firstAccount.getBalance();
        int secondAccountBalance = secondAccount.getBalance();

        System.out.println("First balance = " + firstAccountBalance + " Second balance = " + secondAccountBalance);
        System.out.println("Date: " + firstAccount.getCreatedDate());

        History history = firstAccount.getHistory();
        System.out.println("History: " + history.getOperationList());

    }
}

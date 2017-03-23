package main.java.operations;

import main.java.products.BankAccount;

public class TransferOperation implements Operation {
    @Override
    public void execute() {
        System.out.println("Transfer operation");
    }

    void transfer(BankAccount fromAccount, int amount, BankAccount toAccount) {
        int firstAccountBalance = fromAccount.getBalance();
        int firstAccountResultBalance = firstAccountBalance - amount;
        fromAccount.setBalance(firstAccountResultBalance);
        int secondAccountBalance = toAccount.getBalance();
        int secondAccountResultBalance = secondAccountBalance + amount;
        toAccount.setBalance(secondAccountResultBalance);
    }

    @Override
    public String toString() {
        return "TransferOperation";
    }
}

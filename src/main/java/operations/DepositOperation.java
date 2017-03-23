package main.java.operations;

import main.java.products.BankAccount;

public class DepositOperation implements Operation {
    @Override
    public void execute() {
        System.out.println("Deposit operation");
    }

    void deposit(BankAccount bankAccount, int amount) {
        int balance = bankAccount.getBalance();
        int resultBalance = balance + amount;
        bankAccount.setBalance(resultBalance);
    }

    @Override
    public String toString() {
        return "DepositOperation";
    }
}

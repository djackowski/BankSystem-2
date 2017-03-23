package main.java.operations;

import main.java.products.BankAccount;

public class WithdrawOperation implements Operation {
    @Override
    public void execute() {
        System.out.println("Withdraw operation");
    }

    void withdraw(BankAccount bankAccount, int amount) {
        int balance = bankAccount.getBalance();
        int resultBalance = balance - amount;
        bankAccount.setBalance(resultBalance);
    }

    @Override
    public String toString() {
        return "WithdrawOperation";
    }
}

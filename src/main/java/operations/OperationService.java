package main.java.operations;

import main.java.products.BankAccount;

import static main.java.operations.OperationType.*;

public class OperationService {
    private final OperationFactory operationFactory = new OperationFactory();
    private final BankAccount bankAccount;

    public OperationService(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void deposit(int amount) {
        DepositOperation operation = (DepositOperation) operationFactory.create(DEPOSIT);
        operation.deposit(bankAccount, amount);
        bankAccount.getHistory().add(operation);
    }

    public void withdraw(int amount) {
        WithdrawOperation operation = (WithdrawOperation) operationFactory.create(WITHDRAW);
        operation.withdraw(bankAccount, amount);
        bankAccount.getHistory().add(operation);
    }

    public void transfer(int amount, BankAccount toAccount) {
        TransferOperation operation = (TransferOperation) operationFactory.create(TRANSFER);
        operation.transfer(bankAccount, amount, toAccount);
        bankAccount.getHistory().add(operation);
    }

}

package main.java.products;

import main.java.operations.OperationService;

import java.util.Calendar;
import java.util.Date;

public class BankAccount extends Account {

    private final int id;
    private int balance;
    private OperationService operationService;
    private Calendar createdDate;

    public BankAccount(int id) {
        this.id = id;
        operationService = new OperationService(this);
        createdDate = Calendar.getInstance();
    }

    public OperationService getOperationService() {
        return operationService;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Date getCreatedDate() {
        return createdDate.getTime();
    }


}

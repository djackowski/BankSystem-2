package tests;

import main.java.operations.OperationService;
import main.java.products.BankAccount;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OperationServiceTest {
    private OperationService operationService;
    private BankAccount bankAccount;

    @Before
    public void setUp() throws Exception {
        bankAccount = new BankAccount(0);
        operationService = new OperationService(bankAccount);
    }

    @After
    public void tearDown() throws Exception {
        bankAccount = null;
        operationService = null;
    }

    @Test
    public void whenDeposit_withSpecifiedAmount_getBalanceIncreasedByThisValue() {
        //When
        operationService.deposit(10);
        //Then
        int balance = bankAccount.getBalance();
        assertEquals(10, balance);
    }

    @Test
    public void whenWithdraw_withSpecifiedAmount_getBalanceDecreasedByThisValue() {
        //Given
        bankAccount.setBalance(30);
        //When
        operationService.withdraw(10);
        //Then
        int balance = bankAccount.getBalance();
        assertEquals(20, balance);
    }

    @Test
    public void whenTransfer_withSpecifiedAccount_getTargetAccountBalanceIncreasedBySpecifiedAmount() {
        //Given
        BankAccount toAccount = new BankAccount(1);
        bankAccount.setBalance(30);
        //When
        operationService.transfer(20, toAccount);
        //Then
        int firstBalance = bankAccount.getBalance();
        int secondBalance = toAccount.getBalance();
        assertEquals(10, firstBalance);
        assertEquals(20, secondBalance);
    }
}
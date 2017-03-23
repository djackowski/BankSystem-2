package main.java.operations;

public class OperationFactory {

    public Operation create(OperationType operationType) {
        Operation operation = null;
        switch (operationType) {
            case DEPOSIT:
                operation = new DepositOperation();
                break;
            case WITHDRAW:
                operation = new WithdrawOperation();
                break;
            case TRANSFER:
                operation = new TransferOperation();
                break;
        }
        return operation;
    }
}

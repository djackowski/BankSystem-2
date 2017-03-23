package main.java;

import main.java.operations.Operation;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<Operation> operationList = new ArrayList<>();

    public void add(Operation operation) {
        operationList.add(operation);
    }

    public List<Operation> getOperationList() {
        return operationList;
    }
}

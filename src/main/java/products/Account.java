package main.java.products;

import main.java.History;

public abstract class Account {
    private History history = new History();

    public History getHistory() {
        return history;
    }
}

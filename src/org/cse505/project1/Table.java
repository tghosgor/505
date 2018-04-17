package org.cse505.project1;

public class Table {
    public Table(int number) {
        this.number = number;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    public boolean getEmpty() {
        return empty;
    }

    private boolean empty;
    private int number;
}

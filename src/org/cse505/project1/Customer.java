package org.cse505.project1;

public class Customer {
    /**
     * Customer constructor.
     * @param id Unique id of this customer.
     * @param name Name of the customer.
     */
    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Makes the customer to sit to a table.
     * @param table Table to sit on.
     */
    public void sit(Table table) {
        assert this.table == null; // table should probably be empty at this point.

        this.table = table;
    }

    /**
     * Makes the customer to leave a table.
     */
    public void leave() {
        table = null;
    }

    public boolean confirmOrder() {
        return true;
    }

    /**
     * Sets the current order on the customer.
     * @param order Order to set.
     */
    public void addToBasket(Order order) {
        this.order = order;
    }

    private int id;
    String name;
    private Table table;
    private Order order;
}

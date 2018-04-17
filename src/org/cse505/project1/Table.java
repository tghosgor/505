package org.cse505.project1;

import java.util.ArrayList;

/**
 * The class that represents a table in the restaurant.
 */
public class Table {
    /**
     * Table constructor.
     * @param number The number of this table.
     * @param capacity The capacity of the table.
     */
    public Table(int number, int capacity) {
        this.number = number;
        this.capacity = capacity;
    }

    /**
     * Adds the given customer to the table.
     * @param customer Customer to add to the table.
     * @return true if added, false if not due to some problem (e.g. table capacity reached).
     */
    public boolean addCustomer(Customer customer) {
        if (customers.size() < capacity) {
            customers.add(customer);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Removes the i'th customer from the table.
     * @param i The customer to remove.
     * @return The removed customer if removed, null if i'th customer does not exist.
     */
    public Customer removeCustomer(int i) {
        try {
            return customers.remove(i);
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }

    /**
     * Gets the emptiness of the table.
     * @return true if table is empty, false if not.
     */
    public boolean isEmpty() {
        return customers.isEmpty();
    }

    private int number;
    private int capacity;
    private ArrayList<Customer> customers;
}

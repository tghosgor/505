package org.cse505.project1;

import java.util.ArrayList;

/**
 * The class that represents an order from a customer with many items.
 */
public class Order {
    private static int DEFAULT_PRIORITY = 0;

    /**
     * Constructor.
     *
     * Constructs an order with DEFAULT_PRIORITY.
     */
    public Order() {
        this.orderedItems = new ArrayList<>();
        this.priority = DEFAULT_PRIORITY;
    }

    /**
     * Order with a explicit priority.
     * @param priority Priority of this order. Lower values have higher priority.
     */
    public Order(int priority) {
        this.orderedItems = new ArrayList<>();
        this.priority = priority;
    }

    /**
     * Adds the given item to the order.
     * @param item Item to add.
     * @return true if added, false if not.
     */
    public boolean addItem(Item item) {
        assert item != null;
        orderedItems.add(item);
        return true;
    }

    /**
     * Removes the i'th item from the menu.
     * @param i The item index to remove.
     * @return The item removed if removed, null i'th item does not exist.
     */
    public Item removeItem(int i) {
        if (i < orderedItems.size())
            return orderedItems.remove(i);
        else
            return null;
    }

    /**
     * Clears all items from the order.
     */
    public void clearItems() {
        orderedItems.clear();
    }

    /**
     * Gets the i'th item from the orders.
     * @param i The item index to get.
     * @return The i'th item. null if it does not exist.
     */
    public Item getItem(int i) {
        if (i < orderedItems.size())
            return orderedItems.get(i);
        else
            return null;
    }

    /**
     * The priority of this order. Lower values mean higher priority.
     * @return Priority.
     */
    public int priority() {
        return priority;
    }

    private ArrayList<Item> orderedItems;
    int priority;
}

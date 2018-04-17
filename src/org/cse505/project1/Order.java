package org.cse505.project1;

import java.util.ArrayList;

public class Order {
    /**
     * Constructor.
     */
    public Order() {
        orderedItems = new ArrayList<>();
    }

    /**
     * Adds the given item to the order.
     * @param item Item to add.
     * @return true if added, false if not.
     */
    public boolean addItem(Item item) {
        orderedItems.add(item);
        return true;
    }

    /**
     * Removes the i'th item from the menu.
     * @param i The item index to remove.
     * @return The item removed if removed, null i'th item does not exist.
     */
    public Item removeItem(int i) {
        try {
            return orderedItems.remove(i);
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
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
     * @return The i'th item.
     */
    public Item getItem(int i) {
        return orderedItems.get(i);
    }

    private ArrayList<Item> orderedItems;
}

package org.cse505.project1;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Menu {
    /**
     * Menu constructor.
     */
    public Menu() {
        items = new ArrayList<>();

        stock = new TreeSet<>();
    }

    /**
     * Adds the given item to the menu.
     * @param item Item to add.
     * @return true if added, false if not.
     */
    public boolean addItem(Item item) {
        items.add(item);
        return true;
    }

    /**
     * Removes the i'th item from the menu.
     * @param i The item number to remove.
     * @return The removed item, null i'th item does not exist.
     */
    public Item removeItem(int i) {
        try {
            return items.remove(i);
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }

    /**
     * Gets the i'th item from the menu.
     * @param i The item number to get.
     * @return The item.
     */
    public Item getItem(int i) {
        return items.get(i);
    }

    /**
     * Replaces the i'th item in the menu with the given item.
     * @param i The item number to replace.
     * @param item Item to replace.
     * @return The item that was previously in the menu.
     */
    public Item setItem(int i, Item item) {
        return items.set(i, item);
    }

    private ArrayList<Item> items;
    private Set<Item> stock;
}

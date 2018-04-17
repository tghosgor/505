package org.cse505.project1;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

/**
 * The class that represents the menu.
 */
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
        assert item != null;
        items.add(item);
        return true;
    }

    /**
     * Removes the i'th item from the menu.
     * @param i The item number to remove.
     * @return The removed item, null i'th item does not exist.
     */
    public Item removeItem(int i) {
        if (i < items.size())
            return items.remove(i);
        else
            return null;
    }

    /**
     * Gets the i'th item from the menu.
     * @param i The item number to get.
     * @return The item. null if i'th item does not exist.
     */
    public Item getItem(int i) {
        if (i < items.size())
            return items.get(i);
        else
            return null;
    }

    /**
     * Replaces the i'th item in the menu with the given item.
     * @param i The item number to replace.
     * @param item Item to replace.
     * @return The item that was previously in the menu. null if could not replace.
     */
    public Item setItem(int i, Item item) {
        if (i < items.size())
            return items.set(i, item);
        else
            return null;
    }

    private ArrayList<Item> items;
    private Set<Item> stock;
}

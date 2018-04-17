package org.cse505.project1;

import java.util.ArrayList;
import java.util.Iterator;

public class Order {
    public Order() {
        orderedItems = new ArrayList<>();
    }

    public boolean addItem(Item item) {
        orderedItems.add(item);
        return true;
    }

    public boolean removeItem(Item item) {
        Iterator<Item> it = orderedItems.iterator();
        while (it.hasNext()) {
            Item orderedItem = it.next();

            if (orderedItem.equals(item)) {
                it.remove();
                return true;
            }
        }

        return false;
    }

    public void clearItems() {
        orderedItems.clear();
    }

    public Item getItem(int i) {
        return orderedItems.get(i);
    }

    private ArrayList<Item> orderedItems;
}

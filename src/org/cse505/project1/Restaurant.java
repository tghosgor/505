package org.cse505.project1;

import java.util.ArrayList;

public class Restaurant {
    /**
     * Restaurant constructor.
     * @param nTables The number of tables in the restaurant.
     */
    public Restaurant(int nTables) {
        tables = new Table[nTables];

        for (int i = 0; i < nTables; ++i) {
            // all tables have 4-customer capacity for now
            // maybe read table structure from a database?
            tables[i] = new Table(i + 1, 4);
        }
    }

    /**
     * Gets i'th menu.
     * @param i The menu to get.
     * @return The menu.
     */
    public Menu getMenu(int i) {
        return menuList.get(i);
    }

    /**
     * Replaces the i'th menu with the given menu.
     * @param i The menu index to replace.
     * @param menu The new menu.
     * @return The old menu, null if could not replace.
     */
    public Menu updateMenu(int i, Menu menu) {
        try {
            return menuList.set(i, menu);
        } catch (IndexOutOfBoundsException e) {
            // menu with index 'i' did not exist
            return null;
        }
    }

    /**
     * Add the given menu to the list of the menus.
     * @param menu Menu to add.
     * @return true if added, false if not.
     */
    public boolean addMenu(Menu menu) {
        menuList.add(menu);
        return true;
    }

    public void logReport() {
        ;
    }

    public void listCurrentOrders() {
        ;
    }

    public void orderInfo(Order order) {
        ;
    }

    private Table[] tables;
    private ArrayList<Menu> menuList;
}

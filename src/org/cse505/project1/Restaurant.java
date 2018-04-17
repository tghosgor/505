package org.cse505.project1;

import java.util.LinkedList;

public class Restaurant {
    public Restaurant(int nTables) {
        tables = new Table[nTables];

        for (int i = 0; i < nTables; ++i) {
            tables[i] = new Table(i + 1);
        }
    }

    public Menu getMenu(int i) {
        // TODO(hosgor): menuList should be array/hashmap for this to be faster
        return menuList.get(i);
    }

    public boolean updateMenu(int i, Menu menu) {
        try {
            menuList.set(i, menu);
            return true;
        } catch (IndexOutOfBoundsException e) {
            // menu with index 'i' did not exist
            return false;
        }
    }

    public Menu addMenu(Menu menu) {
        menuList.add(menu);
        return menu;
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
    LinkedList<Menu> menuList;
}

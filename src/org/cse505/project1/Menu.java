package org.cse505.project1;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Menu {
    public Menu() {
        items = new ArrayList<>();

        stock = new TreeSet<>();
    }

    private ArrayList<Item> items;
    private Set<Item> stock;
}

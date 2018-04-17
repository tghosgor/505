package org.cse505.project1;

public class MainDish extends Item {
    /**
     * Constructor for main dish.
     * @param name Name of the main dish.
     * @param description Description of the main dish.
     * @param price Price of the main dish.
     */
    public MainDish(String name, String description, double price) {
        super(name, description, price);
    }

    /**
     * No extra item can be added to main dish.
     * @param extra The extra to be added.
     * @return always false.
     */
    @Override
    public boolean modifyItem(ItemExtra extra) {
        // nothing else can be added to this
        return false;
    }
}

package org.cse505.project1;

/**
 * The class that represents the Dessert type of items.
 */
public class Dessert extends Item {
    /**
     * Dessert constructor.
     * @param name Name of the dessert.
     * @param description Description of the dessert.
     * @param price Original price of the dessert.
     */
    Dessert(String name, String description, Double price) {
        super(name, description, price);
    }

    /**
     * Dessert extra items filter.
     * @param extra
     * @return true if extra can be added, false if not.
     */
    @Override
    public boolean modifyItem(ItemExtra extra) {
        if (extra.getName() == "Dondurma") {
            // we can add Dondurma to Desserts.
            return true;
        }

        // nothing else can be added to this
        return false;
    }
}

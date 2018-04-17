package org.cse505.project1;

/**
 * The class that represents Beverage items.
 */
public class Beverage extends Item {
    /**
     * Beverage constructor.
     * @param name Name of the beverage.
     * @param description Description of the beverage.
     * @param price Original price of the beverage.
     */
    public Beverage(String name, String description, double price) {
        super(name, description, price);
    }

    /**
     * Beverage extra items filter.
     * @param extra
     * @return true if extra can be added, false if not.
     */
    @Override
    public boolean modifyItem(ItemExtra extra) {
        if (extra.getName() == "Super Size") {
            // beverage can be super-size
            return true;
        } if (extra.getName() == "Mega Size") {
            // beverage can be mega-size
            return true;
        }

        // nothing else can be added to this
        return false;
    }
}

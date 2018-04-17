package org.cse505.project1;

public abstract class Dessert extends Item {
    Dessert(String name, String description, Double price) {
        super(name, description, price);
    }

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

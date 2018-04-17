package org.cse505.project1;

public class ItemExtraMegaSize implements ItemExtra {
    @Override
    public String getName() {
        return "Super Size";
    }

    @Override
    public String getDescription() {
        return "";
    }

    /**
     * Costs 0.4 times the price of the original item
     * @param actualItem The item that this is being added.
     * @return The price modifier of the mega-size.
     */
    @Override
    public Double getPrice(Item actualItem) {
        return actualItem.getPrice() / 0.4;
    }
}

package org.cse505.project1;

public class ItemExtraSuperSize implements ItemExtra {
    @Override
    public String getName() {
        return "Mega Size";
    }

    @Override
    public String getDescription() {
        return "";
    }

    /**
     * Costs 0.2 times the price of the original item
     * @param actualItem The item that this is being added to.
     * @return The price modifier of the mega-size.
     */
    @Override
    public Double getPrice(Item actualItem) {
        return actualItem.getPrice() / 0.2;
    }
}

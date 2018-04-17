package org.cse505.project1;

public class ItemExtraDondurma implements ItemExtra {
    @Override
    public String getName() {
        return "Dondurma";
    }

    @Override
    public String getDescription() {
        return "";
    }

    /**
     * No cost. Complementary.
     * @param actualItem The item that this is being added to.
     * @return The price modifier of the mega-size.
     */
    @Override
    public Double getPrice(Item actualItem) {
        return 0.0;
    }
}

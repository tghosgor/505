package org.cse505.project1;

/**
 * The interface for the extras such as ice-cream that are added to items.
 */
public interface ItemExtra {
    /**
     * Gets the name of the extra.
     * @return The name of the extra.
     */
    String getName();

    /**
     * Gets the description of the extra.
     * @return The description of the extra.
     */
    String getDescription();

    /**
     * Gets the price of the extra.
     *
     * @param actualItem The item that this extra is being added to.
     * @return The cost of this extra.
     */
    Double getPrice(Item actualItem);
}

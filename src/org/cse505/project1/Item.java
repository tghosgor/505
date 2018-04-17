package org.cse505.project1;

import java.util.ArrayList;

public abstract class Item {
    /**
     * Constructor for the item.
     * @param name The name of the item.
     * @param description Description about the item.
     * @param price Original price of the item.
     */
    public Item(String name, String description, Double price) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.itemExtras = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the name of the item.
     * @return The name of the item.
     */
    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets the description for the item.
     * @return The description of the item.
     */
    public String getDescription() {
        return description;
    }

    /**
     * The original price of this item.
     * @return The original price.
     */
    public Double getPrice() {
        return price;
    }

    /**
     * Gets the total price with the added extras.
     * @return Total price with extras included.
     */
    public Double totalPrice() {
        Double total = price;

        for (ItemExtra extra : itemExtras)
            total += extra.getPrice(this);

        return total;
    }

    public boolean addExtra(ItemExtra extra) {
        boolean can_add = modifyItem(extra);

        if (can_add) {
            itemExtras.add(extra);
        }

        return can_add;
    }

    public abstract boolean modifyItem(ItemExtra extra);

    public ArrayList<ItemExtra> getItemExtras() {
        return itemExtras;
    }

    private String name;
    private String description;
    private Double price;
    ArrayList<ItemExtra> itemExtras;
}

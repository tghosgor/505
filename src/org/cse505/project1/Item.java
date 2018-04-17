package org.cse505.project1;

import java.util.ArrayList;

public abstract class Item {
    public Item(String name, String description, Double price) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.itemExtras = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public Double totalPrice() {
        Double total = price;

        for (ItemExtra extra : itemExtras)
            total += extra.getPrice();

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

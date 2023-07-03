package com.openclassrooms.store;

import java.util.HashMap;
import java.util.Map;

public class Inventory {

    public Map<Item, Integer> items;

    public Inventory() {
        items = new HashMap<>();
    }

    /**
     * add an Item and a quantity into the Map items variable.
     * @param item added Item
     * @param quantity added number
     */
    public void addItem(Item item, int quantity) {
        items.put(item, quantity);
    }

    /**
     * removes a quantity of an item within the Map items.
     * If the quantity to be removed is higher than the quantity in items, the value is set to 0.
     * @param item removed Item
     * @param quantity removed number
     */
    public void removeItem(Item item, int quantity) {
        if (quantity >= items.get(item)) {
            addItem(item, 0);
        } else {
            addItem(item, (items.get(item) - quantity));
        }
    }

    /**
     * display the total amount of different item from the inventory
     */
    public void displayInventoryOnConsole() {
        int mouseQuantity = 0;
        int screenQuantity = 0;

        for (Item item : items.keySet()) {
            if (item instanceof Mouse) {
                mouseQuantity += items.get(item);
            } else {
                screenQuantity += items.get(item);
            }
        }
        System.out.println("-".repeat(20));
        System.out.println("The Inventory contains: ");
        System.out.printf("%d mice and %d screens%n", mouseQuantity, screenQuantity);
    }

    /**
     * display all items and their quantity from the inventory
     */
    public void displayItemsOnConsole() {
        System.out.println("-".repeat(20));
        System.out.println("All Items from Inventory");
        items.forEach((item, quantity) -> {
            System.out.println("-".repeat(20));
            System.out.printf("%-20s quantity: %d%n", item, quantity);
        });
    }
}

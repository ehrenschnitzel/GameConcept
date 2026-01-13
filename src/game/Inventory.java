
package game;

import exceptions.InventoryFullException;

import datastructures.LinkedList;

public class Inventory {

    private LinkedList<Item> items;
    private static final int MAX_SIZE = 10;

    //TODO: Konstruktor

    public void addItem(Item item) throws InventoryFullException {
        if(items.size() >= MAX_SIZE) {
            throw new InventoryFullException("Inventar ist volL!");
        }
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public void printInventory() {
       items.print();
    }
}

package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.time.LocalDate;

public class Menu {
    private LocalDate lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu() {
        items = new ArrayList<>();
        lastUpdated = LocalDate.now();
    }

    public void addItem(MenuItem item) {
        items.add(item);
        lastUpdated = LocalDate.now();
    }
    public void removeItem(MenuItem item) {
        items.remove(item);
        lastUpdated = LocalDate.now();
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void printMenu() {
        System.out.println("Menu: ");
        for (MenuItem item : items) {
            System.out.println(item);
        }
        System.out.println("\nMenu last updated: " + getLastUpdated());
    }
}

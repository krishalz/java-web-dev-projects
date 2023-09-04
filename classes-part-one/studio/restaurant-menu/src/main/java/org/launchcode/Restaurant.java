package org.launchcode;
import java.util.Scanner;
public class Restaurant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();

        MenuItem frenchFries = new MenuItem(7.95, "Golden, crispy french fries", "Appetizer", false);
        MenuItem chickenKiev = new MenuItem(15.75, "Best chicken ever!", "Main Course", false);
        MenuItem chocCake = new MenuItem(5.69, "So much chocolate!", "Dessert", false);

        menu.addItem(frenchFries);
        menu.addItem(chickenKiev);
        menu.addItem(chocCake);

        //setting up a way to either print a single item or the whole menu, or enter add/remove items
        boolean continueInput = true;
        while (continueInput) {
            System.out.println("\nLast Updated: " + menu.getLastUpdated() + "\nWhat would you like to do? (Enter 1 -5) ");
            System.out.println("Single menu item (1), Whole menu (2), Add an item (3), Remove an item (4), or exit (5): ");
            int choice = input.nextInt();

            if (choice == 5) {
                continueInput = false;
                System.out.println("Bye for now!");
            } else if (choice == 1) {
                System.out.println("Enter description of item: ");
                input.nextLine();
                String desc = input.nextLine();
                //  System.out.println("item is: " + desc);
                singleItemPrint(menu, desc);
            } else if (choice == 2) {
                menu.printMenu();
            } else if (choice == 3) {
                addMenuItem(menu, input);

            } else if (choice == 4) {
                removeMenuItem(menu, input);
            } else {
           //     continueInput = false;
                System.out.println("Invalid choice.");
            }
        }
// compare two menu items to determine if they are equal


    }

    private static void singleItemPrint(Menu menu, String desc) {
        for (MenuItem item : menu.getItems()) {
            if (item.getDescription().equalsIgnoreCase(desc)) {
                System.out.println("Item chosen: " + item);
                return;
            }
        }
        System.out.println("Menu item not found.");
    }

    private static void addMenuItem(Menu menu, Scanner input) {
        input.nextLine();  // if there is a character to get rid of
        System.out.println("Enter item full description: ");
        String desc = input.nextLine();
        System.out.println("Enter price (dd.cc): ");
        double price = input.nextDouble();
        input.nextLine();
        System.out.println("Enter category (Appetizer, Main Course, Dessert) : ");
        String category = input.nextLine();
        System.out.println("Is this item new? (true or false): ");
        boolean isNew = input.nextBoolean();
        MenuItem newItem = new MenuItem(price, desc, category, isNew);

        //compare to see if it is equal to another menu item
        boolean isEqualItem = false;
        for (MenuItem menuItem : menu.getItems()) {
            if (menuItem.equals(newItem)) {
                isEqualItem = true;
            }
        }
       if (isEqualItem) {
           System.out.println("Two items are exactly the same.");
       }
        menu.addItem(newItem);
        menu.printMenu();

    }

    private static void removeMenuItem(Menu menu, Scanner input) {
        input.nextLine(); //remove leftover new line character
        System.out.println("Enter full description of item to remove: ");
        String desc = input.nextLine();
        for (MenuItem item : menu.getItems()) {
            if (item.getDescription().equalsIgnoreCase(desc)) {
                menu.removeItem(item);
                System.out.println("Item removed.");

                return;
            }
      //      System.out.println("Item not found.");
        }
    }
}

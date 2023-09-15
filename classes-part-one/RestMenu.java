public class RestMenu {

        public static void main(String[] args) {
            Menu menu = new Menu();

            MenuItem appetizer = new MenuItem(8.99, "Spinach Dip", Category.APPETIZER, true);
            MenuItem mainCourse = new MenuItem(16.99, "Grilled Salmon", Category.MAIN_COURSE, false);

            menu.addItem(appetizer);
            menu.addItem(mainCourse);

            System.out.println("Menu:");
            menu.printMenu();

            System.out.println("Is the " + appetizer.getDescription() + " new? " + appetizer.isNew());
            System.out.println("Last update: " + menu.getLastUpdated());

            menu.removeItem(appetizer);

            System.out.println("Updated Menu:");
            menu.printMenu();
        }

}

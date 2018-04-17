package org.cse505.project1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Restaurant r = new Restaurant(4);

        Menu drinkMenu = new Menu();
        drinkMenu.addItem(new Beverage("Su", "", 2));
        drinkMenu.addItem(new Beverage("Soda", "", 2.5));
        drinkMenu.addItem(new Beverage("Kola", "", 4));
        drinkMenu.addItem(new Beverage("Ayran", "", 4));
        r.addMenu(drinkMenu);

        Menu mealMenu = new Menu();
        mealMenu.addItem(new MainDish("İskender", "Bifteklik etten yapılmış döner ile", 20));
        mealMenu.addItem(new Dessert("Künefe", "Leziz özel peynir ile yapılmış künefe", 10.5));
        r.addMenu(mealMenu);

        /// These are just for testing purposes
        // will automatically create and hold customers
        Map<Integer, Customer> customers = new HashMap<>();
        // currently activated customer with the command 'customer'.
        Customer currentCustomer = null;
        // currently activated menu with the command 'menu'.
        Menu activeMenu = null;
        // current order
        Order currentOrder = null;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Waiting for input...");

        while (scanner.hasNext()) {
            System.out.print("Command: ");
            String line = scanner.nextLine();

            try {
                if (line.equals("version")) {

                    System.out.println("Version 0.0.1");

                } else if (line.startsWith("customer ")) { // active customer X

                    Integer id = Integer.parseInt(line.substring(9));
                    if (!customers.containsKey(id))
                        customers.put(id, new Customer(id, "Customer " + id));

                    currentCustomer = customers.get(id);

                    System.out.println("Customer " + id + " activated.");

                } else if (line.startsWith("menu ")) { // open the menu X

                    String menuParam = line.substring(5);

                    if (menuParam.equals("list")) {
                        if (activeMenu != null) {
                            int i = 0;
                            Item item;

                            while ((item = activeMenu.getItem(i++)) != null) {
                                System.out.print(item.getName());

                                if (!item.getDescription().isEmpty())
                                    System.out.print(": " + item.getDescription());

                                System.out.println(" - " + item.getPrice());
                            }
                        } else {
                            System.out.println("First, activate a menu with the command 'menu <NUMBER>'.");
                        }
                    } else {
                        Integer menuNumber = Integer.parseInt(menuParam);
                        activeMenu = r.getMenu(menuNumber);

                        System.out.println("Menu " + menuParam + " activated.");
                    }

                } else if (line.startsWith("order ")) {

                    String orderParam = line.substring(6);

                    if (orderParam.equals("create")) { // create a fresh order
                        currentOrder = new Order();

                        System.out.println("Created a fresh 'order'.");
                    } else if (orderParam.equals("basket")) {
                        if (currentCustomer != null) {
                            currentCustomer.addToBasket(currentOrder);

                            System.out.println("Added the order to customer's basket.");
                        } else {
                            System.out.println("First, activate a customer via command 'customer <ID>'.");
                        }
                    } else {
                        if (currentOrder != null) {
                            int menuItemIndex = Integer.parseInt(orderParam);

                            Item item = activeMenu.getItem(menuItemIndex);

                            if (item != null) {
                                currentOrder.addItem(item);

                                System.out.println("The item '" + item.getName() + "' has been added to the order.");
                            } else {
                                System.out.println("An item with the given index does not exist in the menu.");
                            }
                        } else {
                            System.out.println("First, create an order with the command 'order create'.");
                        }
                    }

                    //} else if (line.equals("help")) {
                } else {
                    System.out.println("Unknown command: '" + line + "'");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number given in command: '" + line + "'");
            }
        }

        System.out.println("Exiting...");
    }
}

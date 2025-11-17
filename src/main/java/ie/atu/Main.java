package ie.atu;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan1 = new Scanner(System.in);
        CustomerHandling customerHandling = new CustomerHandling();

        boolean running = true;
        while (running) {
            System.out.println("To select an option, please enter one of following numbers:");
            System.out.println("\"1\" to add a new customer");
            System.out.println("\"2\" to update an existing customer");
            System.out.println("\"3\" to display all customers");
            System.out.println("\"4\" to exit");
            int choice = scan1.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nYou selected to add a new customer\n");
                    customerHandling.addCustomer();
                    break;
                case 2:
                    System.out.println("\nYou selected to update an existing customer\n");
                    break;
                case 3:
                    System.out.println("\nDisplaying all customers:\n");
                    customerHandling.displayCustomers();
                    break;
                case 4:
                    System.out.println("\nExiting");
                    running = false;
                    break;
            }
        }
    }
}
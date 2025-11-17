package ie.atu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan1 = new Scanner(System.in);

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
                    break;
                case 2:
                    System.out.println("\nYou selected to update an existing customer\n");
                    break;
                case 3:
                    System.out.println("\nDisplaying all customers:\n");
                    break;
                case 4:
                    System.out.println("\nExiting");
                    running = false;
                    break;
            }
        }
//        List<Customer> customerList = new ArrayList<>();
//
//        System.out.println("Please enter number of entries: ");
//        int count = scan1.nextInt();
//        scan1.nextLine();
//
//        for (int i = 0; i < count; i++) {
//            System.out.println("Please enter customer ID: ");
//            String cusID = scan1.nextLine().trim();
//
//            for (int j = 0; j < customerList.size(); j++) {
//                while (customerList.get(j).getCustomerID().equals(cusID)) {
//                    System.out.println("Customer ID already exists, please enter a new one: ");
//                    cusID = scan1.nextLine().trim();
//                    j = 0;
//                }
//            }
//
//            System.out.println("Please enter customer name: ");
//            String cusName = scan1.nextLine().trim();
//
//            System.out.println("Please enter customer email: ");
//            String cusEmail = scan1.nextLine().trim();
//
//            System.out.println("Please enter customer phone number: ");
//            String cusPhone = scan1.nextLine().trim();
//
//            Customer customer1 = new Customer(cusID, cusName, cusEmail, cusPhone);
//            customerList.add(customer1);
//        }
//
//        for (Customer customer : customerList) {
//            System.out.println(customer);
//        }
    }
}
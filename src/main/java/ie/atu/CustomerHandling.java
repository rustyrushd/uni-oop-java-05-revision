package ie.atu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerHandling {
    List<Customer> customerList = new ArrayList<>();

    public void addCustomer() {
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Please enter customer ID: ");
        String cusID = scan2.nextLine().trim();

        // check if id exists and if true keep prompting for a unique id
        for (int j = 0; j < customerList.size(); j++) {
            while (customerList.get(j).getCustomerID().equals(cusID)) {
                System.out.println("Customer ID already exists, please enter a new one:");
                cusID = scan2.nextLine().trim();
                j = 0;
            }
        }

        System.out.println("Please enter customer name: ");
        String cusName = scan2.nextLine().trim();

        System.out.println("Please enter customer email: ");
        String cusEmail = scan2.nextLine().trim();

        System.out.println("Please enter customer phone number: ");
        String cusPhone = scan2.nextLine().trim();
        System.out.println();

        Customer customer1 = new Customer(cusID, cusName, cusEmail, cusPhone);
        customerList.add(customer1);
    }
}
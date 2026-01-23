package ie.uni.revision;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerHandling {
  List<Customer> customerList = new ArrayList<>();

  public void addCustomer(Scanner scan2) {
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

  public void updateCustomer(Scanner scan3) {
    Customer updatedCustomer = null;
    System.out.println("\nPlease enter customer ID:");
    String searchID = scan3.nextLine().trim();

    // check id and store object with that id
    for (Customer customer : customerList) {
      if (customer.getCustomerID().equals(searchID)) {
        System.out.println("Found customer ID: " + searchID);
        updatedCustomer = customer;
      }
    }
    // allow updates to found object
    if (updatedCustomer != null) {
      System.out.println("\nPlease enter new customer ID:");
      String newID = scan3.nextLine().trim();
      updatedCustomer.setCustomerID(newID);

      System.out.println("Please enter new customer name:");
      String newName = scan3.nextLine().trim();
      updatedCustomer.setCustomerName(newName);

      System.out.println("Please enter new customer email:");
      String newEmail = scan3.nextLine().trim();
      updatedCustomer.setCustomerEmail(newEmail);

      System.out.println("Please enter new customer phone number:");
      String newPhone = scan3.nextLine().trim();
      updatedCustomer.setCustomerPhone(newPhone);
    } else {
      System.out.println("Customer ID doesn't exist\n ");
    }
  }

  public void displayCustomers() {
    for (Customer customer : customerList) {
      System.out.println(customer);
    }
    System.out.println();
  }
}
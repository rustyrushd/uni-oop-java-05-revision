package ie.uni.revision;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan1 = new Scanner(System.in);
    CustomerHandling customerHandling = new CustomerHandling();

    boolean running = true;
    while (running) {
      System.out.println("""
          To select an option, please enter one of following numbers:\
          
          "1" to add a new customer\
          
          "2" to update an existing customer\
          
          "3" to display all customers\
          
          "4" to exit""");
      int choice = scan1.nextInt();

      switch (choice) {
        case 1:
          System.out.println("\nYou selected to add a new customer");
          customerHandling.addCustomer(scan1);
          break;
        case 2:
          System.out.println("\nYou selected to update an existing customer");
          customerHandling.updateCustomer(scan1);
          break;
        case 3:
          System.out.println("\nDisplaying all customers:");
          customerHandling.displayCustomers();
          break;
        case 4:
          System.out.println("\nExiting");
          running = false;
          break;
      }
    }
    scan1.close();
  }
}
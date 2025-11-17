package ie.atu;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please enter number of entries: ");
        int count = scan1.nextInt();
        scan1.nextLine();

        for (int i = 0; i < count; i++) {
            System.out.println("Please enter customer ID: ");
            String cusID = scan1.nextLine().trim();

            System.out.println("Please enter customer name: ");
            String cusName = scan1.nextLine().trim();

            System.out.println("Please enter customer email: ");
            String cusEmail = scan1.nextLine().trim();

            System.out.println("Please enter customer phone number: ");
            String cusPhone = scan1.nextLine().trim();

            Customer customer1 = new Customer(cusID, cusName, cusEmail, cusPhone);
            System.out.println(customer1);
        }
    }
}
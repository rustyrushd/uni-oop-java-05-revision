package ie.atu;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please enter customer ID: ");
        String cusID = scan1.nextLine().trim();
        System.out.println(cusID);

        System.out.println("Please enter customer name: ");
        String cusName = scan1.nextLine().trim();
        System.out.println(cusName);

        System.out.println("Please enter customer email: ");
        String cusEmail = scan1.nextLine().trim();
        System.out.println(cusEmail);

        System.out.println("Please enter customer phone number: ");
        String cusPhone = scan1.nextLine().trim();
        System.out.println(cusPhone);
    }
}
package day08_scanner_logical_operators;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the product:");
        String product = input.nextLine();
        System.out.println("Please enter the price:");
        double price = input.nextDouble();
        System.out.println("Please enter the quantity:");
        int quantity = input.nextInt();
        System.out.println("Please enter you name:");
        String name = input.next();

        double total = price * quantity;
        System.out.println(name+" your order for " +quantity+ " " +product + " has been placed.");
        System.out.println("Your total is: "+ total);



        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the product price:");
        double price = input.nextDouble();
        System.out.println("Please enter the product quantity:");
        int quantity = input.nextInt();
        double revenue = price * quantity;
        System.out.println(revenue);




    }
}

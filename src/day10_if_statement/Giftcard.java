package day10_if_statement;

import java.util.Scanner;

public class Giftcard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to buy:");
        String word = scanner.next();

        int giftcard = 100;
        if (word.equals("blanket")) {
            giftcard -= 60;
        } else if (word.equals("charger")) {
            giftcard -= 25;
        } else if (word.equals("hat")) {
            giftcard -= 25;
        } else if (word.equals("headphones")) {
            giftcard -= 30;
        } else if (word.equals("laptop")) {
            giftcard -= 200;
        } else if (word.equals("pants")) {
            giftcard -= 50;
        } else if (word.equals("pillow")) {
            giftcard -= 40;
        } else if (word.equals("smartphone")) {
            giftcard -= 100;
        } else if (word.equals("socks")) {
            giftcard -= 5;
        } else if (word.equals("usbcable")) {
            giftcard -= 10;
        }


        if (giftcard>=0) {
           System.out.println("Thank you for your purchase.\nYou balance is: " + giftcard);
       }else if (giftcard<=0) {
            System.out.println("you dont have enough money");
        }else{
            System.out.println("Invalid input");
        }







    }
}
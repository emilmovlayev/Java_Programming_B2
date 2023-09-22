package day10_if_statement;

import java.util.Scanner;

public class RealEstate {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("What is your budget:");
        int budget = scanner.nextInt();
        if(budget>=80000&&budget<=100000){
            System.out.println("Name-Hills\nAverage price:80,000-100,000\nRating-4.0\nGated-no\nAllow pets-yes");
        } else if (budget>=55000&&budget<=75000) {
            System.out.println("Name-Oaks\nAverage price:55,000-75,000\nRating-3.5\nGated-no\nAllow pets-yes");
        } else if (budget>=120000&&budget<=150000) {
            System.out.println("Name-Highland\nAverage price:120,000-150,000\nRating-4.5\nGated-no\nAllow pets-yes");
        } else if (budget>=160000&&budget<=201000) {
            System.out.println("Name-Canyon\nAverage price:160,000-201,000\nRating-4.8\nGated-no\nAllow pets-yes");
        }else if(budget>201000){
            System.out.println("Too much for this agency");
        }else if(budget<=0) {
            System.out.println("That is not a valid budget");
        }


    }
}

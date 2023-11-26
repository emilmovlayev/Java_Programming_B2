package day10_if_statement;

import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please enter your age:");
        int age = scanner.nextInt();
        if (age<=1){
            System.out.println("Infant");
        } else if (age>=3&&age<=5) {
            System.out.println("Toddler");
        } else if (age>=10&&age<=12) {
            System.out.println("Pre-Teen");
        } else if (age>=13&&age<=17) {
            System.out.println("Teenager");
        } else if (age>=18&&age<=20) {
            System.out.println("Young Adult");
        } else if (age>=21&&age<=35) {
            System.out.println("Adult");
        } else if (age>=36&&age<=54) {
            System.out.println("Middle-aged Adult");
        } else if (age>=55&&age<=75) {
            System.out.println("Citizen");
        } else  {
            System.out.println("Invalid entry");
        }


    }
}

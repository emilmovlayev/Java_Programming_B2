package day12_switch_statements;

import java.util.Scanner;

public class PersonalInformation {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.next();
        System.out.println("How many people do you live with?");
        byte num = scanner.nextByte();
        System.out.println(name+" lives with less than "+num+" people.");
        System.out.println("What city do you live?");
        String city = scanner.next();
        System.out.println("Do you live in downtown or not?");
        String yes = scanner.next();
        System.out.println("Have you thought about moving to the suburbs?");
        String yes2 = scanner.next();
        System.out.println("Do it.It is great.");
        System.out.println("What is your favorite animal?");
        String animal = scanner.next();
        System.out.println("WoW "+animal+ " is great animal");
        System.out.println("How many "+animal+ " would like have?");
        int num2 = scanner.nextInt();
        System.out.println("Interesting you want "+num2+" "+animal);










    }
}

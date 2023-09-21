package day09_scanner;

import java.util.Scanner;

public class Revenue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a price:");
        int num = scanner.nextInt();
        System.out.print("Enter a quantity of product:");
        int num2 = scanner.nextInt();
        int revenue = num*num2;
        System.out.println("Revenue is "+revenue);


        System.out.println("enter 3 angles:");
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        double total = num+num2+num3;
        boolean istri = total ==180;
        boolean iscir = total ==360;

        System.out.println("it is a tri:"+istri);
        System.out.println("it is a circle:"+iscir);



        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you age:");
        byte age = scanner.nextByte();
        System.out.println("Enter you favorite number:");
        long number = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Enter you favorite book:");
        String book = scanner.nextLine();

        System.out.println("You age is: "+age);
        System.out.println("You favorite number is: "+number);
        System.out.println("You favorite book is: "+book);


        Scanner scanner = new Scanner(System.in);
        System.out.println("what today is:");
        String day = scanner.nextLine();
        System.out.println("enter you name:");
        String name = scanner.next();

        System.out.println("today: " +day);
        System.out.println("name: " +name);








    }
}

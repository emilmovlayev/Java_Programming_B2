package day10_if_statement;

import java.util.Scanner;

public class FizzBuss {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        if (num%3==0&&num%5==0){
            System.out.println("FizzBuss");
        } else if (num%3==0) {
            System.out.println("Fizz");
        } else if (num%5==0) {
            System.out.println("Buss");
        }



        Scanner input =new Scanner(System.in);
        System.out.println("Enter your number:");
        int numm= scanner.nextInt();
        if (numm>=85&&numm<=100){
            System.out.println("You grade is: A");
        } else if (numm>=70&&numm<=84) {
            System.out.println("You grade is: B");
        } else if (numm>=55&&numm<=69) {
            System.out.println("You grade is: C");
        } else if (numm>=40&&numm<=54) {
            System.out.println("You grade is: D");
        }else {
            System.out.println("No grade..");
        }


    }
}

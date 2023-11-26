package day08_scanner_logical_operators;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a year:");
        int num = input.nextInt();
        boolean leap = num%4 ==0;
        System.out.println("The "+num+" is a Leap year:"+leap);
        System.out.println();



        Scanner inputt = new Scanner(System.in);
        System.out.println("Enter you age:");
        byte num1 = inputt.nextByte();
        System.out.println("Enter you favorite number:");
        long num2 = inputt.nextLong();
        boolean student = 18<=num1 && num1<=25;

        System.out.println("You are a student:"+student);









    }
}

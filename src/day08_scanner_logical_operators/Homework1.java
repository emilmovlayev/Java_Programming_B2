package day08_scanner_logical_operators;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num = input.nextInt();
        boolean divisible2 = num%2 ==0;
        boolean divisible3 = num%3 ==0;
        boolean divisible5 = num%5 ==0;

        System.out.println(num +" is divisible by 2: " + divisible2);
        System.out.println(num +" is divisible by 3: " + divisible3);
        System.out.println(num +" is divisible by 5: " + divisible5);




        Scanner inputt = new Scanner(System.in);
        System.out.println("Please enter an int number:");
        int numm = inputt.nextInt();
        boolean even = numm%2 ==0;
        boolean odd = !even;
        System.out.println(numm + " is even: "+ even);
        System.out.println(numm + " is odd: "+ odd);







    }
}

package day08_scanner_logical_operators;

import java.util.Scanner;

public class Testt {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = Scanner.nextInt();
        int num2 = 35;
        boolean speed = num>35;
        boolean sped = !speed;

        System.out.println("Speed limit is 35mph and yor are speeding: "+speed);




        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num1 = Scanner.nextInt();
        boolean young = num1<33;
        boolean old = !young;

        System.out.println("Your are young person:"+ young);
        System.out.println("Your are an old person:"+ old);



        int num = 9;
        boolean positive = num>0;
        boolean negative = num<0;

        System.out.println(num+ " is positive number: "+positive);
        System.out.println(num+ " is negative number: "+negative);








    }
}

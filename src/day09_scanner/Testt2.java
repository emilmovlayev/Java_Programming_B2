package day09_scanner;

import java.util.Scanner;

public class Testt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your current oxygen level of in you tank?");
        int num = scanner.nextInt();
        if (num>=90){
            System.out.println("Your tank is full!");
        }else if (num>=80){
            System.out.println("Still ok");
        }else if (num>=70){
            System.out.println("Do not go too far");
        }else if (num>=60){
            System.out.println("Start to head back");
        }else if (num>=50){
            System.out.println("Be careful now you are at 50%");
        }
        System.out.println();


        int firnum=4;
        int secnum=8;
        int thirnum=1;
        if (secnum>firnum&&secnum>thirnum) {
            System.out.println("Greatest num is of 4,8,1 is " + secnum);
        }
    }
}

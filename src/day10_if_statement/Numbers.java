package day10_if_statement;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter two number:");
        int num1= scanner.nextInt();
        int num2= scanner.nextInt();
        if(num1>num2){
            System.out.println(num1+ " is bigger than "+num2);
        } else if (num1<num2) {
            System.out.println(num1+ " is smaller than "+num2);
        } else if (num1==num2) {
            System.out.println(num1+ " is equal to "+num2);
        }


    }
}

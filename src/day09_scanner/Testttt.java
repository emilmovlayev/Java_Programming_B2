package day09_scanner;

import java.util.Scanner;

public class Testttt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a boolean value(true or false)");
        boolean answer = scanner.nextBoolean();
        boolean answer2 =!answer;

        if (answer!=answer2){
            System.out.println("The opposite of you what put is:"+answer2);
        }



        int x;
        int y=20;
        if (y==20){
            x=5;
            System.out.println(x);
        }
        int tem = 77;
        if (tem<=80 && 80>=tem ){
            System.out.println("Temp is ideal");
        }
        int b=50;
        int c=100;
        int a;
        if(b==50&&c>=100){
            a=20;
            System.out.println(a);
        }
        int f;
        boolean max = true;
        if (true){
            f=50;
            System.out.println(f);
        }




    }
}

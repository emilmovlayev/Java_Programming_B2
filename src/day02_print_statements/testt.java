package day02_print_statements;

import java.util.Scanner;

public class testt {
    public static void main(String[] args) {
       /* int year = 1941;
        System.out.println("In " + year + " Columbus sailed to the ocean blue");
        year = 1942;
        System.out.println("In " + year + " Columbus sailed to the ocean blue");
        year = 1944;
        System.out.println("In " + year + " Columbus came back from his trip");


        byte em = 10;
        double emm = 12.5;
        String emmm = "Java programming";

        System.out.println(em + "\n" + emm + "\n" + emmm);

        String job = "SDET";
        String city = "Boston";
        String name = "Saida";
        byte ess = 3;
        System.out.println("I am a " + job + " in " + city);
        System.out.println("I am a married with " + name + " and we have " + ess + " children");


        int a, b, c;
        a = 10;
        b = 20;
        c = a;
        a = b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        */


        int num=5;
        while (num>=1) {
            System.out.println(num);
            num--;
        }
        for (int i = 5; i >=1 ; i--) {
            System.out.println(i);
        }
        int num1=5;
        int result=1;
        while (num1>=1) {
            result*=num1;
            num1--;
        }
        System.out.println(result);

        int result1=1;
        for (int i = 5; i >=1 ; i--) {
            result1*=i;


        }
        System.out.println(result1);

        int num3=4;
        for (int i = 0; i <=10 ; i++) {
            System.out.println(num3+"*"+i+"="+(num3*i));
        }

    String word = "loop";
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }
        String word2 = "pool";
        for (int i = word2.length()-1; i >=0 ; i--) {
            System.out.println(word2.charAt(i));
        }




    }

}

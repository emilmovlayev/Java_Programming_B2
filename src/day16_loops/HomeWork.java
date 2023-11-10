package day16_loops;

import com.sun.source.tree.WhileLoopTree;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("please enter a number:");
        int num = scanner.nextInt();
        int result =1;
        while (num>=1){
            result*=num;
            num--;

        }
        System.out.println(result);


         char b='A';
         while (b<='Z'){
             System.out.println(b);
             b++;

         }
         char c='a';
         while (c<='z'){
             System.out.println(c);
             c++;
         }

         char d='A';
         while (d>='A'){
            System.out.println(d);
            d--;
        }

          char e = 'a';
         while (e>='a'){
             System.out.println(e);
             e--;

         }











    }

}

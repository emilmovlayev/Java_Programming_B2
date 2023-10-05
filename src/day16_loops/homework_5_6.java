package day16_loops;

import java.util.Scanner;

public class homework_5_6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int result=0;

        while(true){
             System.out.println("enter numbers please");
             int num1 = scanner.nextInt();
            if (num1<0){
                break;
            }

            result+=num1;

        }

       System.out.println(result);



        Scanner input =new Scanner(System.in);
        int secretnum = 17;
        int num=0;
        while (num!=secretnum){
            System.out.println("enter a number");
             num = input.nextInt();
             if (num>secretnum){
                 System.out.println("too high");
             } else if (num<secretnum) {
                 System.out.println("too low");
             }else {
                 System.out.println("COORECT ANSWER");
             }


        }






    }
}

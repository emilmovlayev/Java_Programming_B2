package day09_scanner;

import java.util.Scanner;

public class ifStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put you score:");
        int score = scanner.nextInt();
        System.out.println("Which attempt is:");
        int attempt = scanner.nextInt();
        if(attempt==1){
            score -= 0.10*score;
        }else if(attempt==2){
            score -=0.20*score;
        } else if (attempt==3){
            score -= 0.35*score;
        }
         System.out.println("After the "+attempt+" retake attempt, you score is " +score);




        Scanner scanner1 = new Scanner(System.in);
        System.out.println("What is your salary:");
        int salary = scanner1.nextInt();
        System.out.println("Are you full time?");
        boolean fulltime = scanner1.nextBoolean();

        if(fulltime){
            salary+=20000;
        }else{
            salary-=5000;
        }
        System.out.println("This is you final salary:"+salary);









    }
}

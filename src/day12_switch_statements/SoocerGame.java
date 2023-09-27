package day12_switch_statements;

import java.util.Scanner;

public class SoocerGame {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a minute to determine how much time is left in the soccer game:");
        int minute= scanner.nextInt();

        if (minute>=75&&minute<=90){
            System.out.println("Just getting started");
        } else if (minute>=60&&minute<=74) {
            System.out.println("Players are doing their best");
        } else if (minute>=30&&minute<=59) {
            System.out.println("Middle of the game is going great");
        } else if (minute>=0&&minute<=29) {
            System.out.println("The end of the game is approaching");
        } else if (minute<0) {
            System.out.println("Minutes cannot be a negative number");
        }else if(minute>90){
            System.out.println("Games cannot be longer than 90 minutes");
        }


    }
}

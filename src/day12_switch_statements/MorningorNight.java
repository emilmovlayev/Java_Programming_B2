package day12_switch_statements;

import java.util.Scanner;

public class MorningorNight {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a time (between 1 and 24 in whole numbers) to find if it is a day or night time:");
        byte num = scanner.nextByte();
        if (num>=1&&num<=11){
            System.out.println("Morning");
        }else if(num>=12&&num<=24){
            System.out.println("Night");
        }else{
            System.out.println("Please enter number between 1-24.Thank you!");
        }

        Scanner input =new Scanner(System.in);
        System.out.println("Enter the day of the week:");
        String day = input.next();
        switch (day){
            case "Monday":
                System.out.println("Mentor hours");
                break;
            case "Tuesday":
            case"Friday":
                System.out.println("No class");
                break;
            case "Wednesday":
            case "Thursday":
            case "Saturday":
                System.out.println("Java class");
                break;
            case "Sunday":
                System.out.println("Soft skills");
                break;
            default:
                System.out.println("Invalid day given");
        }


    }
}

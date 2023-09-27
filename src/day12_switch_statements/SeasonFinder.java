package day12_switch_statements;

import java.util.Scanner;

public class SeasonFinder {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 12:");
        int season = scanner.nextInt();

        switch (season) {
            case 1:
            case 12:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Fall");
                break;
            default:
                System.out.println("Invalid number");
        }

    }
}

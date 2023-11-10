package day12_switch_statements;

import java.util.Scanner;

public class Trip {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter you grade number:");
        int grade = scanner.nextInt();

        switch (grade){
            case 1:
                System.out.println("Grade-1\nLocation-Apple orchard\nNumber of groups-3\nTeacher-Ms.Smith");
                break;
            case 2:
                System.out.println("Grade-2\nLocation-Museum\nNumber of groups-4\nTeacher-Ms.Janet");
                break;
            case 3:
                System.out.println("Grade-3\nLocation-Botanic gardens\nNumber of groups-5\nTeacher-Ms.Alice");
                break;
            case 4:
                System.out.println("Grade-4\nLocation-TD garden\nNumber of groups-6\nTeacher-Mr.Finch");
                break;
            case 5:
                System.out.println("Grade-5\nLocation-Corn field\nNumber of groups-7\nTeacher-Mr.Nick");
                break;
            case 6:
                System.out.println("Grade-6\nLocation-Beach\nNumber of groups-8\nTeacher-Ms.Jennifer");
                break;
            default:
                System.out.println("Invalid number");
        }




    }
}

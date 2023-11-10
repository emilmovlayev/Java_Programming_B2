package day12_switch_statements;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter hourly rate:");
        int hour = scanner.nextInt();
        System.out.println("Enter your weekly hours:");
        int week = scanner.nextInt();
        System.out.println("Enter the number of weeks worked:");
        int weekw = scanner.nextInt();

        if (hour <= 0) {
            System.out.println("Hourly Rate cannot be Negative or Zero");
        } else if (week <= 0 || week > 65) {
            System.out.println("Weekly Hours cannot be less than 1 or greater than 65");
        } else if (weekw < 1 || weekw > 52) {
            System.out.println("Number of weeks cannot be less than 1 or greater than 52");
        } else {

            int salary = hour*week*weekw;
            System.out.println("Salary: $" + salary);
        }






    }
}

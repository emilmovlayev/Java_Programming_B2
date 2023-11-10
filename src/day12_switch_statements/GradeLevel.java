package day12_switch_statements;

import java.util.Scanner;

public class GradeLevel {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a grade level please:");
        byte grade = scanner.nextByte();

        if (grade>=1&&grade<=5){
            System.out.println("Elementary School");
        } else if (grade>=6&&grade<=8) {
            System.out.println("Middle School");
        } else if (grade>=9&&grade<=12) {
            System.out.println("High School");
        } else if (grade>=13&&grade<=16) {
            System.out.println("College");
        } else if (grade>=17&&grade<=18) {
            System.out.println("Grad School");
        }else{
            System.out.println("Invalid grade level given");
        }


       Scanner input =new Scanner(System.in);
       System.out.println("Enter the type of the house to see the max allowed number:");
       String housetype = input.nextLine();

       switch (housetype){
           case "Tree house":
               System.out.println("There are 1 person in the Tree house");
               break;
           case "Mobile home":
               System.out.println("There are 2 people in the Mobile home");
               break;
           case "Apartment":
               System.out.println("There are 4 people in the Apartment");
               break;
           case "Town house":
               System.out.println("There are 6 people in the Town house");
               break;
           case "Villa":
               System.out.println("There are 8 people in the Villa");
               break;
           case "Mansion":
               System.out.println("There are 10 people in the Mansion");
       }


    }
}

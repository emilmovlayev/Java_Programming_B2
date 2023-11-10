package day11_if_statements;


import java.util.Scanner;


public class PandemicChecker {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a year:");
        int year = scanner.nextInt();
        if (year>=1346&&year<=1353){
            System.out.println("The black death happened those years");
        } else if (year>=1665&&year<=1666) {
            System.out.println("Great Plague of London");
        } else if (year>=1770&&year<=1772) {
            System.out.println("Russian Plague");
        } else if (year>=1889&&year<=1890) {
            System.out.println("Flu Pandemic");
        } else if (year==1916) {
            System.out.println("American Polio");
        } else if (year>=1918&&year<=1920) {
            System.out.println("Spanish Flu");
        } else if (year>=2009&&year<=2010) {
            System.out.println("Swine Flu Pandemic");
        } else if (year>=2014&&year<=2016) {
            System.out.println("Ebola Pandemic");
        } else if (year>=2020&&year<=2022) {
            System.out.println("Covid-19");
        }else {
            System.out.println("Year not in those ranges");
        }









    }
}

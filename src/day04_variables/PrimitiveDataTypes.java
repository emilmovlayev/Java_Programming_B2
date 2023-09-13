package day04_variables;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        byte monthnumber = 8;
        byte daynumber = 21;
        short yearnumber = 1987;
        System.out.println(monthnumber + "/" + daynumber + "/" + yearnumber);
        System.out.println(monthnumber + "." + daynumber + "." + yearnumber);
        System.out.println(monthnumber + "-" + daynumber + "-" + yearnumber);
        System.out.println();


        System.out.println("Locations for the next years");
        int year = 2022;
        System.out.println("in the year " + year + " the olympic will happen in China");
        year = 2026;
        System.out.println("in the year " + year + " the olympic will happen in France");
        year = 2030;
        System.out.println("in the year " + year + " the olympic will happen in Italy");


    }
}

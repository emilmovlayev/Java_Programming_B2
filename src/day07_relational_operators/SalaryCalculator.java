package day07_relational_operators;

public class SalaryCalculator {
    public static void main(String[] args) {
        double salary = 100_000;
        double statetaxrate = 0.06;
        double federaltaxfate = 0.21;
        double statetax,federaltax,totaltax,salaryaftertax;

        statetax = salary * statetaxrate;
        federaltax = salary * federaltaxfate;
        totaltax = statetax + federaltax;
        salaryaftertax = salary - totaltax;

       String taxreport = "State tax rate " +statetax+ "\nFederal tax rate "+
               federaltax+ "\nBase salary $ "+ salary+ "\nTax amount: "+statetax+
               " for state tax and "+ federaltax+ " federal tax in total it is:"
               +totaltax+ "\nAfter tax our salary is:" + salaryaftertax;

        System.out.println(taxreport);





    }
}

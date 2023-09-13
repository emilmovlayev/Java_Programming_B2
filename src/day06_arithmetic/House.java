package day06_arithmetic;

public class House {
    public static void main(String[] args) {

         int i2 = 100;
        // byte b2 = i2; cast. from bigger to small (narrowing)
         byte b2 =(byte)i2;

        int a = 500;
        a = ++a;
        System.out.println(a);

        int b = 9;
        int c = b--;
        System.out.println(c);
        System.out.println(b);


        double num1 = 5;
        double num2 = 4;


        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1 / num2;
        double modules = num1 % num2;

        System.out.println(num1 + " + " + num2 + " = " + addition);
        System.out.println(num1 + " - " + num2 + " = " + subtraction);
        System.out.println(num1 + " * " + num2 + " = " + multiplication);
        System.out.println(num1 + " / " + num2 + " = " + division);
        System.out.println(num1 + " % " + num2 + " = " + modules);










    }


}

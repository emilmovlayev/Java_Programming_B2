package day20_NestedLoops;
import java.util.Scanner;
public class FinRainRange {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        // 12


        for (int i = 1; i <= num; i++) {
            String result = "";

            if (i % 3 == 0) {
                result += "fin";
            }

            if ( i % 5 == 0) {
                result += "ra";
            }


            System.out.println(result.isEmpty() ? i : result);



        }







    }
}

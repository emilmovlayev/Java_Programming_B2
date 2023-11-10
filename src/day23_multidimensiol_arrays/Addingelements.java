package day23_multidimensiol_arrays;
import java.util.Scanner;
import java.util.Arrays;
public class Addingelements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers do you have?");
        int size = scan.nextInt();

        int [] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter number "+(i+1)+":");
            arr[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("\nHow many new elements to add?");
        int num = scan.nextInt();

        int [] arr2 = Arrays.copyOf(arr, arr.length+num);

        for (int i = 0; i < num; i++) {
            System.out.println("Enter number "+(i+1));
            arr2[arr.length+i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(arr2));






    }
}

package day21_Arrays;

public class SomeElements {
    public static void main(String[] args) {


        int [] nums =  {3, 5, 7, 8};
        int sum = 0;

        // Need to get each element one by one
        //    I can add each of them and store it into a new variable

        for (int i = 0; i < nums.length; i++) {
            //System.out.println(nums[i]);
            sum += nums[i];  // sum = sum + nums[i];
        }

        System.out.println("Sum of total: " + sum);











    }
}

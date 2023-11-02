package day28_ArrayList;
import java.util.ArrayList;

public class ContainsClearEmpty {
    public static void main(String[] args) {

        ArrayList <Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(400);
        nums.add(800);

        System.out.println( nums.contains(200) );
        System.out.println( nums.contains(700) );

        nums.remove(0);
        nums.remove((Integer)100);
        System.out.println(nums);


        System.out.println( nums.isEmpty()  );

        nums.clear();
        System.out.println(nums);
        System.out.println(nums.size()); // 0
        System.out.println(nums.isEmpty()); // true






    }
}

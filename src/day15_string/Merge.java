package day15_string;

public class Merge {
    public static void main(String[] args) {

        String a = "abc";
        String b = "xyz";

        // ----- > axbycz

        String merged = "";
        merged += a.charAt(0);     //this is the same thing ---- > merged = merged + a.charAt(0);
        merged += b.charAt(0);


        merged += a.charAt(1);
        merged += b.charAt(1);


        merged += a.charAt(2);
        merged += b.charAt(2);

        System.out.println(merged);








    }
}

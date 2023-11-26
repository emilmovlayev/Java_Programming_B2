package day19_nested_loop;

public class BiggestString {
    public static void main(String[] args) {



        String str = "aaabbbcccddddeeee"; // abcd
        //            0123456789.......
        String sub = "";  // default initial value
        String biggest = "";

        for (int i = 0; i < str.length()-1; i++) {

            sub += str.charAt(i);  // sub = "aaa"; --- >  sub = "bbb";

            if ( str.charAt(i) != str.charAt(i+1)) {

                if (biggest.length() < sub.length() ) {
                    biggest = sub;  // aaa  --  bbb
                }

                sub = "";

            }



        }

        System.out.println(biggest);









    }
}

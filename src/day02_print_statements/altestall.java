package day02_print_statements;

import java.util.Scanner;

public class altestall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a senctence");
        String word = scanner.nextLine().toLowerCase();
        int count =0;
        while (word.contains("chapter")) {

            word=word.replaceFirst("chapter"," ");
            count+=10;
        }
        System.out.println(count);





       String word2 = "thisHasManyWordsToFind";
       int count2 =0;
        for (int i = 0; i < word2.length(); i++) {
            char l =word2.charAt(i);
            if (l>='A'&&l<='Z') {
                count2++;
            }

        }
        System.out.println(count2+1);




        String sentence = "I love Java";
       String full = ""+sentence.substring(sentence.indexOf(" ")+1,sentence.lastIndexOf(" "));
        for (int i = full.length()-1; i >=0 ; i--) {
            System.out.print(full.charAt(i));
        }










    }
}

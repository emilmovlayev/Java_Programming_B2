package day18_loops;

import java.util.Scanner;

public class countwords {
    public static void main(String[] args) {

        /*
    Count Words
    Given a sentence determine how many words are in the String.
    Ex:
    Input:
    This has multiple words
    Output:
    4
 */
        Scanner input =new Scanner(System.in);
        String userSentence = input.nextLine();

        // This has multiple    words
        // 01234567890.......
        /*
            count words
                - count spaces + 1

            count space?
                loop through all character and see how many there

         */
        int countEmpty = 0;
        for (int i = 0; i < userSentence.length() ; i++) {

            if (userSentence.charAt(i) == ' '){
                countEmpty++;
            }
        }

        System.out.println("The number of empty spaces: " + countEmpty);
        System.out.println("You have " + (countEmpty+1) + " words.");



    }
}

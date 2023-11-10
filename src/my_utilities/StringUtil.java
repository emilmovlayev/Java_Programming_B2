package my_utilities;

import java.util.Arrays;

public class StringUtil {


    public static void main(String[] args) {
        System.out.println( frequencyOfCharacters("apple", 'p') );
        System.out.println( frequencyOfCharacters("apple", 'm') );
    }


    public static int frequencyOfCharacters (String word, char letter) {
        int count = 0;

        for (int i = 0; i < word.length(); i++) {

            if ( word.charAt(i) == letter) {
                count++;
            }

        }

        return count;
    }
    public static String fixFormat (String name) {
        return name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
    }

    public static int [] addElementInArr (int [] originalArr, int num) {
        int [] newArr = Arrays.copyOf(originalArr, originalArr.length+1 ); // [1, 3, 5, 2, 123, 234, _ ]
        newArr[newArr.length-1] = num;
        return newArr;
    }


    public static String [] addElementInArr (String [] originalArr, String str) {
        String [] newArr = new String [originalArr.length + 1];
        for (int i = 0; i < originalArr.length; i++) {
            newArr[i] = originalArr [i];
        }
        newArr [newArr.length - 1] = str;
        return newArr;
    }


}

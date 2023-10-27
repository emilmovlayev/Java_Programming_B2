package my_utilities;

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


}

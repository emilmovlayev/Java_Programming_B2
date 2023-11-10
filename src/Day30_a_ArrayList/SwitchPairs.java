package Day30_a_ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class SwitchPairs {
    public static void main(String[] args) {
        ArrayList <String> words = new ArrayList<>(Arrays.asList( "Cat", "in",
                "the", "hat",
                "apple", "water")  );


        System.out.println("Original: " + words);
        for (int i = 0; i < words.size(); i+=2) {

            Collections.swap(words, i, (i + 1) );

        }

        System.out.println("After Swap: " + words);














    }

}

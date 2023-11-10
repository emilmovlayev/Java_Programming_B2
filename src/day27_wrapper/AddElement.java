package day27_wrapper;
import java.util.Arrays;
public class AddElement {


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

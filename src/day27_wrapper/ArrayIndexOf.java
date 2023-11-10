package day27_wrapper;

public class ArrayIndexOf {
    public static void main(String[] args) {

        int [] arr = {12, 34, 4, 2, 23, 324, 345, 4, 64};
        //             0   1  2  3   4   5    6   7   8
        int num = 4;

        int index = indexOf(arr, num);
        System.out.println(index);

        System.out.println(indexOf(arr, num));

        System.out.println(indexOf(arr, 345));


        String [] words = {"hello", "bye", "java"};
        //                     0      1       2
        System.out.println(indexOf(words, "java"));





    }

    // make a method that accepts an int arr and a number then returns the index of,
    // if it does not exist in array, then return -1
    public static int indexOf (int [] numArr, int num) {

        for (int i = 0; i < numArr.length; i++) {
            if ( numArr[i] == num) {
                return i;  // 1
            }
        }
        return -1;
    }

    public static int indexOf (String [] str, String word) {
        for (int i = 0; i < str.length; i++) {
            if ( str[i].equals(word)) {
                return i;
            }
        }
        return -1;
    }



}

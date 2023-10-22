package day24_methods;

public class Lastcharacter {
    public static void main(String[] args) {

        String [][] words = {
                {"Java", "is", "fun"},   // asn
                {"Softskills", "ehhh"},  // sh
                {"Loops", "are", "getting", "easier"}  // segr
        };



        for (int i = 0; i < words.length; i++) {

            for (int j = 0; j < words[i].length; j++) {
                String eachWord = words[i][j];
                System.out.print(eachWord.charAt(eachWord.length()-1));
            }
            System.out.println();
        }

        System.out.println("---------------------------------------------");
        // with FOREACH
        for ( String [] eachArr : words) {  // OUTER LOOP: cycling through 2D array, getting each single array

            for ( String eachElement : eachArr) {  // INNER LOOP: cycling through eachArr, getting each String
                System.out.print(eachElement.charAt(eachElement.length()-1));
            }
            System.out.println();
        }







    }
}

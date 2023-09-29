package day14_string;

public class EmptyOrBlank {
    public static void main(String[] args) {


        String str = "last example";
        System.out.println(str.isEmpty());

        str = ""; // REASSIGNED IT to "";
        System.out.println(str.isEmpty());


        str = " ";  //REASSIGNED it to " ";
        System.out.println(str.isEmpty()); // empty space is a CHARACTER. So --- > false


        str = " ";
        System.out.println(str.isBlank()); //

        str = "          ";
        System.out.println(str.isBlank()); //


        str = "        .          ";
        System.out.println(str.isBlank());








    }
}

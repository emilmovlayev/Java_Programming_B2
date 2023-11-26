package day14_string;

public class ContainsAndRemovespace {
    public static void main(String[] args) {
/*
    .equals(String) --- > return boolean
    .equalIgnoreCase(String) --- > return boolean
    .length() ----- > Return int
    .toUpperCase()  --- > returns new String all in UPPERCASE
    .toLowerCase()  --- > returns new String all in lowercase
    .startsWith(String) --- > return boolean
    .endsWith(String) --- > return boolean
    .contains(String) --- > return boolean
    .trim() ------- > returns new String removing spaces from BEGINNING and from END ONLY.
    .isEmpty() --- > return boolean if there is NO CHARACTER at all including space -- > "";
    .isBlank() --- > return boolean is there ONLY EMPTY SPACES inside the double quotation
 */
        String day = "Today it was a Java class.";

        System.out.println(day.contains("it was"));  // true
        System.out.println(day.contains("itwas"));   // false

        String str = "was a SoftSkills";
        System.out.println(day.contains(str));

        System.out.println(day.contains("Today class."));
        System.out.println(day.contains("It was a Java class."));
        System.out.println(day.contains(" "));
        System.out.println(day.contains("w"));
        System.out.println(day.contains("x"));

        System.out.println(day.contains("5"));

        System.out.println(day.contains(""));

        System.out.println(day + " Or not.");// "Today it was a Java class."
        System.out.println(day.contains(" Or not."));

        System.out.println("------------------");
        System.out.println((day + " Or not.").contains(" Or not."));
        System.out.println(day.contains(" Or not.")); //"Today it was a Java class."

        //"Today it was a Java class."
        if (day.contains("java")) {
            System.out.println("There is a coding language name in this sentence");
        }

        //"Today it was a Java class."
        if (day.contains("Java")) {
            System.out.println("There is a coding language name in this sentence");
        }

        System.out.println(day.contains("t w"));

        System.out.println("---------------------------------------");






    }
}

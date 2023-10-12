package day02_print_statements;



public class allnewtest {
    public static void main(String[] args) {
        String fake = "AAABCCDEEF";
        String sake ="";
        for (int i = 0; i < fake.length(); i++) {
            if (!sake.contains(""+fake.charAt(i))) {
                sake+=fake.charAt(i);
            }
        }
        System.out.println("AAABCCDEEF");
        System.out.println(sake);


        String fake2="AAABCCDEEF";
        String sake2="";
        for (int i = 0; i < fake2.length()-1; i++) {

            if (fake2.charAt(i)==fake2.charAt(i+1)) {

                if (!sake2.contains(""+fake2.charAt(i))) {
                    sake2+=fake2.charAt(i);
                }

            }
        }
        System.out.println("AAABCCDEEF");
        System.out.println(sake2);

        String fake3="AAABCCDEEF";
        String sake3="";



    }
}

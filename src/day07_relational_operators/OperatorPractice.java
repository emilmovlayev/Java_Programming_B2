package day07_relational_operators;

public class OperatorPractice {
    public static void main(String[] args) {

        int num = 10;
        num++;  //post-increment | no other code, just incremented by 1 |
        System.out.println(num); // 11

        num--; // post-decrement
        System.out.println(num);  // 10

        System.out.println(num++);// post-increment -- > we get/print the value first, then we update it. --- 10  | num = 11;
        System.out.println(num++); // output -- > 11   |  num = 12;
        System.out.println(++num); // pre-increment --- > we update first, then user it --- > num = 13; | print - 13
        int h = 5; // I declared an int variable called h and assign a value 5 to it.
        int p = h; // I declared an int variable called p and assigned a value from variable h

        h++;  // post-increment - no other code | Just increase by 1
        System.out.println("h: " + h); //Output: 6
        System.out.println("p: "+ p); //Output: 5

        int k = h++;  //
        System.out.println("h: " + h);  // 7
        System.out.println("k: " + k);  // 6


        int g = ++h;
        System.out.println("h: " + h);
        System.out.println("g: " + g);




    }
}

package day06_unary;

public class Arithmetic {
    public static void main(String[] args) {
       int birthyear = 1990;
       int currentyear = 2023;
       int age = currentyear - birthyear;
        System.out.println("You age:" +age);
        System.out.println();

        String pizza = "cheese";
        int pizzaslices = 8;
        int people = 4;
        int sliceperson = pizzaslices / people;
        System.out.println("We ordered "+pizza+" pizza with "+pizzaslices+" slices "+people+" people ate "+sliceperson+" each");
        System.out.println();

        String city1 = "Chicago";
        String city2 = "Boston";
        double baseticketprice = 110.50;
        double milesbetweencities = 739.8;
        double ticketprice = 110.50+739.8/10;
        System.out.println("The ticket price from "+city1+" to "+city2+" is "+ticketprice);
        System.out.println();

        int balance = 200;
        int item1 = 40;
        int item2 = 100;
        int giftcard = 60;
        System.out.println("The gift card started with a balance of "+balance+" and after buying item1 for "+item1+
                " and item2 for "+item2+" the remaining balance of the gift card is "+giftcard);


    }
}

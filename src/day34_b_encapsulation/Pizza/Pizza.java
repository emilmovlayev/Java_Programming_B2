package day34_b_encapsulation.Pizza;

public class Pizza {

    private String size;
    private int numberOfToppings;


    public Pizza (String size, int numberOfToppings) {
        setSize(size);
        setNumberOfToppings(numberOfToppings);
    }


    // SETTERS
    public void setSize(String size) {
        if (size.equalsIgnoreCase("large") ||
                size.equalsIgnoreCase("medium") ||
                size.equalsIgnoreCase("small")) {
            this.size = size;
        } else {
            System.out.println("Error: WRONG size");
        }
    }

    public void setNumberOfToppings(int numberOfToppings) {
        if (numberOfToppings >= 0) {
            this.numberOfToppings = numberOfToppings;
        } else {
            System.out.println("Error: WRONG number of toppings" );
        }
    }

    //GETTERS
    public String getSize() {
        return size;
    }

    public int getNumberOfToppings() {
        return numberOfToppings;
    }


    public double calculatePrice () {

        double totalPrice;

        if (size.equalsIgnoreCase("small")) {
            totalPrice = 4 + (numberOfToppings * 0.75);
        } else if (size.equalsIgnoreCase("medium")  ) {
            totalPrice = 6 + (numberOfToppings * 0.75);
        } else if (size.equalsIgnoreCase("large")  ) {
            totalPrice = 8 + (numberOfToppings * 0.75);
        } else {
            totalPrice = -1;
        }

        return totalPrice;

    }

    @Override
    public String toString() {
        return "Pizza Info" +
                "\n\tSize: " + size +
                "\n\tNumber Of Toppings: " + numberOfToppings +
                "\n\tTotal Price: $" + calculatePrice();
    }


}

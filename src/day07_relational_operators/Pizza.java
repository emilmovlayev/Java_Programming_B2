package day07_relational_operators;

public class Pizza {
    public static void main(String[] args) {
        String typeofpizza = "cheesepizza";
        int numpizza = 10;
        int numpeople = 4;

        int slicesperperson =numpizza/numpeople;
        int slicesleftover = numpizza%numpeople;

        String report = "We ordered "+typeofpizza+" pizza with the " +
                numpizza+" people ate "+ slicesperperson+ " for each, there were "+
                slicesleftover+ " slice left";


        System.out.println(report);













    }
}

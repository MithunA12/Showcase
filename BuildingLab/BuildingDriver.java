package Unit9.BuildingLab;

import java.util.ArrayList;

public class BuildingDriver {
    public static void main(String[] args) {
        Building pigSty = new Building("pig sty", "Bob the Builder", 1999,
                1738000, "the hood", 8000);

        Commercial factory = new Commercial("Gigafactory", "Tesla", 2019, 1500000000,
                "Austin", 10000000,"build teslas", 127855, 150000);

        SingleFamily house = new SingleFamily("House", "Pulte", 1988,
                350000, "Palatine", 2000, 8, 10, 3, 3,
                2, 1.5);

        Residential mansion = new Residential("Kardashian Krib", "some rich dude", 1998,
                7099710, "Hidden Hills, CA", 8860, 9, 10, 8, 6);

        Apartment elPiso = new Apartment("International Village", "a guy with $46,000,000", 646,
                2397, "Schaumburg", 1400, 8, 8,
                2, 3, true);





        ArrayList<Building> buildList = new ArrayList<>();
        buildList.add(pigSty);
        buildList.add(factory);
        buildList.add(house);
        buildList.add(mansion);
        buildList.add(elPiso);

        System.out.println(pigSty.toString() + "\n");

        System.out.println(factory.toString() + "\n");

        System.out.println(house.toString() + "\n");


        System.out.println(mansion.toString() + "\n");

        System.out.println(elPiso.toString() + "\n");



        house.renovate();
        pigSty.renovate();
        factory.renovate();
        house.luckyLandPurchase();

        mansion.renovate();
        elPiso.renovate();

        System.out.println(pigSty.toString() + "\n");

        System.out.println(factory.toString() + "\n");

        System.out.println(house.toString() + "\n");

        System.out.println(mansion.toString() + "\n");

        System.out.println(elPiso.toString() + "\n");

        System.out.println("Pig Sty's utility bill per month is $" + pigSty.getUtilityBill());
        System.out.println("Tesla's Gigafactory makes $" + factory.monthlyRevenue() + " per month");


        System.out.println(factory.toString() + "\n");

        System.out.println(house.toString());

    }
}

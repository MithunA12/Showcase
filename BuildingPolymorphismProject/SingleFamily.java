package Unit9.BuildingLab;

public class SingleFamily extends Residential{
    private int numGarageSpaces;
    private double numAcres;

    public SingleFamily(String name, String builder, int yearBuilt, int price, String location, int sqFt,
                        int schoolRating, int safetyRating, int numBaths, int numBeds,
                        int numGarageSpaces, double numAcres) {
        super(name, builder, yearBuilt, price, location, sqFt, schoolRating, safetyRating, numBaths, numBeds);
        this.numGarageSpaces = numGarageSpaces;
        this.numAcres = numAcres;
    }

    //getters and setters
    public int getNumGarageSpaces() {
        return numGarageSpaces;
    }

    public void setNumGarageSpaces(int numGarageSpaces) {
        this.numGarageSpaces = numGarageSpaces;
    }

    public double getNumAcres() {
        return numAcres;
    }

    public void setNumAcres(double numAcres) {
        this.numAcres = numAcres;
    }

    @Override
    public String toString(){
        String output = super.toString();
        output += "Number of Garage Spaces: " + numGarageSpaces + "\nNumber of Acres at the property is " + numAcres;
        return output;
    }

    /**
     * The renovate function randomly creates upgrades for the different features
     * of the building,and increases its property value accordingly
     * It also adds a random number of garage spaces to the building
     */
    @Override
    public void renovate() {
        super.renovate();
        if(Math.random() < 0.5) {
            numGarageSpaces += 1;
        }

    }

    /**
     * This adds a random number (int) to the acreage count of a building
     */
    public void luckyLandPurchase(){
        numAcres += (int)(Math.random() * 5) + 1;
    }
}

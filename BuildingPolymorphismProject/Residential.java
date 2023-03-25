package Unit9.BuildingLab;

public class Residential extends Building{
    private int schoolRating;
    private int safetyRating;
    private int numBaths;
    private int numBeds;

    public Residential(String name, String builder, int yearBuilt,
                       int price, String location, int sqFt, int schoolRating, int safetyRating,
                       int numBaths, int numBeds) {
        super(name, builder, yearBuilt, price, location, sqFt);
        this.schoolRating = schoolRating;
        this.safetyRating = safetyRating;
        this.numBaths = numBaths;
        this.numBeds = numBeds;
    }

    //getters and setters

    public int getSchoolRating() {
        return schoolRating;
    }

    public void setSchoolRating(int schoolRating) {
        this.schoolRating = schoolRating;
    }

    public int getSafetyRating() {
        return safetyRating;
    }

    public void setSafetyRating(int safetyRating) {
        this.safetyRating = safetyRating;
    }

    public int getNumBaths() {
        return numBaths;
    }

    public void setNumBaths(int numBaths) {
        this.numBaths = numBaths;
    }

    public int getNumBeds() {
        return numBeds;
    }

    public void setNumBeds(int numBeds) {
        this.numBeds = numBeds;
    }

    @Override
    public String toString(){
        String output = super.toString();
        output += "School Rating: " + schoolRating + "\nSafety Rating: " + safetyRating;
        output += "\nNumber of Bathrooms: " + numBaths + "\nNumber of Bedrooms: " + numBeds + "\n";
        return output;
    }

    /**
     *The renovate function randomly creates upgrades for the different features
     *the building,and increases its property value accordingly
     */
    @Override
    public void renovate() {
        super.renovate();
        numBaths += (int)(Math.random() * 2) + 1;
        numBeds += (int)(Math.random() * 2) + 1;
        numBaths += (int)(Math.random() * 3) + 1;
        numBeds += (int)(Math.random() * 3) + 1;
    }
}

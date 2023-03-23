package Unit9.BuildingLab;

public class Commercial extends Building{
    private String purpose;
    private int maximumOccupancy;
    private int parkingSpaces;

    public Commercial(String name, String builder, int yearBuilt, int price,
                      String location, int sqFt, String purpose, int maximumOccupancy, int parkingSpaces) {
        super(name, builder, yearBuilt, price, location, sqFt);
        this.purpose = purpose;
        this.maximumOccupancy = maximumOccupancy;
        this.parkingSpaces = parkingSpaces;
    }

    //getters and setters
    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public int getMaximumOccupancy() {
        return maximumOccupancy;
    }

    public void setMaximumOccupancy(int maximumOccupancy) {
        this.maximumOccupancy = maximumOccupancy;
    }

    public int getParkingSpaces() {
        return parkingSpaces;
    }

    public void setParkingSpaces(int parkingSpaces) {
        this.parkingSpaces = parkingSpaces;
    }


    @Override
    public String toString(){
        String output = super.toString();
        output += "The purpose of this building is for " + purpose + "\nMaximum Occupancy: " + maximumOccupancy;
        output += "\nNumber of Parking Spaces: " + parkingSpaces;
        return output;
    }

    /**
     * The renovate function randomly creates upgrades for the different features
     * of the building,and increases its property value accordingly
     */
    @Override
    public void renovate() {
        super.renovate();
        maximumOccupancy += (int)(Math.random() * maximumOccupancy/10);
        parkingSpaces += (int)(Math.random() * parkingSpaces/10);
    }

    /**
     * This returns the revenue this commercial building makes in a month
     * @return it returns an int prportional to the square footage of the building
     */
    public int monthlyRevenue(){
        return getSqFt()*1000;
    }


}

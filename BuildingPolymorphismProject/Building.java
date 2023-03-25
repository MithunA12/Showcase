package Unit9.BuildingLab;

public class Building {
    private String name;
    private String builder;
    private int yearBuilt;
    private int price;
    private String location;
    private int sqFt;

    public Building(String name, String builder, int yearBuilt, int price, String location, int sqFt) {
        this.name = name;
        this.builder = builder;
        this.yearBuilt = yearBuilt;
        this.price = price;
        this.location = location;
        this.sqFt = sqFt;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBuilder() {
        return builder;
    }

    public void setBuilder(String builder) {
        this.builder = builder;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSqFt() {
        return sqFt;
    }

    public void setSqFt(int sqFt) {
        this.sqFt = sqFt;
    }

    @Override
    public String toString(){
        String str = "This " + name + " was built by " + builder + " in " + yearBuilt;
        str += "\nIt is located in " + location + " and has " + sqFt + " square feet";
        str += "\nIt's listed for $" + price + "\n";
        return str;
    }

    /**
     * The renovate function randomly creates upgrades for the different features
     * of the building,and increases its property value accordingly
     */
    public void renovate(){
        price += Math.random() * price;
        sqFt += (int)(Math.random() * sqFt/10);

    }


    /**
     *It returns a utility bill that is proportionate to your square footage
     * @return it returns a int that is proportionate to the square footage
     */
    public int getUtilityBill(){
        return sqFt/6;
    }

}

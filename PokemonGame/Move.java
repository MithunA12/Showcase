package Unit5.PokemonLab;

public class Move {
    //private variables
    private String name;
    private String type;
    private int damage;


    /**
     * A constructor for the move class
     * @param name name of the move
     * @param type the move type (i.e. water, grass, or fire)
     * @param powerLevel the power level of the move
     */
    public Move(String name, String type, int powerLevel){
        this.name = name;
        this.type = type;
        damage = powerLevel;
    }

    // getters & setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int power) {
        this.damage = power;
    }


    /**
     * This returns a summary of the move so a user can make an
     * appropriate decision in battle
     * @return this returns a move summary
     */
    public String toString(){
        String output = "\nMove Name: " + name;
        output += "\nMove Type: " + type;
        output += "\nDamage: " + damage;
        return output;
    }
}

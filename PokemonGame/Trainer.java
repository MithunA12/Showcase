package Unit5.PokemonLab;



public class Trainer {
    //private variables
    private Pokemon one;
    private Pokemon two;
    private String trainerName;

    //This static variable is used to keep
    //track of number of trainer wins
    private static int numTrainerWins = 0;

    //sole constructor
    public Trainer(Pokemon one, Pokemon two, String trainerName) {
        this.one = new Pokemon(one.getName(), one.getHp(), one.getMove1(), one.getMove2(), one.getType(),
                one.getWeakness());
        this.two = new Pokemon(two.getName(), two.getHp(), two.getMove1(), two.getMove2(), two.getType(),
                one.getWeakness());
        this.trainerName = trainerName;
    }

    //getters and setters
    public Pokemon getOne() {
        return one;
    }

    public void setOne(Pokemon one) {
        this.one = one;
    }

    public Pokemon getTwo() {
        return two;
    }

    public void setTwo(Pokemon two) {
        this.two = two;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public static int getNumTrainerWins() {
        return numTrainerWins;
    }

    /**
     * This function adds a win to the Trainer class
     */
    public static void addTrainerWins(){
        numTrainerWins += 1;
    }

    /**
     * This function returns a summary of the user's/trainer object data, so they can make
     * appropriate decisions in battle
     * @return this returns a summary of the Trainer object's data
     */
    public String toString(){
        String output = "Trainer Name: " + trainerName;
        output += "\nPokemon One: " + one;
        output += "\nPokemon Two: " + two;
        return output;
    }
}

package Unit5.PokemonLab;

public class TeamRocket {
    //private variables
    private Pokemon one;
    private Pokemon two;
    private String trainerName;

    //Static variable used to keep track
    //of total number of Team Rocket wins
    private static int numRocketWins = 0;

    //sole constructor
    public TeamRocket(Pokemon first, Pokemon second, String trainerName) {
        this.one = new Pokemon(first.getName(), first.getHp(), first.getMove1(), first.getMove2(), first.getType(),
                first.getWeakness());
        this.two = new Pokemon(second.getName(), second.getHp(), second.getMove1(), second.getMove2(), second.getType(),
                second.getWeakness());
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

    public static int getNumRocketWins() {
        return numRocketWins;
    }

    /**
     * This function adds a win to the Team Rocket class
     */
    public static void addRocketWins(){
        numRocketWins += 1;
    }

    /**
     * this function returns a summary of Team Rocket's data so the user can make appropriate decisions
     * in battle
     * @return this returns a summary of a Team Rocket's object's data
     */
    public String toString(){
        String output = "Trainer Name: " + trainerName;
        output += "\nPokemon One: " + one;
        output += "\nPokemon Two: " + two;
        return output;
    }
}

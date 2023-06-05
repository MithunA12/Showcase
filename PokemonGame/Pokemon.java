package Unit5.PokemonLab;


public class Pokemon {
    //private variables
    private String name;
    private int hp;
    private Move move1;
    private Move move2;
    private String type;
    private String weakness;


    //sole constructor
    public Pokemon(String name, int hp, Move move1, Move move2, String type, String weakness){
        this.name = name;
        this.hp = hp;
        this.move1 = new Move(move1.getName(), move1.getType(), move1.getDamage());
        this.move2 = new Move(move2.getName(), move2.getType(), move2.getDamage());
        this.type = type;
        this.weakness = weakness;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Move getMove1() {
        return move1;
    }

    public void setMove1(Move move1) {
        this.move1 = new Move(move1.getName(), move1.getType(), move1.getDamage());
    }

    public Move getMove2() {
        return move2;
    }

    public void setMove2(Move move2) {
        this.move2 = new Move(move2.getName(), move2.getType(), move2.getDamage());
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWeakness() {
        return weakness;
    }

    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }


    /**
     * This returns a summary of the pokemon object for the user to make appropriate decisions
     * in battle
     * @return this returns a summary of the pokemon object
     */
    public String toString(){
        String output = "\nPokemon Name: " + name;
        output += "\nPokemon Hp: " + hp;
        output += "\nPokemon Type: " + type;
        output += "\nPokemon Weakness: " + weakness;
        output += "\nMove 1: " + move1;
        output += "\nMove 2: " + move2;

        return output;
    }
}

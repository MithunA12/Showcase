package Unit5.PokemonLab;
import java.util.Scanner;
public class PokemonTester {
    public static void main(String[] args) {


        //This creates all the different pokemon moves for the pokemon

        Move fireball = new Move("Fireball", "Fire", 50);
        Move cut = new Move("Cut", "Grass", 30);
        Move waterfall = new Move("Waterfall", "Water", 60);
        Move fireBlast = new Move("Fire Blast", "Fire", 50);
        Move pollenHazard = new Move("Pollen Hazard", "Grass", 50);
        Move stickAndAbsorb = new Move("Stick and Absorb", "Grass", 60);
        Move hindKick = new Move("Hind Kick", "Fire", 40);
        Move flare = new Move("Flare", "Fire", 50);
        Move leafage = new Move("Leafage", "Grass", 40);
        Move leafBlade = new Move("Leaf Blade", "Grass", 60);
        Move bubble = new Move("Bubble", "Water", 50);
        Move waterGun = new Move("Water Gun", "Water", 50);
        Move smashTurn = new Move("Smash Turn", "Water", 60);

        //This creates all the pokemon using the previously created moves
        Pokemon oshawott = new Pokemon("Oshawott", 180, waterfall, bubble, "Water", "Grass");
        Pokemon charmander = new Pokemon("Charmander", 190, fireball, fireBlast, "Fire", "Water");
        Pokemon victreebell = new Pokemon("VictreeBell", 180, pollenHazard, stickAndAbsorb, "Grass", "Fire");
        Pokemon growlithe = new Pokemon("Growlithe", 160, hindKick, flare, "Fire", "Water");
        Pokemon rowlet = new Pokemon("Rowlet", 180, leafage, leafBlade, "Grass", "Fire");
        Pokemon squirtle = new Pokemon("Squirtle", 170, smashTurn, waterGun, "Water", "Grass");

        //This creates tha ai/TeamRocket
        TeamRocket ai = new TeamRocket(victreebell, growlithe, "Team Rocket");

        //This begins the set of questions to create a User's arsenal of pokemon
        Scanner input = new Scanner(System.in);
        System.out.println("Hey Trainer! To begin with your Pokemon journey please enter your name!");
        String trainerName = input.nextLine();
        System.out.println("Pick from the following Pokemon:\n\noshawott\ncharmander\nrowlet\nsquirtle\nType in " +
                "the pokemon you want");
        String pokemonOne = input.nextLine();

        //Temporary assignments
        Pokemon one = rowlet;
        Pokemon two = rowlet;

        //This assigns the first pokemon object to the user
        if(pokemonOne.equalsIgnoreCase("oshawott")){
            one = oshawott;
        }
        else if(pokemonOne.equalsIgnoreCase("charmander")){
            one = charmander;
        }
        else if(pokemonOne.equalsIgnoreCase("rowlet")){
            one = rowlet;
        }
        else if(pokemonOne.equalsIgnoreCase("squirtle")){
            one = squirtle;
        }
        System.out.println("Pick another new Pokemon!");
        String pokemonTwo = input.nextLine();

        //This assigns the second pokemon object to the user
        if(pokemonTwo.equalsIgnoreCase("oshawott")){
            two = oshawott;
        }
        else if(pokemonTwo.equalsIgnoreCase("charmander")){
            two = charmander;
        }
        else if(pokemonTwo.equalsIgnoreCase("rowlet")){
            two = rowlet;
        }
        else if(pokemonTwo.equalsIgnoreCase("squirtle")){
            two = squirtle;
        }
        Trainer user = new Trainer(one, two, trainerName);
        System.out.println("Great! Your battle will now commence against Team Rocket!");

        // runs battle method
        battle(user, ai);
    }

    /**
     *This function simulates a battle between two pokemon, and outputs the results of the battle
     * @param user this is the User, which has all of their pokemon and moves, which is used to simulate against the TeamRocket/ai object
     * @param ai this is the teamRocket object which has all of their Pokemon, which is used to simulatre against the user
     */
    public static void battle(Trainer user, TeamRocket ai){
        //This re-creates the scanner as this is a
        Scanner newInput = new Scanner(System.in);
        System.out.println("First, your " + user.getOne().getName() + " is up against Team Rocket's " + ai.getOne().getName());

        //While Pokemon isn't at 0 health
        //This will simulate the interactive battle between User's first Pokemon and the ai's first Pokemon
        System.out.println("\nYour " + user.getOne().getName() + "'s stats: ");
        System.out.println(user.getOne().toString());

        while(ai.getOne().getHp() > 0 && user.getOne().getHp() > 0){
            System.out.println("\nPick your move (Type 1 or 2)");
            int moveSelection = newInput.nextInt();
            //if the move selection matches the first move
            int aiFirstHp = user.getOne().getHp();
            if(moveSelection == 1){
                Move selection = user.getOne().getMove1();
                System.out.println("You used " + user.getOne().getMove1().getName());
                //If this is a super effective move, meaning it will do more damage
                //as it correlates with a weakness
                if (selection.getType().equals(ai.getOne().getWeakness())){
                    int currentHealth = ai.getOne().getHp();
                    int moveDamage = selection.getDamage() * 2;
                    ai.getOne().setHp(currentHealth - moveDamage);
                    System.out.println("It was super effective!");

                }
                else{
                    int currentHealth = ai.getOne().getHp();
                    int moveDamage = selection.getDamage();
                    ai.getOne().setHp(currentHealth - moveDamage);
                }
            }

            //else the move selection matches the second move
            else{
                Move selection = user.getOne().getMove2();
                System.out.println("You used " + user.getOne().getMove2().getName());

                //If this is a super effective move, meaning it will do more damage
                //as it correlates with a weakness

                if (selection.getType().equals(ai.getOne().getWeakness())){
                    int currentHealth = ai.getOne().getHp();
                    int moveDamage = selection.getDamage() * 2;
                    ai.getOne().setHp(currentHealth - moveDamage);
                    System.out.println("It was super effective!");

                }
                else{
                    int currentHealth = ai.getOne().getHp();
                    int moveDamage = selection.getDamage();
                    ai.getOne().setHp(currentHealth - moveDamage);
                }
            }

            //This prints out the summary after the first move made by the user in this round
            System.out.print(ai.getOne().getName() + " hp: " + aiFirstHp + " -> ");
            System.out.println(ai.getOne().getHp());

            int userFirstHp = user.getOne().getHp();

            //This randomly picks the ai's move
            double rand = getRandInt(0, 1);
            if (rand == 1){
                Move aiSelection = ai.getOne().getMove1();
                System.out.println("Team Rocket used " + ai.getOne().getMove1().getName());

                //If this is a super effective move, meaning it will do more damage
                //as it correlates with a weakness

                if (aiSelection.getType().equals(user.getOne().getWeakness())){
                    int currentHealth = user.getOne().getHp();
                    int moveDamage = aiSelection.getDamage() * 2;
                    user.getOne().setHp(currentHealth - moveDamage);
                    System.out.println("It was super effective!");

                }
                else{
                    int currentHealth = user.getOne().getHp();
                    int moveDamage = aiSelection.getDamage();
                    user.getOne().setHp(currentHealth - moveDamage);
                }
            }
            else{
                Move aiSelection = ai.getOne().getMove2();
                System.out.println("Team Rocket used " + ai.getOne().getMove2().getName());

                //If this is a super effective move, meaning it will do more damage
                //as it correlates with a weakness
                if (aiSelection.getType().equals(user.getOne().getWeakness())){
                    int currentHealth = user.getOne().getHp();
                    int moveDamage = aiSelection.getDamage() * 2;
                    user.getOne().setHp(currentHealth - moveDamage);
                    System.out.println("It was super effective!");

                }
                else{
                    int currentHealth = user.getOne().getHp();
                    int moveDamage = aiSelection.getDamage();
                    user.getOne().setHp(currentHealth - moveDamage);
                }
            }

            //This last if-else logic decides who was the winner of the battle and adds to
            //the static variable accordingly
            if(user.getOne().getHp() <= 0){
                TeamRocket.addRocketWins();

            }
            else if(ai.getOne().getHp() <= 0){
                Trainer.addTrainerWins();
            }

            System.out.print(user.getOne().getName() + " hp: " + userFirstHp + " -> ");
            System.out.println(user.getOne().getHp());
        }

        //Prints which team won the first round of battle!
        if(user.getOne().getHp() <= 0){
            System.out.println("\nTeam Rocket Has Defeated your First Pokemon!");

        }
        else if(ai.getOne().getHp() <= 0){
            System.out.println("\nYou have defeated Team Rocket's first pokemon!");

        }

        System.out.println("\nOnto the next Pokemon!");
        System.out.println("Your " + user.getTwo().getName() + " is up against Team Rocket's " + ai.getTwo().getName());

        //Second while loop between the battle for ai second pokemon and trainer second pokemon
        while(ai.getTwo().getHp() > 0 && user.getTwo().getHp() > 0){
            System.out.println(user.getTwo().toString());
            System.out.println("Pick your move (Type 1 or 2)");
            int moveSelection = newInput.nextInt();
            //if the move matches the first choice
            int aiFirstHp = user.getTwo().getHp();
            if(moveSelection == 1){
                Move selection = user.getTwo().getMove1();
                System.out.println("You used " + user.getTwo().getMove1().getName());

                //If this is a super effective move, meaning it will do more damage
                //as it correlates with a weakness
                if (selection.getType().equals(ai.getTwo().getWeakness())){
                    int currentHealth = ai.getTwo().getHp();
                    int moveDamage = selection.getDamage() * 2;
                    ai.getTwo().setHp(currentHealth - moveDamage);
                    System.out.println("It was super effective!");

                }
                else{
                    int currentHealth = ai.getTwo().getHp();
                    int moveDamage = selection.getDamage();
                    ai.getTwo().setHp(currentHealth - moveDamage);
                }
            }
            //else the move matches the second choice
            else{
                Move selection = user.getTwo().getMove2();
                System.out.println("You used " + user.getTwo().getMove2().getName());

                //If this is a super effective move, meaning it will do more damage
                //as it correlates with a weakness
                if (selection.getType().equals(ai.getTwo().getWeakness())){
                    int currentHealth = ai.getTwo().getHp();
                    int moveDamage = selection.getDamage() * 2;
                    ai.getTwo().setHp(currentHealth - moveDamage);
                    System.out.println("It was super effective!");

                }
                else{
                    int currentHealth = ai.getTwo().getHp();
                    int moveDamage = selection.getDamage();
                    ai.getTwo().setHp(currentHealth - moveDamage);
                }
            }

            System.out.print(ai.getTwo().getName() + " hp: " + aiFirstHp + " -> ");
            System.out.println(ai.getTwo().getHp());

            int userFirstHp = user.getTwo().getHp();

            //This randomly picks the ai's move
            double rand = getRandInt(0, 1);
            //if the move matches the first random integer
            if (rand == 1){
                Move aiSelection = ai.getTwo().getMove1();
                System.out.println("Team Rocket used " + ai.getTwo().getMove1().getName());

                //If this is a super effective move, meaning it will do more damage
                //as it correlates with a weakness
                if (aiSelection.getType().equals(user.getTwo().getWeakness())){
                    int currentHealth = user.getTwo().getHp();
                    int moveDamage = aiSelection.getDamage() * 2;
                    user.getTwo().setHp(currentHealth - moveDamage);
                    System.out.println("It was super effective!");

                }
                else{
                    int currentHealth = user.getTwo().getHp();
                    int moveDamage = aiSelection.getDamage();
                    user.getTwo().setHp(currentHealth - moveDamage);
                }
            }

            //else the integer equals 0, thus picking the second move
            else{
                Move aiSelection = ai.getTwo().getMove2();
                System.out.println("Team Rocket used " + ai.getTwo().getMove2().getName());

                //If this is a super effective move, meaning it will do more damage
                //as it correlates with a weakness
                if (aiSelection.getType().equals(ai.getTwo().getWeakness())){
                    int currentHealth = user.getTwo().getHp();
                    int moveDamage = aiSelection.getDamage() * 2;
                    user.getTwo().setHp(currentHealth - moveDamage);
                    System.out.println("It was super effective!");

                }
                else{
                    int currentHealth = user.getTwo().getHp();
                    int moveDamage = aiSelection.getDamage();
                    user.getTwo().setHp(currentHealth - moveDamage);
                }
            }

            //This last if-else logic decides who was the winner of the battle and adds to
            //the static variable accordingly
            if(user.getTwo().getHp() <= 0){
                TeamRocket.addRocketWins();

            }
            else if(ai.getTwo().getHp() <= 0){
                Trainer.addTrainerWins();
            }

            System.out.print(user.getTwo().getName() + " hp: " + userFirstHp + " -> ");
            System.out.println(user.getTwo().getHp());
        }

        //Prints which Pokemon won the second round of battle!
        if(user.getTwo().getHp() <= 0){
            System.out.println("Team Rocket Has defeated your second Pokemon!\n");

        }
        else if(ai.getTwo().getHp() <= 0){
            System.out.println("You have defeated Team Rocket's second pokemon!\n");

        }

        //This retrieves the number of overall wins from both the user and the ai
        int teamRocketWins = TeamRocket.getNumRocketWins();
        int trainerWins = Trainer.getNumTrainerWins();

        //This if-else logic prints out the ultimate winner of the battle
        if(teamRocketWins > trainerWins){
            System.out.println("\nUnfortunately, Team Rocket has defeated your pokemon! Better luck next time!");

        }

        else if(teamRocketWins < trainerWins){
            System.out.println("\nCongratulations, you have defeated Team Rocket! Team Rocket's blasting off again!");
        }
        else{
            System.out.println("\nYou got lucky this time! The battle ended in a tie, but Team Rocket will come back for revenge...");
        }
    }

    /**
     * This helper function returns a random int in order to pick the ai's move randomly
     * @param min This is the minimum
     * @param max This is the maximum
     * @return this function returns a random int
     */
    public static int getRandInt(int min, int max){
        return (int)(Math.random() * (max- min)) + min;
    }




}

import java.util.Random;

class Main {
  public static void main(String[] args)
  {
    String playerName;
    int starterPokemonChoice;
    Pokemon starterPokemon;

    // User input for their name
    System.out.println("Welcome new trainer! What is your name?");
    // Use the CheckInput class for the user inputs
    playerName = CheckInput.getString();

    System.out.println("Great to meet you, " + playerName);

    // User input for their starter pokemon
    System.out.println("Please choose your first pokemon:\n1. Charmander\n2. Bulbasaur\n3. Squirtle");

    // Use the CheckInput class for the user inputs (range for menu options)
    starterPokemonChoice = CheckInput.getIntRange(1, 3);

    switch(starterPokemonChoice) {
      case 1: 
        starterPokemon = new Charmander();
        break;
      case 2: 
        starterPokemon = new Bulbasaur();
        break;
      case 3: 
        starterPokemon = new Squirtle();
        break;
    }


  //display menu for item in the store, gets users' input,//checks that the user has enough money, spends the //money and gets the item if they do, otherwise //notifies the user that they don't have enough. 
  public static void store(Trainer t)
  {
    int val = 0;
    do{
      System.out.println("1. Buy Potion - $5\n2. Buy Poke Balls - $3\n3. Exit"); 
      val = CheckInput.getIntRange(1,3); 
      if (val == 1 & t.getMoney() >= 5)
      {
        System.out.println("Here's your potion");
        t.spendMoney(3);
        t.receivePotion();
      }
      else if (val == 2 & t.getMoney() >= 3) 
      {
        System.out.println("Here's your Pokeball");
        t.spendMoney(5);
        t.receivePokeball();
      }
      else
      {
        System.out.println("You are broke go make some money and come back later!");
      }
    }while(val != 3);
  }

  //generate randomly from 1 to 6 and choose from the wild pokemon
  public static Pokemon chooseRandomPokemon()
  {
    Random rand = new Random();
    Pokemon randPokemon = null;

    switch(rand.nextInt(6)) {
      case 0:
        randPokemon = new Bulbasaur();
      case 1:
        randPokemon = new Charmander();
      case 2:
        randPokemon = new Oddish();
      case 3:
        randPokemon = new Ponyta();
      case 4:
        randPokemon = new Squirtle();
      case 5:
        randPokemon = new Staryu();
    }
    return randPokemon;
  }

  public static void trainerAttack(Trainer t, Pokemon wild) {
    // Need the chooseRandomPokemon method completed
    // Will need to be moved to the wild pokemon event that the player lands on ("w")
    Pokemon wild = chooseRandomPokemon();
    System.out.println("A wild " + wild.getName() + "has appeared!");
    
    String wildMenu = "What do you want to do?\n1. Fight\n2. Use Potion\n3. Throw Poke Ball\n4. Run Away";

    System.out.println(trainAttack);
    int wildMenu = CheckInput.getIntRange(1, 4);
    int attackMove = "0";

    switch(attackChoice) {
      case 1:
        System.out.println("Choose a Pokemon:");
        System.out.println(t.getPokemonList());
    
        Pokemon chosenPokemon = t.getPokemon(CheckInput.getIntRange(1, t.getNumPokemon()));
        System.out.println(chosenPokemon.getName() + ", I choose you!");

        System.out.println(chosenPokemon.getAttackMenu());
        System.out.println()

    }






    







    
  }

}
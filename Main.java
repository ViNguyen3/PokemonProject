import java.util.Random;
class Main {
  public static void main(String[] args)
  {
    String playerName;
    int starterPokemonChoice;
    Pokemon starterPokemon;
    int playerChoice;
    char mapChar = 'n';
    int i = 0;//for the menu

    // User input for their name
    System.out.println("Prof. Oak: Welcome new trainer! What is your name?");
    // Use the CheckInput class for the user inputs
    playerName = CheckInput.getString();

    System.out.println("Great to meet you, " + playerName);

    // User input for their starter pokemon
    System.out.println("Please choose your first pokemon:\n1. Charmander\n2. Bulbasaur\n3. Squirtle");

    // Use the CheckInput class for the user inputs (range for menu options)
    starterPokemonChoice = CheckInput.getIntRange(1, 3);
    //initializing the starterPokemon to avoid errors 
    starterPokemon = new Charmander();

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

    //construct map and trainer object 
    Map mainMap = new Map();
    Trainer player = new Trainer(playerName,starterPokemon,mainMap);
    //printing will be toString in Trainer class, as long as player doesn't quit the game, the program keep printing and updating the map and other stuffs.
    do
    {
      //options for different choices, as well as overriding mapchar 
      player.toString(); 
      i = mainMenu(); 
      if(i == 1)
      {
        mapChar = player.goNorth(); 
      }
      else if (i == 2) 
      {
        mapChar = player.goSouth(); 
      }
      else if (i == 3)
      {
        mapChar = player.goEast(); 
      }
      else if (i == 4)
      {
        mapChar = player.goWest();
      }

      if (mapChar == 'n') 
      {
        System.out.println("There's nothing here");
      }
      else if (mapChar == 'f')
      {
        mainMap.loadMap();
      }
      else if (mapChar == 'i')
      {
        Random rand = new Random(); 
        int or = rand.nextInt(10);
        if(or >= 5)
        {
          player.receivePokeball();
        }
        else 
        {
          player.receivePotion();
        }
      }
      else if (mapChar == 'w')
      {
        
      }
      else if (mapChar == 'p')
      {

      }
      else if (mapChar == 'c')
      {
        System.out.println("You have entered the city.\nWhere would you like to go ?\n1. Store\n2. Pokemon Hospital");
        int pc = CheckInput.getIntRange(1, 2);
        if (pc == 1)
        {
          Main.store(player); 
        }
        else
        {
          System.out.println("Hello, welcome to the pokemon hospital.\nPoor you little pokemons got a horrible master!\nLet me fix you up.")
          player.healAllPokemon();
        }
      } 
    }while(i != 5);   
    
   }


  //print main menu 
  public static int mainMenu() 
  {
    System.out.println("Main Meny:\n1. Go North\n2. Go South\n3. Go East\n4. Go West\n5. Quit");
    int choice = CheckInput.getIntRange(1, 5);
    return choice;
  }

  //display menu for item in the store, gets users' input,checks that the user has enough money, spends the money and gets the item if they do, otherwise notifies the user that they don't have enough. 
  public static void store(Trainer t)
  {
    int val = 0;
    do{
      System.out.println("Hello, you wanna spend your precious money!\n1. Buy Potion - $5\n2. Buy Poke Balls - $3\n3. Exit"); 
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
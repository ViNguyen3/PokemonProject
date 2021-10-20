import java.util.Random;
import java.io.FileNotFoundException;;
class Main {
  public static void main(String[] args) throws FileNotFoundException
  {
    String playerName;
    int starterPokemonChoice;
    Pokemon starterPokemon;
    int playerChoice;
    char mapChar = 'n';
    int i = 0;//for the menu
    int mapNumber = 1; //initally load map 1
    String p1 = "You run into A\nA: Where's my money that you borrow before to buy pokeballs!\nA rob half of your money."; 
    String p2 = "You run into B\nB: Hey, remember you bully me when we were in primary school\n（；¬＿¬)\nB smack and slap you for for being a bad kid for half your health."; 
    String p3 = "You run into C\nC: Oi, Onii-chan~~(｡•̀ᴗ-)✧\nC kissed you (⁄ ⁄•⁄ω⁄•⁄ ⁄) and heal you to full health"; 
    String p4 = "You run into C's dad\nC's dad: How dare you decieve my daughter!\n(╬ Ò ‸ Ó)\nC's dad smack you for 10 health and took all your money cause the game hates you!";  
    // User input for their name
    System.out.println("Prof. Oak: Welcome new trainer! What is your name?");
    // Use the CheckInput class for the user inputs
    playerName = CheckInput.getString();

    System.out.println("ʕథ౪థʔ What a bad name, " + playerName + " are you serious! LOL!!!");

    // User input for their starter pokemon
    System.out.println("Anywayas please choose your first pokemon:\n1. Charmander\n2. Bulbasaur\n3. Squirtle");

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
    mainMap.loadMap(mapNumber);//load map 1 
    Trainer player = new Trainer(playerName,starterPokemon,mainMap);
    System.out.println(player.toString());
    //printing will be toString in Trainer class, as long as player doesn't quit the game, the program keep printing and updating the map and other stuffs.
    do
     {
      //options for different choices, as well as overriding mapchar 
      player.toString(); 
      i = mainMenu(); 
      if(i == 1)
      {
        mapChar = player.goNorth(); 
        // System.out.println(player.toString());
      }
      else if (i == 2) 
      {
        mapChar = player.goSouth(); 
        // System.out.println(player.toString());
      }
      else if (i == 3)
      {
        mapChar = player.goEast(); 
        // System.out.println(player.toString());
      }
      else if (i == 4)
      {
        mapChar = player.goWest();
        // System.out.println(player.toString());
      }
      else if(i == 5)
      {
        System.out.println("Game over!");
        break;
      }
      System.out.println(player.toString());
      //leave it ask instructor later how to keep the same loc for the next map
      if (mapChar == 's')
      {
        System.out.println("Nothing here");
      }
      else if (mapChar == 'n') 
      {
        System.out.println("There's nothing here");
      }
      //load the next map and loop back 
      //when loop back do you keep the old value or reset all of them
      //also keep the old location to transfer to the new map
      else if (mapChar == 'f')
      {
        System.out.println("Loading next map");
        if(mapNumber == 1)
        {
          mainMap.loadMap(2);
        }
        else if (mapNumber == 2)
        {
          mainMap.loadMap(3);
        }
        else if (mapNumber == 3)
        {
          mainMap.loadMap(1);
        }
        System.out.println(player.toString());
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
        // Randomize wild pokemon and reveal to player
        Pokemon wild = chooseRandomPokemon();
        System.out.println("A wild " + wild.getName() + "has appeared!");
        // trainerAttack(player, wild);
      }
      else if (mapChar == 'p')
      {
        //randomzie number to choose which one to print out 
        Random num = new Random(); 
        int num2 = num.nextInt(4); 
        switch(num2)
        {
          case 1: 
            System.out.println(p1);
            player.spendMoney((int)((player.getMoney())/2)); 
            break;
          case 2: 
            System.out.println(p2);
            player.takeDamage((int)(player.getHp()/2)); 
            break;
          case 3: 
            System.out.println(p3);
            player.heal();
            break;
          case 4: 
            System.out.println(p4);
            player.takeDamage(10); 
            player.spendMoney(player.getMoney()); 
            break; 
        }   
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
          System.out.println("Hello, welcome to the pokemon hospital.\nPoor you little pokemons got a horrible master!\nLet me fix you up.");
          player.healAllPokemon();
         }
       } 
     }while(i != 5);   
   
   }


  //print main menu 
  public static int mainMenu() 
  {
    System.out.println("Main Menu:\n1. Go North\n2. Go South\n3. Go East\n4. Go West\n5. Quit");
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
      if (val == 3)
      {
        System.out.println("Good bye then! ");
      }
      else if (val == 1 & t.getMoney() >= 5)
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
      else//break the loop when player have no money 
      {
        System.out.println("You are broke go make some money and come back later!");
        break; 
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

  // public static void trainerAttack(Trainer t, Pokemon wild) {

  //   Random rand = new Random();
  //   String wildMenu = "What do you want to do?\n1. Fight\n2. Use Potion\n3. Throw Poke Ball\n4. Run Away";

  //   System.out.println(wildMenu);
  //   int wildChoice = CheckInput.getIntRange(1, 4);

  //   // 
  //   switch(wildChoice) {
  //     // 1. Fight
  //     case 1:
  //       System.out.println("Choose a Pokemon:");
  //       System.out.println(t.getPokemonList());
    
  //       // Choose from list of pokemon and display chosen pokemon
  //       Pokemon chosenPokemon = t.getPokemon(CheckInput.getIntRange(1, t.getNumPokemon()));
  //       System.out.println(chosenPokemon.getName() + ", I choose you!");
        
  //       // Display and choose attack set (basic or special)
  //       System.out.println(chosenPokemon.getAttackMenu());
  //       int attackChoice = CheckInput.getIntRange(1, chosenPokemon.getNumAttackMenuItems());
        
  //       // Display and choose 1. Basic attack
  //       if (attackChoice == 1) {
  //         System.out.println(chosenPokemon.getBasicMenu());
  //         System.out.println(chosenPokemon.basicAttack(wild, CheckInput.getIntRange(1, chosenPokemon.getNumBasicMenuItems())));
  //       }

  //       // Display and choose 2. Special attack
  //       else if(attackChoice == 2) 
  //       {
  //         System.out.println(chosenPokemon.getSpecialMenu()); 
  //         System.out.println(chosenPokemon.specialAttack(wild, CheckInput.getIntRange(1,chosenPokemon.getNumSpecialMenuItems()))); 
  //       }

  //       // Wild Pokemon's move *NOT DONE*
  //       System.out.println("The wild " + wild.getName() + " is getting ready to charge!");
  //       int wildAttack = rand.nextInt(2) + 1;
        
  //       // If the wildChoice is 1, choose random basic attack
  //       if (wildAttack == 1) {
  //         System.out.println(wild.basicAttack(chosenPokemon, rand.nextInt(wild.getNumBasicMenuItems) + 1));
  //       }
  //       // If the wildChoice is 2, choose random special attack
  //       else if (wildAttack == 2) {
  //         System.out.println(wild.specialAttack(chosenPokemon, rand.nextInt(wild.getNumSpecialMenuItems) + 1));
  //       }

  //       // If chosen pokemon has no health, damage the trainer
  //       if (chosenPokemon.getHp() == 0) {
          
  //         int dmg = rand.nextInt(5) + 1;
          
  //         System.out.println(chosenPokemon.getName() + " has no more health left!");
  //         System.out.println("The wild " + wild.getName() + " charges and attacks you instead!");
  //         t.takeDamage(dmg);          

  //       }


  //       // End of Fight
  //       break;

  //     // 2. Use Potion
  //     case 2:
  //       // If trainer does not have potions, display and break
  //       if (!t.hasPotion()) {
  //         System.out.println("You do not have any potions left.");
  //         break;
  //       }

  //       // Display and choose pokemon for healing, use the potion on the pokemon
  //       System.out.println("Choose the pokemon that you want to heal:");
  //       System.out.println(t.getPokemonList());
  //       int pokemonChoice =  CheckInput.getIntRange(1, t.getNumPokemon());
  //       t.usePotion(pokemonChoice);

        
  //       // End of Use Potion
  //       break;

  //     // 3. Throw Pokeball
  //     case 3:

  //       // End of Throw Pokeball
  //       break;
  //   }
  // }

}
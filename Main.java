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
    // String p1 = "You run into A\nA: Where's my money that you borrow before to buy pokeballs!\nA rob half of your money."; 
    // String p2 = "You run into B\nB: Hey, remember you bully me when we were in primary school\n（；¬＿¬)\nB smack and slap you for for being a bad kid for half your health."; 
    // String p3 = "You run into C\nC: Oi, Onii-chan~~(｡•̀ᴗ-)✧\nC kissed you (⁄ ⁄•⁄ω⁄•⁄ ⁄) and heal you to full health"; 
    // String p4 = "You run into C's dad\nC's dad: How dare you decieve my daughter!\n(╬ Ò ‸ Ó)\nC's dad smack you for 10 health and took all your money cause the game hates you!";  
    // User input for their name
    System.out.println("Prof. Oak: Welcome new trainer! What is your name?");
    // Use the CheckInput class for the user inputs
    playerName = CheckInput.getString();

    System.out.println("ʕథ౪థʔ What a bad name, " + playerName + " are you serious! LOL!!!");

    // User input for their starter pokemon
    System.out.println("Anyways, please choose your first pokemon:\n1. Charmander\n2. Bulbasaur\n3. Squirtle");

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
    // System.out.println(player.toString());
    //printing will be toString in Trainer class, as long as player doesn't quit the game, the program keep printing and updating the map and other stuffs.
    do
     {
      //options for different choices, as well as overriding mapchar 
      if (player.getHp() == 0) {
        System.out.println("Game Over!");
        break;
      }
      System.out.println(player.toString());
      i = mainMenu(); 
      if(i == 1)
      {
        mapChar = player.goNorth(); 
        if(mapChar == 'a')
        {
          System.out.println("Can't go that way");
        }
        // System.out.println(player.toString());  
      }
      else if (i == 2) 
      {
        mapChar = player.goSouth(); 
        if(mapChar == 'a')
        {
          System.out.println("Can't go that way");
        }
        // System.out.println(player.toString());
      }
      else if (i == 3)
      {
        mapChar = player.goEast();
        if(mapChar == 'a')
        {
          System.out.println("Can't go that way");
        } 
        // System.out.println(player.toString());
      }
      else if (i == 4)
      {
        mapChar = player.goWest();
        if(mapChar == 'a')
        {
          System.out.println("Can't go that way");
        }
        // System.out.println(player.toString());
      }
      else if(i == 5)
      {
        System.out.println("Game over!");
        break;
      }

      // System.out.println(player.toString())
      if (mapChar == 'n') 
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
      //add print statment 
      else if (mapChar == 'i')
      {
        Random rand = new Random(); 
        int or = rand.nextInt(10);
        if(or >= 5)
        {
          System.out.println("You got a pokeball");
          player.receivePokeball();
        }
        else 
        {
          System.out.println("You got a potion");
          player.receivePotion();
        }
        mainMap.removeCharAtLoc(player.getLocation());
      }
      else if (mapChar == 'w')
      {
        // Randomize wild pokemon and reveal to player
        int temp1 = player.getNumPokemon(); 
        Pokemon wild = chooseRandomPokemon();
        System.out.println("A wild " + wild.getName() + " has appeared!");
        System.out.println(wild.toString());
        trainerAttack(player, wild);
        if(wild.getHp() == 0 || temp1 < player.getNumPokemon()) 
        {
          mainMap.removeCharAtLoc(player.getLocation());
        }
      }
      else if (mapChar == 'p')
      {
        //randomzie number to choose which one to print out 
        Random num = new Random(); 
        int num2 = num.nextInt(5); 
        switch(num2)
        {
          case 0: 
            System.out.println("You run into A\nA: Where's my money that you borrow before to buy pokeballs!\nA rob half of your money.");
            player.spendMoney((int)((player.getMoney())/2)); 
            break;
          case 1: 
            System.out.println("You run into B\nB: Hey, remember you bully me when we were in primary school\n（；¬＿¬)\nB smack and slap you for for being a bad kid for half your health.");
            player.takeDamage((int)(player.getHp()/2)); 
            break;
          case 2: 
            System.out.println("You run into C\nC: Oi, Onii-chan~~(｡•̀ᴗ-)✧\nC kissed you (⁄ ⁄•⁄ω⁄•⁄ ⁄) and heal you to full health");
            player.heal();
            break;
          case 3: 
            System.out.println("You run into C's dad\nC's dad: How dare you decieve my daughter!\n(╬ Ò ‸ Ó)\nC's dad smack you for 10 health and took all your money cause the game hates you!");
            player.takeDamage(10); 
            player.spendMoney(player.getMoney()); 
            break; 
          case 4: 
            System.out.println("You run into C's husband\nC's husband: How dare you took my wife away!\n(╬ Ò ‸ Ó)\nC's husband stabbed you to dead and take all your money!");
            player.takeDamage(player.getHp()); 
            player.spendMoney(player.getMoney()); 
            break;
        }
        mainMap.removeCharAtLoc(player.getLocation());   
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
     }while(i != 5 || player.getHp() == 0);   
    
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
    int rand1 = rand.nextInt(6); 
    switch(rand1) {
      case 0:
        randPokemon = new Bulbasaur();
        break; 
      case 1:
        randPokemon = new Charmander();
        break;
      case 2:
        randPokemon = new Oddish();
        break;
      case 3:
        randPokemon = new Ponyta();
        break;
      case 4:
        randPokemon = new Squirtle();
        break;
      case 5:
        randPokemon = new Staryu();
        break;
    }
    return randPokemon;
  }

  public static void trainerAttack(Trainer t, Pokemon wild) {

    Random rand = new Random();

    boolean battle = true;
    
    

    while (battle) {

      if (wild.getHp() == 0) {
        System.out.println("The wild " + wild.getName() + " has been defeated!");
        System.out.println("Setting battle to: " + battle);
        break;
      } 
      else if(t.getHp() == 0)
      {
        break;
      }
      String wildMenu = "What do you want to do?\n1. Fight\n2. Use Potion\n3. Throw Poke Ball\n4. Run Away";

      System.out.println(wildMenu);
      int wildChoice = CheckInput.getIntRange(1, 4);
       


      switch(wildChoice) {
        // 1. Fight
        case 1:
          System.out.println("Choose a Pokemon:");
          System.out.println(t.getPokemonList());
      
          // Choose from list of pokemon and display chosen pokemon
          Pokemon chosenPokemon = t.getPokemon(CheckInput.getIntRange(1, t.getNumPokemon()));
          System.out.println(chosenPokemon.getName() + ", I choose you!");
          


          // If chosen pokemon has no health, damage the trainer
          if (chosenPokemon.getHp() == 0 ) {
            
            int dmg = rand.nextInt(10) + 1;
            
            System.out.println(chosenPokemon.getName() + " has no more health left!");
            System.out.println("The wild " + wild.getName() + " charges and attacks you instead!");
            System.out.println("You take " + dmg + " damage!");
            t.takeDamage(dmg);
            battle = false;
            break;          
          }        

          // Display and choose attack set (basic or special)
          System.out.println(chosenPokemon.getAttackMenu());
          int attackChoice = CheckInput.getIntRange(1, chosenPokemon.getNumAttackMenuItems());
          
          // Display and choose 1. Basic attack
          if (attackChoice == 1) {
            System.out.println(chosenPokemon.getBasicMenu());
            System.out.println(chosenPokemon.basicAttack(wild, CheckInput.getIntRange(1, chosenPokemon.getNumBasicMenuItems())));
          }

            // Display and choose 2. Special attack
          else if (attackChoice == 2) {
            System.out.println(chosenPokemon.getSpecialMenu()); 
            System.out.println(chosenPokemon.specialAttack(wild, CheckInput.getIntRange(1,chosenPokemon.getNumSpecialMenuItems()))); 
          }


            // Wild Pokemon's random move (basic or attack)
          System.out.println("The wild " + wild.getName() + " is getting ready to charge!");
          int wildAttack = rand.nextInt(2) + 1;
          
          // If the wildChoice is 1, choose random basic attack
          if (wildAttack == 1) {
          System.out.println(wild.basicAttack(chosenPokemon, rand.nextInt(3) + 1));
          System.out.println(wild.toString());
          }

          // If the wildChoice is 2, choose random special attack
          else if (wildAttack == 2) {
          System.out.println(wild.specialAttack(chosenPokemon, rand.nextInt(3) + 1));
          System.out.println(wild.toString());
          }

          // End of Fight
          break;

        // 2. Use Potion
        case 2: 

          // If trainer does not have potions, display and break
          if (!t.hasPotion()) {
            System.out.println("You do not have any potions left.");
            break;
          }

          // Display and choose pokemon for healing, use the potion on the pokemon
          System.out.println("Choose the pokemon that you want to heal:");
          System.out.println(t.getPokemonList());
          
          int pokemonChoice =  CheckInput.getIntRange(0, t.getNumPokemon());
          Pokemon healPokemon = t.getPokemon(pokemonChoice);
          
          if(healPokemon.getHp() == healPokemon.getMaxHp()) {
            System.out.println(healPokemon.getName() + " is at full health, cannot be healed.");
          }
          else {
            System.out.println("You chose to heal " + healPokemon.getName());
            t.usePotion(pokemonChoice);
          }
          
          // End of Use Potion
          break;

        // 3. Throw Pokeball
        case 3:
          if (!t.hasPokeball()) {
            System.out.println("You do not have any pokeballs left.");
            break;
          }

          if (t.catchPokemon(wild)) {
            System.out.println("You have captured " + wild.getName() + "!");
            battle = false;
            break;
          }

          else {
            System.out.println("You did not capture " + wild.getName() + "!");
          }

          // End of Throw Pokeball
          break;

        // 4. Run Away
        case 4: 
          int rand1 = rand.nextInt(4); 
          switch(rand1) {
            case 0:
              if(t.goNorth() != 'a')
              {
                battle = false; 
                break;
              }
            case 1:
              if( t.goSouth() != 'a')
              {
                battle = false; 
                break;
              }
            case 2:
              if(t.goEast() != 'a')
              {
                battle = false; 
                break;
              }
            case 3:
              if(t.goWest() != 'a')
              {
                battle = false; 
                break;
              }
            

        //   }while(temp != 'a');
          
        
        }
      }

      }
  }
}
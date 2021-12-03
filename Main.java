import java.util.Random;
import java.io.FileNotFoundException;;

/**
* The Main class for our Pokemon game project
* @author Dylan Ros
* @author Vi Nguyen
*/
class Main {
  /**
  * The main method is in charge of user prompts, the construction of Map and Trainer objects, the display of the map, directions, the ability to quit the game, and various events depending on the trainer's position on the map.
  */
  public static void main(String[] args) throws FileNotFoundException
  {
    String playerName;
    int starterPokemonChoice;
    Pokemon starterPokemon;
    PokemonGenerator pokemonGen = PokemonGenerator.getInstance();
    char mapChar = 'n';
    int i = 0;//for the menu
    int mapNumber = 1; //initally load map 1


    System.out.println("================================================================================");
    System.out.println("||(Maybe)                           ,'\\                                       ||");
    System.out.println("||    _.----.        ____         ,'  _\\   ___    ___     ____                ||");
    System.out.println("||_,-'       `.     |    |  /`.   \\,-'    |   \\  /   |   |    \\  |`.          ||");
    System.out.println("||\\      __    \\    '-.  | /   `.  ___    |    \\/    |   '-.   \\ |  |         ||");
    System.out.println("|| \\.    \\ \\   |  __  |  |/    ,','_  `.  |          | __  |    \\|  |         ||");
    System.out.println("||   \\    \\/   /,' _`.|      ,' / / / /   |          ,' _`.|     |  |         ||");
    System.out.println("||    \\     ,-'/  /   \\    ,'   | \\/ / ,`.|         /  /   \\  |     |         ||");
    System.out.println("||     \\    \\ |   \\_/  |   `-.  \\    `'  /|  |    ||   \\_/  | |\\    |         ||");
    System.out.println("||      \\    \\ \\      /       `-.`.___,-' |  |\\  /| \\      /  | |   |         ||");
    System.out.println("||       \\    \\ `.__,'|  |`-._    `|      |__| \\/ |  `.__,'|  | |   |         ||");
    System.out.println("||        \\_.-'       |__|    `-._ |              '-.|     '-.| |   |         ||");
    System.out.println("||                                `'                            '-._|         ||");
    System.out.println("================================================================================");
    
    System.out.println("         ▄               ▄    ");
    System.out.println("        ▌▒█           ▄▀▒▌   ");
    System.out.println("        ▌▒▒█        ▄▀▒▒▒▐   ");
    System.out.println("       ▐▄█▒▒▀▀▀▀▄▄▄▀▒▒▒▒▒▐   ");
    System.out.println("     ▄▄▀▒▒▒▒▒▒▒▒▒▒▒█▒▒▄█▒▐   ");
    System.out.println("   ▄▀▒▒▒░░░▒▒▒░░░▒▒▒▀██▀▒▌   ");
    System.out.println("  ▐▒▒▒▄▄▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▀▄▒▌  ");
    System.out.println("  ▌░░▌█▀▒▒▒▒▒▄▀█▄▒▒▒▒▒▒▒█▒▐  ");
    System.out.println(" ▐░░░▒▒▒▒▒▒▒▒▌██▀▒▒░░░▒▒▒▀▄▌ ");
    System.out.println(" ▌░▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░▒▒▒▒▌ ");
    System.out.println("▌▒▒▒▄██▄▒▒▒▒▒▒▒▒░░░░░░░░▒▒▒▐ ");
    System.out.println("▐▒▒▐▄█▄█▌▒▒▒▒▒▒▒▒▒▒░▒░▒░▒▒▒▒▌");
    System.out.println("▐▒▒▐▀▐▀▒▒▒▒▒▒▒▒▒▒▒▒▒░▒░▒░▒▒▐ ");
    System.out.println(" ▌▒▒▀▄▄▄▄▄▄▒▒▒▒▒▒▒▒░▒░▒░▒▒▒▌ ");
    System.out.println(" ▐▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒░▒▒▄▒▒▐  ");
    System.out.println("  ▀▄▒▒▒▒▒▒▒▒▒▒▒▒▒░▒░▒▄▒▒▒▒▌  ");
    System.out.println("    ▀▄▒▒▒▒▒▒▒▒▒▒▄▄▄▀▒▒▒▒▄▀   ");
    System.out.println("      ▀▄▄▄▄▄▄▀▀▀▒▒▒▒▒▄▄▀     ");
    System.out.println("         ▀▀▀▀▀▀▀▀▀▀▀▀        ");
    System.out.println(); 
    System.out.println("------------------------------------------------------------");
    // System.out.println("Prof.Doge: Welcome new trainer! What is your name?");
    System.out.println("  Prof.Doge: Are you going to abuse the animal in here again!");
    System.out.println("--------------------------------------------------------------");
    System.out.println("1. Yes sir\n2. No sir I'm sorry");
    int response = CheckInput.getIntRange(1,2);  
    switch(response)
    {
      case 1: 
      System.out.println("　  ───────▄▀▀▀▀▀▀▀▀▀▀▄▄");
        System.out.println("　────▄▀▀─────────────▀▄");
        System.out.println("　──▄▀──────────────────▀▄");
        System.out.println("　──█─────────────────────▀▄");
        System.out.println("　─▐▌────────▄▄▄▄▄▄▄───────▐▌");
        System.out.println("　─█───────────▄▄▄▄──▀▀▀▀▀──█");
        System.out.println("　▐▌───────▀▀▀▀─────▀▀▀▀▀───▐▌");
        System.out.println("　█─────────▄▄▀▀▀▀▀────▀▀▀▀▄─█");
        System.out.println("　█────────────────▀───▐─────▐▌");
        System.out.println("　▐▌─────────▐▀▀██▄──────▄▄▄─▐▌");
        System.out.println("　─█───────────▀▀▀──────▀▀██──█");
        System.out.println("　─▐▌────▄─────────────▌──────█");
        System.out.println("　──▐▌──▐──────────────▀▄─────█");
        System.out.println("　───█───▌────────▐▀────▄▀───▐▌");
        System.out.println("　───▐▌──▀▄────────▀─▀─▀▀───▄▀");
        System.out.println("　───▐▌──▐▀▄────────────────█");
        System.out.println("　───▐▌───▌─▀▄────▀▀▀▀▀▀───█");
        System.out.println("　───█───▀────▀▄──────────▄▀");
        System.out.println("　──▐▌──────────▀▄──────▄▀");
        System.out.println("　─▄▀───▄▀────────▀▀▀▀█▀");
        System.out.println("　▀───▄▀──────────▀───▀▀▀▀▄▄▄▄▄");
        System.out.println("-------------------------------------------------------------");  
        System.out.println("Prof.Doge: My disappointment is immesurable and my day is ruined by YOU!"); 
        System.out.println("-------------------------------------------------------------");
        break;
      case 2: 
        System.out.println("-------------------------------------------------------------");      
        System.out.println("Prof.Doge: Good job you are a good person! Now go and give my group 100 points!");
        System.out.println("-------------------------------------------------------------");
        System.out.println(" _____   ___  ___  ___ _____   _____  _   _ ___________  ");
        System.out.println("|  __ \\ / _ \\ |  \\/  ||  ___| |  _  || | | |  ___| ___ \\ ");
        System.out.println("| |  \\// /_\\ \\| .  . || |__   | | | || | | | |__ | |_/ / ");
        System.out.println("| | __ |  _  || |\\/| ||  __|  | | | || | | |  __||    /  ");
        System.out.println("| |_\\ \\| | | || |  | || |___  \\ \\_/ /\\ \\_/ / |___| |\\ \\  ");
        System.out.println(" \\____/\\_| |_/\\_|  |_/\\____/   \\___/  \\___/\\____/\\_| \\_| ");
        System.exit(0);
        break;
    }
    System.out.println("-------------------------------------------------------------");
    System.out.println("Prof.Doge: Hurry up what is your name then?");
    System.out.println("-------------------------------------------------------------");
    playerName = CheckInput.getString();
    System.out.println("");
    System.out.println("-------------------------------------------------------------");
    System.out.println("Prof.Doge: ﾉ｡≧◇≦）ﾉ What a bad name, " + playerName + " are you serious! LOL!!!");
    System.out.println("-------------------------------------------------------------");
    System.out.println("-------------------------------------------------------------");
    System.out.println("Prof.Doge: Anyways, please choose your first pokemon:\n1. Charmander\n2. Bulbasaur\n3. Squirtle");
    System.out.println("-------------------------------------------------------------");

    // Use the CheckInput class for the user inputs (range for menu options)
    starterPokemonChoice = CheckInput.getIntRange(1, 3);
    System.out.println("");

    // Initializing the starterPokemon to avoid errors 
    starterPokemon = null;

    switch(starterPokemonChoice) {
      case 1: 
        System.out.println(pokemonGen.getPokemon("Charmander"));
        starterPokemon = pokemonGen.getPokemon("Charmander");
        System.out.println("              _.--\"\"`-..");
        System.out.println("            ,'          `.");
        System.out.println("          ,'          __  `.");
        System.out.println("         /|          \" __  \\");
        System.out.println("        , |           / |.   .");
        System.out.println("        |,'          !_.'|   |");
        System.out.println("      ,'             '   |   |");
        System.out.println("     /              |`--'|   |");
        System.out.println("    |                `---'   |");
        System.out.println("     .   ,                   |                       ,\".");
        System.out.println("      ._     '           _'  |                    , ' \\ `");
        System.out.println("  `.. `.`-...___,...---\"\"    |       __,.        ,`\"   L,|");
        System.out.println("  |, `- .`._        _,-,.'   .  __.-'-. /        .   ,    \\");
        System.out.println("-:..     `. `-..--_.,.<       `\"      / `.        `-/ |   .");
        System.out.println("  `,         \"\"\"\"'     `.              ,'         |   |  ',,");
        System.out.println("    `.      '            '            /          '    |'. |/");
        System.out.println("      `.   |              \\       _,-'           |       ''");
        System.out.println("        `._'               \\   '\"\\                .      |");
        System.out.println("           |                '     \\                `._  ,'");
        System.out.println("           |                 '     \\                 .'|");
        System.out.println("           |                 .      \\                | |");
        System.out.println("           |                 |       L              ,' |");
        System.out.println("           `                 |       |             /   '");
        System.out.println("            \\                |       |           ,'   /");
        System.out.println("          ,' \\               |  _.._ ,-..___,..-'    ,'");
        System.out.println("         /     .             .      `!             ,j'");
        System.out.println("        /       `.          /        .           .'/");
        System.out.println("       .          `.       /         |        _.'.'");
        System.out.println("        `.          7`'---'          |------\"'_.'");
        System.out.println("       _,.`,_     _'                ,''-----\"'");
        System.out.println("   _,-_    '       `.     .'      ,\\");
        System.out.println("   -\" /`.         _,'     | _  _  _.|");
        System.out.println("    \"\"--'---\"\"\"\"\"'        `' '! |! /");
        System.out.println("                            `\" \" -'");   
        break;
      case 2: 
        starterPokemon = pokemonGen.getPokemon("Bulbasaur");
        System.out.println("                                        /  ");
        System.out.println("                        _,.------....___,.' ',.-.");
        System.out.println("                     ,-'          _,.--\"        |");
        System.out.println("                   ,'         _.-'              .");
        System.out.println("                  /   ,     ,'                   `");
        System.out.println("                 .   /     /                     ``.");
        System.out.println("                 |  |     .                       \\.\\");
        System.out.println("       ____      |___._.  |       __               \\ `.");
        System.out.println("     .'    `---\"\"       ``\"-.--\"'`  \\               .  \\");
        System.out.println("    .  ,            __               `              |   .");
        System.out.println("    `,'         ,-\"'  .               \\             |    L");
        System.out.println("   ,'          '    _.'                -._          /    |");
        System.out.println("  ,`-.    ,\".   `--'                      >.      ,'     |");
        System.out.println(" . .'\\'   `-'       __    ,  ,-.         /  `.__.-      ,'");
        System.out.println(" ||:, .           ,'  ;  /  / \\ `        `.    .      .'/");
        System.out.println(" j|:D  \\          `--'  ' ,'_  . .         `.__, \\   , /");
        System.out.println("/ L:_  |                 .  \"' :_;                `.'.'");
        System.out.println(".    \"\"'                  \"\"\"\"\"'                    V");
        System.out.println(" `.                                 .    `.   _,..  `");
        System.out.println("   `,_   .    .                _,-'/    .. `,'   __  `");
        System.out.println("    ) \\`._        ___....----\"'  ,'   .'  \\ |   '  \\  .");
        System.out.println("   /   `. \"`-.--\"'         _,' ,'     `---' |    `./  |");
        System.out.println("  .   _  `\"\"'--.._____..--\"   ,             '         |");
        System.out.println("  | .\" `. `-.                /-.           /          ,");
        System.out.println("  | `._.'    `,_            ;  /         ,'          .");
        System.out.println(" .'          /| `-.        . ,'         ,           ,");
        System.out.println(" '-.__ __ _,','    '`-..___;-...__   ,.'\\ ____.___.'");
        System.out.println(" `\"^--'..'   '-`-^-'\"--    `-^-'`.''\"\"\"\"\"`.,^.`.--'");
        break;
      case 3: 
        starterPokemon = pokemonGen.getPokemon("Squirtle");
        System.out.println("               _,........__");
        System.out.println("            ,-'            \"`-.");
        System.out.println("          ,'                   `-.");
        System.out.println("        ,'                        \\");
        System.out.println("      ,'                           .");
        System.out.println("      .'\\               ,\"\".       `");
        System.out.println("     ._.'|             / |  `       \\");
        System.out.println("     |   |            `-.'  ||       `.");
        System.out.println("     |   |            '-._,'||       | \\");
        System.out.println("     .`.,'             `..,'.'       , |`-.");
        System.out.println("     l                       .'`.  _/  |   `.");
        System.out.println("     `-.._'-   ,          _ _'   -\" \\  .     `");
        System.out.println("`.\"\"\"\"\"'-.`-...,---------','         `. `....__.");
        System.out.println(".'        `\"-..___      __,'\\          \\  \\     \\");
        System.out.println("\\_ .          |   `\"\"\"\"'    `.           . \\     \\");
        System.out.println("  `.          |              `.          |  .     L");
        System.out.println("    `.        |`--...________.'.        j   |     |");
        System.out.println("      `._    .'      |          `.     .|   ,     |");
        System.out.println("         `--,\\       .            `7\"\"' |  ,      |");
        System.out.println("            ` `      `            /     |  |      |    _,-'\"\"\"`-.");
        System.out.println("             \\ `.     .          /      |  '      |  ,'          `.");
        System.out.println("             \\  v.__  .        '       .   \\    /| /              \\");
        System.out.println("               \\/    `\"\"\\\"\"\"\"\"\"\"`.       \\   \\  /.''                |");
        System.out.println("                `        .        `._ ___,j.  `/ .-       ,---.     |");
        System.out.println("                ,`-.      \\         .\"     `.  |/        j     `    |");
        System.out.println("               /    `.     \\       /         \\ /         |     /    j");
        System.out.println("              |       `-.   7-.._ .          |\"          '         /");
        System.out.println("              |          `./_    `|          |            .     _,'");
        System.out.println("              `.           / `----|          |-............`---'");
        System.out.println("                \\          \\      |          |");
        System.out.println("               ,'           )     `.         |");
        System.out.println("                7____,,..--'      /          |");
        System.out.println("                                  `---.__,--.'");
        break;
    }

    // Construct map and trainer object 
    // Map mainMap = new Map();
    Map.getInstance().loadMap(mapNumber);//load map 1 
    Trainer player = new Trainer(playerName,starterPokemon);
    // Printing will be toString in Trainer class, as long as player doesn't quit the game, the program keep printing and updating the map and other stuffs.
    do
     {
      // Options for different choices, as well as overriding mapchar 
      if (player.getHp() == 0) {
        System.out.println("__   _______ _   _  ______ _____ ___________ ");
        System.out.println("\\ \\ / /  _  | | | | |  _  \\_   _|  ___|  _  \\");
        System.out.println(" \\ V /| | | | | | | | | | | | | | |__ | | | |");
        System.out.println("  \\ / | | | | | | | | | | | | | |  __|| | | |");
        System.out.println("  | | \\ \\_/ / |_| | | |/ / _| |_| |___| |/ / ");
        System.out.println("  \\_/  \\___/ \\___/  |___/  \\___/\\____/|___/  ");
        // System.out.println("\n YOU DIED ");
        // System.out.println("\n GAME OVER");
        break;
      }
      System.out.println(player.toString());
      i = mainMenu(); 
      if(i == 1)
      {
        mapChar = player.goNorth(); 
        if(mapChar == 'a')
        {
          System.out.println("Can't go that way\n");
        }
      }
      else if (i == 2) 
      {
        mapChar = player.goSouth(); 
        if(mapChar == 'a')
        {
          System.out.println("Can't go that way\n");
        }
      }
      else if (i == 3)
      {
        mapChar = player.goEast();
        if(mapChar == 'a')
        {
          System.out.println("Can't go that way\n");
        } 
      }
      else if (i == 4)
      {
        mapChar = player.goWest();
        if(mapChar == 'a')
        {
          System.out.println("Can't go that way\n");
        }
      }
      else if(i == 5)
      {
        System.out.println("Game Over!");
        break;
      }

      if (mapChar == 'n') 
      {
        System.out.println("There's nothing here\n");
      }
      // Load the next map and loop back 
      // Also keep the old location to transfer to the new map
      else if (mapChar == 'f')
      {
        System.out.println(" ______  _______ ______ ______    _______ _ _______ _     _ _______");
        System.out.println("(____  \\(_______) _____) _____)  (_______) (_______|_)   (_|_______)  ");
        System.out.println(" ____)  )_     ( (____( (____     _____  | |_   ___ _______    _      ");
        System.out.println("|  __  (| |   | \\____ \\\\____ \\   |  ___) | | | (_  |  ___  |  | |     ");
        System.out.println("| |__)  ) |___| |____) )____) )  | |     | | |___) | |   | |  | |     ");
        System.out.println("|______/ \\_____(______(______/   |_|     |_|\\_____/|_|   |_|  |_|     ");
        Pokemon tempPoke = PokemonGenerator.getInstance().generateRandomPokemon(mapNumber + 2);
        Trainer gymLeader = new Trainer("Gym leader", tempPoke);
        System.out.println("The gym leader has appeared! Get ready for battle!\nThey have a " + tempPoke.getName() + "!\n");
        gymAttack(player, gymLeader, tempPoke);
        // gymAttack(player,tempPoke);
        if(tempPoke.getHp() == 0) 
        {
          Map.getInstance().removeCharAtLoc(player.getLocation());
          System.out.println("You have defeated the gym leader and their pokemon!\nAll of your pokemons have received a random buff!\nNow it is time to move on...\nLoading next map...\n");
          player.buffAllPokemon();
          if(mapNumber == 1)
          {
            Map.getInstance().loadMap(2);
            mapNumber++; 
          }
          else if (mapNumber == 2)
          {
            Map.getInstance().loadMap(3);
            mapNumber++; 
          }
          else if (mapNumber == 3)
          {
            Map.getInstance().loadMap(1);
            mapNumber = 1; 
          }
        }
        else
        {
          System.out.println("You have lost the battle against the gym leader!");
          Random rand = new Random();
          int rand3 = rand.nextInt(4); 
          System.out.println("\nYou failed to defeat the gym leader's " + tempPoke.getName() + " and ran away!\nCome back when you're ready.\n");
          switch(rand3) {
            case 0:
              if(player.goNorth() != 'a')
              {
                break;
              }
            case 1:
              if(player.goSouth() != 'a')
              {
                break;
              }
            case 2:
              if(player.goEast() != 'a')
              {
                break;
              }
            case 3:
              if(player.goWest() != 'a')
              {
                break;
              }              
           }
        }
        

      }
      else if (mapChar == 'i')
      {
        Random rand = new Random(); 
        int or = rand.nextInt(10);
        if(or >= 5)
        {
          System.out.println("You got a pokeball!\n");
          player.receivePokeball();
        }
        else 
        {
          System.out.println("You got a potion!\n");
          player.receivePotion();
        }
        Map.getInstance().removeCharAtLoc(player.getLocation());
      }
      else if (mapChar == 'w')
      {
        // Randomize wild pokemon and reveal to player
        int temp1 = player.getNumPokemon(); 
        Pokemon wild = pokemonGen.generateRandomPokemon(mapNumber - 1);
        System.out.println("A wild " + wild.getName() + " has appeared!");
        System.out.println(wild.toString() + "\n");
        trainerAttack(player, wild);
        
        // Once the pokemon is defeated or captured, remove the w on the map
        if(wild.getHp() == 0 || temp1 < player.getNumPokemon()) 
        {
          Map.getInstance().removeCharAtLoc(player.getLocation());
        }
      }
      else if (mapChar == 'p')
      {
        //randomzie number to choose which one to print out 
        Random num = new Random(); 
        int num2 = num.nextInt(6); 
        switch(num2)
        {
          case 0: 
            // System.out.println("You run into Vegita from Dragon Ball\nVegita: Where's my money that you borrow before to buy pokeballs!\nA rob half of your money.");
            System.out.println("                                 ,");
            System.out.println("                           ,   ,'|");
            System.out.println("                         ,/|.-'   \\.");
            System.out.println("                        .-'  '       |.");
            System.out.println("                  ,  .-'              |");
            System.out.println("               /|,'                 |'");
            System.out.println("              / '                    |  ,");
            System.out.println("             /                       ,'/");
            System.out.println("          .  |          _              /");
            System.out.println("          \\`' .-.    ,' `.           |");
            System.out.println("          \\ /   \\ /      \\          /");
            System.out.println("          \\|    V        |        |  ,");
            System.out.println("            (           ) /.--.   ''\"/");
            System.out.println("             \"b.`. ,' _.ee'' 6)|   ,-'");
            System.out.println("              \"= --\"\"  )   ' /.-'");
            System.out.println("               \\ / `---\"   .\"|\'");
            System.out.println("                \\\"..-    .'  |.");
            System.out.println("                  `-__..-','   |");
            System.out.println("               __.) ' .-'/    /\\._");
            System.out.println("        _.--'/----..--------. _.-\"\"-._");
            System.out.println("    .-'_)   \\.   /     __..-'     _.-'--.");
            System.out.println("    / -'/      \"\"\"\"\"\"\"\"\"         ,'-.   . `.");
            System.out.println("   | ' /                        /    `   `. \\");
            System.out.println("   |   |                        |         | |");
            System.out.println("    \\ .'\\                       |     \\     |");
            System.out.println("   / '  | ,'               . -  \\`.    |  / /");
            System.out.println("  / /   | |                      `/\"--. -' /\\");
            System.out.println("  | |     \\ \\                     /     \\     |");
            System.out.println("  | \\      | \\                 .-|      |    |");
            System.out.println("------------------------------------------------------------");
            System.out.println("Vegita: Do you know who Songoku is ?");
            System.out.println("--------------------------------------------------------------");
            System.out.println("1. Yes is it the guy that you hate\n2. No, who is that ?");
            int response1 = CheckInput.getIntRange(1,2); 
            switch(response1)
            {
              case 1: 
                System.out.println("--------------------------------------------------------------");
                System.out.println("Vegita: Good now where is my money then.");
                System.out.println("--------------------------------------------------------------");
                System.out.println("1. Here you go sir\n2. No what money??");
                int response2 = CheckInput.getIntRange(1,2); 
                switch(response2)
                {
                  case 1: 
                    System.out.println("------------------------------------------------------------"); 
                    System.out.println("Vegita: Due to your honesty here is my reward for you!");
                    System.out.println("------------------------------------------------------------"); 
                    System.out.println("**Vegita did not take the money and give you a potion as a gift");
                    player.receivePotion();
                    break;
                  case 2: 
                    System.out.println("------------------------------------------------------------"); 
                    System.out.println("Vegita: Imma teach you a lesson for not giving me my money back!");
                    System.out.println("------------------------------------------------------------"); 
                    System.out.println("**Vegita beated you to a pulp and take all your money!!");
                    if(player.getMoney() == 0)
                    {
                      System.out.println("**Dang go make some money you are realy poor?");
                    } 
                    else 
                    {
                      player.spendMoney((int)(player.getMoney())); 
                    }
                    player.takeDamage(10);
                    break;
                }
              break;
              case 2: 
                System.out.println("------------------------------------------------------------"); 
                System.out.println("Vegita: What do you mean you don't know! You borrowed my money to watch movie with him!!!!");
                System.out.println("------------------------------------------------------------"); 
                System.out.println("**Vegita took half of your money");
                player.spendMoney((int)((player.getMoney())/2)); 
              }
              break;
          case 1: 
                System.out.println("                                             ~  `        `   ~.");  
                System.out.println("                                         '                         .");  
                System.out.println("                                    .∩`                               .");  
                System.out.println("                                   »   `                                .");  
                System.out.println("                                    ,`      ,                            '");  
                System.out.println("                                '          ;            ,░     .");  
                System.out.println("                                  '       ▒ ,        ;  ▒░ :");  
                System.out.println("                              '  /    ∩ ░░` ▒   '    ▒ ;▒░ ░    ▒  : └    . »");  
                System.out.println("                                  ░  ≡ ;░▒ ▒▒       .░ ▒▒▒ ░    ▒            ⌂");  
                System.out.println("                                ∩/ ;,▒ ▒▒∩.░▒       ░ ╒ ▒░╓░    ░░  ░      . ε");  
                System.out.println("                            :   ░▒ ▒▒▒.▒▒H▒▒▒σφ▄    ▒ ! ▒▒▒░   ;▒▒  ▒    ` │ ░");  
                System.out.println("                                ▒░ ▒▒▒ ▒░r▒░▒ ┌ `╙*▒▒ ░ ▒▒▒▒,] ▒▒▒ j▒ ▒  ░   '");  
                System.out.println("                                ░▒░▒▒▒▒▒▄▄▒,▒ ▒  ╚ ;▒░  ▒▒▒ ;∩/\"▀▒φ▒░╓▒  ▒");  
                System.out.println("                          ┌ ░  ░▒▒▒▒▒▓\"`»^\"▒Å¥N░'▒\\│░▒ ░▒ ▒/░▒ ░▒▒/▒`▒▒ j▒ ┌");  
                System.out.println("                          '.   ▒░▒░▒H╚ └⌂` ╙▀ `' ` ╙ !░▒░└▒▄φ#╪α▒▒ ▒▒║▒,▒  '");  
                System.out.println("                           ░  ;▒▒▒▒▒ⁿ   gH]▒Ñ             ` ╓ -╒▓Ö▀▒ ▒▒▒▒▒⌡");  
                System.out.println("                         :,░  ▒░▒▒░▒    ≡~~                 \"   \"H`║ε▒▒▒▒ ⁿ");  
                System.out.println("                          ▒   ▒▒▒▒▒▒░              ;        └Ñ╔▒^   ▒▒▒░▒    ⌡");  
                System.out.println("                          ▒  ;░▒▒▒▒▒H              ⁿ         ░:ⁿ    ▒▒▒▒▒    `");  
                System.out.println("                         :▒  ▒▒▒▒▒┼▄▄                             ,▒▒▒░░ /");  
                System.out.println("                        ,┼▒  ▒▒▒▒▒]▓▓▓                           ,▒»▒▒▒░, '");  
                System.out.println("                      ┌╪▌║▓  `▒▒┼▒å▓▓▓▓         ╓▒▒φ            ╓▄▄╣▒▒▒▒▒");  
                System.out.println("                   *\"\"*▀▓║▓░  ▒▒▓▒▓▓▓▓▓`▒       ╙▒▒▒          ╓▓▓▓▓M▒▒▒▒ `");  
                System.out.println("               '         ╙▓▒  ▒▒▓▓▓▓▓▓▓ ]▒▒                ,▄▓▓▓▓▓▓░▒▒▒░/└");  
                System.out.println("                         ! ▓  ▒┼▓▓▓▓▓▓▓▄ ▒▒▒▒,         ,≡▒▓▓▓▓▓▓▓▓▌▒▒▒▒╒ ∩");  
                System.out.println("           '/               ¼ ▒]▓▓▓▓▓▓▓▓▓▄ ░▒▒▒φ ,,µ▒▒▒▒▒ ▓▓▓▓▓▓▓▓▒▒▒▒┌▓▓┌Nφ");  
                System.out.println("           ,                └ε╚╫▓▓▓▓▓▓▓▓▓▓▓▓▄░▒▒▒▒▒▒░,▄▄▓▓▓▓▓▓▓▓▓▌▌▒▒▒▓▓M▓ÑÑ▄");  
                System.out.println("                             ▓ⁿ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓H▒▒▓▓▓▓▓▀▀\"\"ⁿ.");  
                System.out.println("       ~*^```````'¬≡⌂       ░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▀' ");  
                System.out.println("------------------------------------------------------------"); 
                System.out.println("Saber: Hey hey buy me something to eat.");
                System.out.println("------------------------------------------------------------");       
                System.out.println("1.Fine, here is the money go buy yourself a burger I know you like that.\n2.Sorry I don't have time to waste for you.");
                int response5 = CheckInput.getIntRange(1, 2);
                switch(response5)
                {
                  case 1: 
                    System.out.println("------------------------------------------------------------"); 
                    System.out.println("Saber: Nice I love you " + player.getName());
                    System.out.println("------------------------------------------------------------"); 
                    if(player.getMoney() == 0)
                    {
                      System.out.println("**Dang go make some money you are realy poor?");
                    } 
                    else
                    {
                      player.spendMoney((int)(player.getMoney()/2));     
                    }
                    break;
                  case 2: 
                    System.out.println("------------------------------------------------------------"); 
                    System.out.println("Saber: Fine Imma buy it myself!");
                    System.out.println("------------------------------------------------------------");  
                    break;
                }
            break;
          case 2: 
            // System.out.println("You run into Hatsune Miku\nMiku: Oi, Onii-chan~~(｡•̀ᴗ-)✧\nC kissed you (⁄ ⁄•⁄ω⁄•⁄ ⁄) and heal you to full health");
            System.out.println("                                     ,╖φ≈╗≈≈≈┬,,     jMª%φ");
            System.out.println("                       gmφφ,    ╓d▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒>,│H  ]ⁿ");
            System.out.println("                       ▒    Ñ,ß▒▒▒▒▒▒▒░░░░▒░▒`  '`░░▒░Ñ  │H");
            System.out.println("                       ▒   ,▀▒▒▒▒▒░░▒░░   `░░▒░   `░▒▒▒▒ε Ñ");
            System.out.println("                       Ñ ╓Q▓▒▒▒]▒░░░▒▒N░░░ ░`▒▒▒ ░░░▒▒▒▒N▄▒nε╓");
            System.out.println("                      ╒Ñ#▀▓▒▒▒▒Ñ▒▒▌▒▒▒▒▓▄▒▒░░░ÅDU░▒░▒▒▒▒██H░▒▒▒,");
            System.out.println("                      │Ñ ▓▒▒▒▒å▓▒▒\"Ñ▒H▒▒Ü▀▄▒░░U╙▓░░░▒▒▒▒▒█▓░▒▒▒▒\\");
            System.out.println("                     ╔▒N█▒▒▒▒▒▓▓▒M  ▒▓▒▒▒ `ñ▄▒░▒▒▌░░▒▒▒▒Ñ▓▌N░▒▒▒▒░ε");
            System.out.println("                     ▌▓▓▓▒▒Ü▒▒▓▓╪,   ╣▓▒▒  .<▀▓▒▓Å░░▒▒▒▒▓█▀▒H░U░╙▒ *");
            System.out.println("                    ╞▒▓▓▌▌▒Ñ▒▓M╙▓     ╙▓▒U    `ÅÑ▓▒▒▓▒▒Ñ▒█M▀▓ε▒▒▒½▒ `");
            System.out.println("                    ╣▓▓▓▓▌▒▓▒▓░▄▓▄▄.   └▀▒  ▄▓███▓▒▒Ñ▒▒▓▒▒  ▀▓▒▒▒▒U▒▒░τ");
            System.out.println("                    ▓▓▓▓▓▒▒▓▌▓▐M▓█▓█⌐    \"%\"└▓▓▓▓▐▒╣▓▒▒▌▒▒½  ╙▓▒▒▒▒▓▒▒░y");
            System.out.println("                   ╒▓▓▓▓▓▌▒▓██▄ └▒▒▒         ╙┴┴`]▒▓▒▒▓█▒▒    └▓▒Ñ▒▒▓▒▒▒\\");
            System.out.println("                   ╞Ñ▓▓Ñ▓Å▒▒▓▓▓ε                 R░▌▒▒▓▀ ▓      ▀▓▓▒▓▓Ñ▒▒▒");
            System.out.println("                   ║▓▓▓▌▒ V▒▓▓▓▓                ' ▓▒▓▓^          ╙▓▓▒▓N▒Ñ▒░τ");
            System.out.println("                   ▓▓▓▓▓▒▓ Ü ╙▓██φ    «   ⌐ⁿ    ╓▓▓C              `▓▓▒▓▓▒▒▒░▒");
            System.out.println("                   ▓▓▓▓▓M▓N L  ╙▀▓5▄         ,≤`┘*¥                 ╙▓▒▓▓▒▒▒▒Q,");
            System.out.println("                   ▓▓▓▓▓ └▒▄      `╙ `~. ,╓m▒▒▒w                      ▀▒▓▓▓Ñ▒▒▒%");
            System.out.println("                   ▓▓▓▓▓  ║▒            ▐▒▒▒▒▒▒`\"     .╓─.             └▓▀▓▒▒Ñ▒▒▒*,  "); 
            System.out.println("------------------------------------------------------------");  
            System.out.println("Miku: Oi, Onii-chan~~(｡•̀ᴗ-)✧");
            System.out.println("------------------------------------------------------------");  
            System.out.println("1.(Push Miku aside) We shouldn't be together, you are too good for me.\n2. Let's go babeeeeee!!!(Might not be a good idea cause the programmer can be jealous sometimes...)");
            int response3 = CheckInput.getIntRange(1,2);
            switch(response3)
            {
              case 1:
                System.out.println("------------------------------------------------------------");  
                System.out.println("Miku: How could you (╥﹏╥)");
                System.out.println("------------------------------------------------------------");  
                System.out.println("**Miku cries and ran away in embarassment.");
                break;
              case 2:
                System.out.println("------------------------------------------------------------");  
                System.out.println("Miku: Let me kiss you (ɔˆ ³(ˆ⌣ˆc)");
                System.out.println("------------------------------------------------------------");  
                System.out.println("As a programmer with a life that only surrounds a computer and no time for finding a girlfriend. How dare you get one in this game " + player.getName());
                System.out.println(" _____   ___  ___  ___ _____   _____  _   _ ___________  ");
                System.out.println("|  __ \\ / _ \\ |  \\/  ||  ___| |  _  || | | |  ___| ___ \\ ");
                System.out.println("| |  \\// /_\\ \\| .  . || |__   | | | || | | | |__ | |_/ / ");
                System.out.println("| | __ |  _  || |\\/| ||  __|  | | | || | | |  __||    /  ");
                System.out.println("| |_\\ \\| | | || |  | || |___  \\ \\_/ /\\ \\_/ / |___| |\\ \\  ");
                System.out.println(" \\____/\\_| |_/\\_|  |_/\\____/   \\___/  \\___/\\____/\\_| \\_| ");
                System.exit(0);
            }
            break;
          case 3: 
            System.out.println("------------------------------------------------------------"); 
            System.out.println("Ever heard of World War II before ?");
            System.out.println("------------------------------------------------------------"); 
            System.out.println("1. Yes\n2. No what's that for ?");
            int response4 = CheckInput.getIntRange(1,2); 
            System.out.println("------------------------------------------------------------"); 
            System.out.println("Doesn't matter anyways!");
            System.out.println("------------------------------------------------------------"); 
            System.out.println("**You ran into an antitank mine from World War II!");
            System.out.println("      _.-^^---....,,--     ");
            System.out.println("  _--                  --_ ");
            System.out.println("<                        >)");
            System.out.println("|                         | ");
            System.out.println("  |._                   _./  ");
            System.out.println("    ```--. . , ; .--'''    ");
            System.out.println("         | |   |       ");
            System.out.println("      .-=||  | |=-.   ");
            System.out.println("      `-=#$%&%$#=-'   ");
            System.out.println("         | ;  :|    ");
            System.out.println("_____.,-#%&$@%#&#~,._____");
            player.takeDamage((int)(player.getHp()/2)); 
            break;
          case 4: 
            System.out.println("You were bamboozled by a tank and lose 5 health! ");
            System.out.println("         ________      ");
            System.out.println("     (( /========\\ ");
            System.out.println("     __/__________\\____________n_");
            System.out.println("   (( /              \\_____________]");
            System.out.println("     /  =(*)=          \\ ");
            System.out.println("    |_._._._._._._._._.|         ! ");
            System.out.println(" (( / __________________ \\      =o ");
            System.out.println("   | OOOOOOOOOOOOOOOOOOO0 |   =  ");
            player.takeDamage(5);
            break; 
          case 5: 
            System.out.println("You meet Doraemon and was given some money and heal yourself"); 
            System.out.println("           ⢀⣠⣤⣴⣶⣶⣶⣶⣶⠶⣶⣤⣤⣀⠀⠀⠀  ");
            System.out.println("       ⢀⣤⣾⣿⣿⣿⠁⠀⢀⠈⢿⢀⣀⠀⠹⣿⣿⣿⣦⣄");
            System.out.println("      ⣴⣿⣿⣿⣿⣿⠿⠀⠀⣟⡇⢘⣾⣽⠀⠀⡏⠉⠙⢛⣿⣷⡖⠀");
            System.out.println("     ⣾⣿⣿⡿⠿⠷⠶⠤⠙⠒⠀⠒⢻⣿⣿⡷⠋⠀⠴⠞⠋⠁⢙⣿⣄");
            System.out.println("    ⢸⣿⣿⣯⣤⣤⣤⣤⣤⡄⠀⠀⠀⠀⠉⢹⡄⠀⠀⠀⠛⠛⠋⠉⠹⡇ ");
            System.out.println("    ⢸⣿⣿⠀⠀⠀⣀⣠⣤⣤⣤⣤⣤⣤⣤⣼⣇⣀⣀⣀⣛⣛⣒⣲⢾⡷ ");
            System.out.println("⢀⠤⠒⠒⢼⣿⣿⠶⠞⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠁⠀⣼⠃ ");
            System.out.println("⢮⠀⠀⠀⠀⣿⣿⣆⠀⠀⠻⣿⡿⠛⠉⠉⠁⠀⠉⠉⠛⠿⣿⣿⠟⠁⠀⣼⠃⠀  ");
            System.out.println("⠈⠓⠶⣶⣾⣿⣿⣿⣧⡀⠀⠈⠒⢤⣀⣀⡀⠀⠀⣀⣀⡠⠚⠁⠀⢀⡼⠃⠀⠀");
            System.out.println("    ⠈⢿⣿⣿⣿⣿⣿⣷⣤⣤⣤⣤⣭⣭⣭⣭⣭⣥⣤⣤⣤⣴⣟⠁");
            player.receiveMoney(10);
            player.heal();
            break;
        }
        Map.getInstance().removeCharAtLoc(player.getLocation());   
      }
      else if (mapChar == 'c')
      { 
        System.out.println("                                __- - ");
        System.out.println("                               (    ");
        System.out.println("                              _))_  ");
        System.out.println("                              |  |________ ");
        System.out.println("                    .-------\"\"\"\"\"   |    \"\"\"\"\"------. ");
        System.out.println("                   /.\".\\            |            /.\".\\ ");
        System.out.println("                  /.   .\\           |           /.   .\\ ");
        System.out.println("                 /.     .\\          |          /.     .\\ ");
        System.out.println("                /.  ___ '.|__....--\"T\"--....__|.' ___  .\\ ");
        System.out.println("               |   |_|_|  |   _..   |   --.   |  |_|_|  | ");
        System.out.println("               |   |_|_|  |  |  |   |   |_|   |  |_|_|  | ");
        System.out.println("               |__________|__|..+--\"\"\"--....__|_________|    ");
        System.out.println("You have entered the city.\nWhere would you like to go ?\n1. Store\n2. Pokemon Hospital");
        int pc = CheckInput.getIntRange(1, 2);
        if (pc == 1)
         {
          Main.store(player); 
         }
        else
         {
          System.out.println(" ░▒▓▓▓▒▒▒▒                      \"▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓        ▄▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\"");  
          System.out.println("    ▒▒ÑÑÑ▒▒▒▒                        ╙▓▓▓▓▓▓▓▓▓▓▓▓▓▄     ┌▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▀");  
          System.out.println("    ▒▒▓▓▓▒▒▒▒                          \"▀▓▓▓▓▓▓▓▓▓▓▓    ╓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▀`");  
          System.out.println("    ░┼▓▓▓▒▒▒▒                             \"▀▓▓▓▓▓▓▓▓▓▓▓▄▓▓▓▓▓▓▓▓▓▓▓▓▓▓▀\"`");  
          System.out.println("    ▒┼Ñ▓▓▒▒▒▒                              ,.J▀▀▀▀▀▀▀▀▀▀▀▀▓▓▓▓▀▀\"\"`");  
          System.out.println("    ▒▒▓▓▓▒▒▒▒                      ,⌐ⁿ^``                     `\"≡≈,");  
          System.out.println("    ▒┼ÑÑÑ▒▒▒▒                 ,«^`              .   ,½              \">.");  
          System.out.println("    ░┼ÑÑÑ▒▒▒▒               ⌐░                ,▒  .^  ¼ ⁿ               Y┬");  
          System.out.println("    ░┼Ñ▓▓▒▒▒▒             ε`         √`     »`ó »`     ╠τ                `%");  
          System.out.println("    ░┼ÑÑÑ▒▒▒▒          ┌ε`░  ,ε     /    ≡^ ╓Ñ^         └ *     U            ≡");  
          System.out.println("    ░┼ÑÑÑ▒▒▒▒         /```░ ╓▒░░ ░▒▒  ,ⁿ                    *φ  └H            `φ");  
          System.out.println("    ░┼ÑÑÑ▒▒▒▒        ô`░░░░┌▒▒▄`,^╒▒*`                        `ⁿ ╙▒ ▒  ░▒       ▒");  
          System.out.println("    ░┼ÑÑ▓▒▒▒▒       ▒ ░   ┌Ñ▒▒░Å             `\"`      .   ,^     `^\"φ½ ░]  ░ ⌐  ░▒");  
          System.out.println("    ░┼ÑÑÑ▒▒▒▒      Å`░   ░╣Ñ Å`                         `            Y▒░░░░ ░Ü░  ░▒");  
          System.out.println("    ░┼ÑÑÑ▒▒▒▒     /`░   ░╪M                                            ½▒M░  │░░ ░░½");  
          System.out.println("    ░┼▒Ñ▓▒▒▒▒    ╔░░  ░░)`  ▒▒Nm≥φ╖╓,.,,╓╖φⁿ                            ½H░░░!H░░░░");  
          System.out.println("    ░┼▒Ñ▒▒▒▒▒   ┌Ü░░   ┌      ┌▓Ω^]▓▓▓▓▓▓M`             ╓φ,              ▒  ░░▒░░`:░");  
          System.out.println("    ░┼ÑÑ▒▒▒▒▒   ô░    ░Ñ       ▀▓▓▓▓▓▓▓▓▀                \"▒Ñ▒▒▒N▄▄▄▄d▒▒▒ H░  ░║░░░!");  
          System.out.println("     ┼▒▒▒▒▒▒▒  ╒░    ░╪                                   ▓▓æ▓▓▓▓▓▓▓▓    H░░░░]░░░░");  
          System.out.println("     ┼▒▒▒▒▒▒▒  ▒░░  ░╒▓                                    `\"▀▀▀▀▀▀▀`    H░░░░║▒░░░");  
          System.out.println("     ┼▒▒▒▒▒▒▒  ░░░ ░░╣M                                                  H░░░░║▒░░░▒");  
          System.out.println("     ┼▒▒▒▒▒▒▒ │░   ░]▒                    ╓⌐⌐~~⌐⌐.                      ┌▒░  ░╣▒░░░░");  
          System.out.println("     ┼▒▒▒▒░░░ ║░░  ░▓Ñ                               └                  │░  ░░▒▒▒░░░");  
          System.out.println("     ┼▒▒▒▒░░░ ▒░  ░╪▒                                                   ║   ░░M╣▒░░░");  
          System.out.println("     ┼▒▒▒▒░░░ H░░░░▓▌                                                   ▒░░░░┼▒ \\░░┼");  
          System.out.println("     ┼▒▒▒▒░░░│░░░░┼▒▌                                                   H░ ░░]▒ └▒░▒");  
          System.out.println("     ┼▒▒▒▒░░░║░░░░║▒▒                                                  ┼░░░░░É  /░░▒");  
          System.out.println("     ┼▒▒▒▒░░░║▒░░░▓▒▒H                                                 ╠░░░░░H ó░░┼`");  
          System.out.println("     ┼▒▒▒H░░░║▒░░░▒▒▒▒                                                 Ü░░░░░W▓▒▒▒▒");  
          System.out.println("     │▒▒▒▒░░░║▒▒▒┼▒ÑÑÑ▓                                               ┌░░░░░╪▒▒▒▒▒H┌");  
          System.out.println("     │▒▒▒▒░░░║▒▒▒]ÑÑÑÑ▓▓                                              j░░░░▒║Ñ▒▒▒▒M");  
          System.out.println("    `└ªªªºⁿ\"ⁿ╙╙╙╙ªª╜╜╜▀▀▀ⁿ                                            ╙╙╙╙╙╙▀ªª╜╜ºⁿº");  
          System.out.println("------------------------------------------------------------"); 
          // System.out.println("\nWelcome to the Pokemon hospital!\nPoor little pokemons, you have a horrible master!\nLet me fix them up.\n\nPOKEMON HAVE BEEN HEALED\n");
          System.out.println("Nurse: Why are you putting these animals in a ball ?");
          System.out.println("------------------------------------------------------------"); 
          System.out.println("1.Ummm\n2.Cause that is how the game works?");
          int response6 = CheckInput.getIntRange(1,2);
          switch(response6)
          {
            case 1: 
              System.out.println("------------------------------------------------------------"); 
              System.out.println("Nurse: Imma call 911 and animal service on you ?");
              System.out.println("------------------------------------------------------------"); 
              break;
            case 2: 
              System.out.println("------------------------------------------------------------"); 
              System.out.println("Nurse: I'm still calling authorities to solve this animal cruelty!");
              System.out.println("------------------------------------------------------------"); 
              break;
          }
          System.out.println("              ░░▄▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓⌐"); 
          System.out.println("             ░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▀▒▒▒▒▒▀▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓M"); 
          System.out.println("            ░j▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▀"); 
          System.out.println("           ░╪▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓M"); 
          System.out.println("           ]▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▀\""); 
          System.out.println("          ░Å▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▌"); 
          System.out.println("            ▀▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓"); 
          System.out.println("            ` \"▀▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓H"); 
          System.out.println("                `░▀▀▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓⌂"); 
          System.out.println("                    ░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▀▓"); 
          System.out.println("                    ┼▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▌"); 
          System.out.println("                    ┼▓▓▓▓▓▓▓▓▓▓▓▀▀▓▓▓▓▓▓▓▓▓▓▀▀▀▀▀▀▀▀\"░░▀▓▓▓▓▓▓▌ ╙▓▓▒\"▒"); 
          System.out.println("                    ░▀▓▓▓▓▓▓\"\"\"\"\"\"▀▀▓▓▓▓▓▓▓▌░░▒K▀▀▓▓▓Næε▓▓▓▓▓▓▌` ▓▓"); 
          System.out.println("                     ░▓▓▓▓▓▌░▄▓▓Φ▓▓▓▓▌▀▓▓▓▓▌  ` ▓▓▓▀▓M  j▓▓▓▓▓H▒░┼▓"); 
          System.out.println("                    ░╪▀┼▓▓▓▌▒\" ▓▓▓▓H`╙\"░▀▓▓▒``  `\"```   └▓▒▓▓▓H░ⁿ]▓"); 
          System.out.println("                    ▒░`░▓▒▓▓▒░»░\"\"'`  ░▒``▀▌             ▓┼ⁿ▓▓M,▄▓▓░"); 
          System.out.println("                        ║▒▀▓▒▒   ░``   ╚                 `\" "); 
          System.out.println("                         ⁿ`▓H▒`                             ▓▒▓▓▓H\"H"); 
          System.out.println("                            ░ ▒                            ╓▒]▓▓▀H"); 
          System.out.println("                               ▒                          /` ]▓▌┴"); 
          System.out.println("                                ╙φ                     ,ε` ▒ ]▌▒"); 
          System.out.println("                                  ▒φ      `  \"       ╓▒`  ]` ┼H"); 
          System.out.println("                                    *w             «▒    ╓░  ░H"); 
          System.out.println("                                      `½φ       ╓▒`     ╓▒    ▒▒ε"); 
          System.out.println("                                         \"v⌐⌐«≡░       ╓▒   ≡▒▒▒▒▒"); 
          System.out.println("                                         ]▒H            ╓▒▒▒▒▒▒▒░\"▒"); 
          System.out.println("                                       ,▒▒▒H        ,«▒▒▒▒▒▒▒▒░   ║*$▓▄⌂"); 
          System.out.println("                                     ,▒`▒▒▒▒N    .«▒▒▒▒▒▒▒▒▒`    ≡` Å▓▓▓▓▓▄░"); 
          System.out.println("                               .╓▄▓▓▓ÖH  ▒▒▒▒▒w▄▒▒▒▒▒▒▒▒▒░`    .\"  ]▓▓▓▓▓▓▓▓▓▓▄▄,"); 
          System.out.println("                           ,▄▓▓▓▓▓▓▓▓ ▒   `▒▒▒▒▒▒▒▒▒▒▒▒`     ,^   ]▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓"); 
          System.out.println("                        ╓▓▓▓▓▓▓▓▓▓▓▓▌ ╙     ▒░▒▒▒▒▒▒`      .▒`   j▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓"); 
          System.out.println("                      ╓▒▓▓▓▓▓▓▓▓▓▓▓▓H  ▒  .▒  ▒    ▒      ≡`    ]▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▀`"); 
          System.out.println("Police: What's going on here ?");
          System.out.println("------------------------------------------------------------"); 
          System.out.println("1.Sorry officer nothing is wrong here I just playing a game\n2.I invoke my fifth amendment to be silent and stop self-incrmination (This might not be the best choice...)");
          int response7 = CheckInput.getIntRange(1,2);
          switch(response7)
          {
            case 1: 
              System.out.println("------------------------------------------------------------"); 
              System.out.println("Police: Ok Imma give you the benefit of the doubt here.");
              System.out.println("------------------------------------------------------------"); 
              System.out.println("**Your Pokemons are all healed");
              player.healAllPokemon();
              break;
            case 2: 
              System.out.println("------------------------------------------------------------"); 
              System.out.println("Police: You are going to jail son");
              System.out.println("------------------------------------------------------------"); 
              System.out.println(" _____   ___  ___  ___ _____   _____  _   _ ___________  ");
              System.out.println("|  __ \\ / _ \\ |  \\/  ||  ___| |  _  || | | |  ___| ___ \\ ");
              System.out.println("| |  \\// /_\\ \\| .  . || |__   | | | || | | | |__ | |_/ / ");
              System.out.println("| | __ |  _  || |\\/| ||  __|  | | | || | | |  __||    /  ");
              System.out.println("| |_\\ \\| | | || |  | || |___  \\ \\_/ /\\ \\_/ / |___| |\\ \\  ");
              System.out.println(" \\____/\\_| |_/\\_|  |_/\\____/   \\___/  \\___/\\____/\\_| \\_| ");
              System.exit(0);
              break;
          }
         }
       
       } 
     }while(i != 5 || player.getHp() == 0);   
    
   }


  /**
  * Print the main menu
  * @return choice the user input for the main menu options
  */
  public static int mainMenu() 
  {
    System.out.println("Main Menu:\n1. Go North\n2. Go South\n3. Go East\n4. Go West\n5. Quit");
    int choice = CheckInput.getIntRange(1, 5);
    System.out.println("");
    return choice;
  }


  /**
  * Display menu for item in the store, gets users' input,checks that the user has enough money, spends the money and gets the item if they do, otherwise notifies the user that they don't have enough. 
  * @param t takes in Trainer object to have access to the items, pokemons and hp.
  */
  public static void store(Trainer t)
  {
    int val = 0;
    do{
      System.out.println("\nHello, do you wanna spend your precious money?!\n1. Buy Potion - $5\n2. Buy Poke Balls - $3\n3. Exit"); 
      val = CheckInput.getIntRange(1,3); 
      if (val == 3)
      {
        System.out.println("\nGood bye then! ");
      }
      else if (val == 1 & t.getMoney() >= 5)
      {
        System.out.println("\nHere's your potion");
        t.spendMoney(3);
        t.receivePotion();
      }
      else if (val == 2 & t.getMoney() >= 3) 
      {
        System.out.println("\nHere's your Pokeball");
        t.spendMoney(5);
        t.receivePokeball();
      }
      else//break the loop when player have no money 
      {
        System.out.println("\nYou are broke! Go make some money and come back later!\n");
        break; 
      }
    }while(val != 3);
  }

  /** 
  * The gymAttack method is the game's combat system for the gym leader consisting of the use of attacks and potions.
  * @param t represents the trainer
  * @param gym represents the gym leader
  * @param gymPoke represents the gym leader's pokemon that the player fights
  */
  public static void gymAttack(Trainer t, Trainer gym, Pokemon gymPoke) {
   
    Random rand = new Random();

    boolean battle = true;
    
    while (battle) {
      // If the gym leader is defeated, end the fight and reward player 20 money.
      if (gymPoke.getHp() == 0) {
        System.out.println("\nThe gym leader's " + gymPoke.getName() + " has been defeated!");
        int rewardMoney = 20;
        System.out.println("You earned " + rewardMoney + " money for this victory!\n");
        t.receiveMoney(rewardMoney);
        break;
      } 
      else if(t.getHp() == 0)
      {
        break;
      }

      String gymMenu = "What do you want to do?\n1. Fight\n2. Use Potion\n";

      System.out.println(gymMenu);
      int gymChoice = CheckInput.getIntRange(1, 4);
      System.out.println("");
      switch(gymChoice) {
        // 1. Fight
        case 1:
          System.out.println("Choose a Pokemon:");
          System.out.println(t.getPokemonList());
          System.out.println("");


          // Choose from list of pokemon and display chosen pokemon
          Pokemon chosenPokemon = t.getPokemon(CheckInput.getIntRange(1, t.getNumPokemon()));
          System.out.println(chosenPokemon.getName() + ", I choose you!");
          System.out.println("");      

          int counter = 0;
          // If chosen pokemon has no health, damage the trainer and break
          if(chosenPokemon.getHp() == 0) {
            System.out.println(chosenPokemon.getName() + " has no more health left!");  
            for(int i = 1; i <= t.getNumPokemon(); i++) {
              if (t.getPokemon(i).getHp() > 0) {
                              
                System.out.println("THere are pokemon in the list that has more than 0 health");
                int dmg = rand.nextInt(10) + 1;
                System.out.println("The gym leader's " + gymPoke.getName() + " charges and attacks you instead!");
                System.out.println("You take " + dmg + " damage!\n");
                System.out.println("STOP CHOOSING THE ONE WITHOUT HEALTH DO YOU WANT TO DIE !????????????????");
                t.takeDamage(dmg);
                counter++;
                System.out.println("Choose another Pokemon:");
                System.out.println(t.getPokemonList());
                System.out.println("");
                chosenPokemon = t.getPokemon(CheckInput.getIntRange(1, t.getNumPokemon()));
                // // Choose from list of pokemon and display chosen pokemon
                System.out.println(chosenPokemon.getName() + ", I choose you!");
                System.out.println("");                   
              }
              // else if (t.getPokemon(i).getHp() == 0) {
              //case that all pokemon are 0 health
              else if(counter == t.getNumPokemon())
              { 
                // int dmg = rand.nextInt(10) + 1;
                System.out.println("You have no healthy Pokemon come back later!");
                // System.out.println("The gym leader's " + gymPoke.getName() + " charges and attacks you instead!");
                // System.out.println("You take " + dmg + " damage!\n");
                // t.takeDamage(dmg);
                battle = false;
                break; 
              }
          }
          }  
    
 

          // Display and choose attack set (basic or special)
          //cast down to call method from Pokemon class 
          System.out.println(((Pokemon)chosenPokemon).getAttackTypeMenu());
          int attackChoice = CheckInput.getIntRange(1, chosenPokemon.getNumAttackTypeMenuItems());
          
          // Display and choose 1. Basic attack
          if (attackChoice == 1) {
            System.out.println(chosenPokemon.getAttackMenu(1));
            System.out.println(chosenPokemon.attack(gymPoke, 1, CheckInput.getIntRange(1, chosenPokemon.getNumAttackMenuItems(1))));
          }

            // Display and choose 2. Special attack
          else if (attackChoice == 2) {
            System.out.println(chosenPokemon.getAttackMenu(2)); 
            System.out.println(chosenPokemon.attack(gymPoke, 2, CheckInput.getIntRange(1,chosenPokemon.getNumAttackMenuItems(2))));         
          }


            // Wild Pokemon's random move (basic or special)
          System.out.println("The gym leader's " + gymPoke.getName() + " is getting ready to charge!");
          int gymAttack = rand.nextInt(2) + 1;
          
          // If the wildChoice is 1, choose random basic attack
          if (gymAttack == 1) {
          System.out.println(gymPoke.attack(chosenPokemon, 1, rand.nextInt(3) + 1) + "\n");
          System.out.println(gymPoke.toString() + "\n");
          }

          // If the wildChoice is 2, choose random special attack
          else if (gymAttack == 2) {
          System.out.println(gymPoke.attack(chosenPokemon, 2, rand.nextInt(3) + 1) + "\n");
          System.out.println(gymPoke.toString() + "\n");
          }

          // End of 1. Fight
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
            System.out.println("You chose to heal and buff " + healPokemon.getName());
            t.usePotion(pokemonChoice);
          }    
          // End of 2. Use Potion
          break;
      }
      }
  }        

/**
* The trainerAttack method is the game's combat system consisting of the use of attacks, potions, pokeballs, and running away from a fight.
* @param t represents the trainer
* @param wild represents the wild pokemon that the player fights
*/
  public static void trainerAttack(Trainer t, Pokemon wild) {

    Random rand = new Random();

    boolean battle = true;
    
    while (battle) {
      // If the wild pokemon is defeated, end the fight and reward player 5-10 money.
      if (wild.getHp() == 0) {
        System.out.println("\nThe wild " + wild.getName() + " has been defeated!");
        int rewardMoney = rand.nextInt(5) + 5;
        System.out.println("You earned " + rewardMoney + " money for this victory!\n");
        t.receiveMoney(rewardMoney);
        Map.getInstance().removeCharAtLoc(t.getLocation());
        break;
      } 
      else if(t.getHp() == 0)
      {
        break;
      }
 

      String wildMenu = "What do you want to do?\n1. Fight\n2. Use Potion\n3. Throw Pokeballs\n4. Run away";
      System.out.println(wildMenu);
      int wildChoice = CheckInput.getIntRange(1, 4);
      System.out.println("");      

      switch(wildChoice) {
        // 1. Fight
        case 1:
          System.out.println("Choose a Pokemon:");
          System.out.println(t.getPokemonList());
          System.out.println("");

      
          // Choose from list of pokemon and display chosen pokemon
          int pokeChoice = CheckInput.getIntRange(1, t.getNumPokemon());
          Pokemon chosenPokemon = t.getPokemon(pokeChoice);
          System.out.println(chosenPokemon.getName() + ", I choose you!");
          System.out.println("");      

          // If chosen pokemon has no health, damage the trainer and break
          if (chosenPokemon.getHp() == 0 ) {
            
            int dmg = rand.nextInt(10) + 1;
            
            System.out.println(chosenPokemon.getName() + " has no more health left!");
            System.out.println("The wild " + wild.getName() + " charges and attacks you instead!");
            System.out.println("You take " + dmg + " damage!\n");
            t.takeDamage(dmg);
            battle = false;
            break;          
          }        

          // Display and choose attack set (basic or special)
          //cast down to call method from Pokemon class 
          System.out.println(((Pokemon)chosenPokemon).getAttackTypeMenu());
          int attackChoice = CheckInput.getIntRange(1, chosenPokemon.getNumAttackTypeMenuItems());
          
          // Display and choose 1. Basic attack
          if (attackChoice == 1) {
            System.out.println(chosenPokemon.getAttackMenu(1));
            System.out.println(chosenPokemon.attack(wild, 1, CheckInput.getIntRange(1, chosenPokemon.getNumAttackMenuItems(1))));
          }

            // Display and choose 2. Special attack
          else if (attackChoice == 2) {
            System.out.println(chosenPokemon.getAttackMenu(2)); 
            System.out.println(chosenPokemon.attack(wild, 2, CheckInput.getIntRange(1,chosenPokemon.getNumAttackMenuItems(2))));         
          }

         //Debuff during battle
          // System.out.println("\nCalculating debuff probability!");
          Random randDebuff = new Random();
          int debuffProb = randDebuff.nextInt(100);
          if(debuffProb <= 24)
          {
            //debuff enemy's poke
            PokemonGenerator pokemonGen = PokemonGenerator.getInstance();
            wild = pokemonGen.addRandomDebuff(wild);
            System.out.println("\nThe wild " + wild.getName() + " receives a debuff from your " + chosenPokemon.getName() + " attack!\n");
          }
          else if (debuffProb < 35 && debuffProb >= 25)
          {
            //debuff player's pokemon
            t.debuffPokemon(pokeChoice);
            System.out.println("\nUh oh! Your " + chosenPokemon.getName() + " received a debuff from the wild " + wild.getName() + "!\n");
          }
            // Wild Pokemon's random move (basic or special)
          System.out.println("The wild " + wild.getName() + " is getting ready to charge!");
          int wildAttack = rand.nextInt(2) + 1;
          
          // If the wildChoice is 1, choose random basic attack
          if (wildAttack == 1) {
          System.out.println(wild.attack(chosenPokemon, 1, rand.nextInt(3) + 1) + "\n");
          System.out.println(wild.toString() + "\n");
          }

          // If the wildChoice is 2, choose random special attack
          else if (wildAttack == 2) {
          System.out.println(wild.attack(chosenPokemon, 2, rand.nextInt(3) + 1) + "\n");
          System.out.println(wild.toString() + "\n");
          }

          // End of 1. Fight
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
          PokemonGenerator pokemonGen = PokemonGenerator.getInstance();

          int pokemonChoice =  CheckInput.getIntRange(0, t.getNumPokemon());
          Pokemon healPokemon = t.getPokemon(pokemonChoice);
          
          if(healPokemon.getHp() == healPokemon.getMaxHp()) {
            System.out.println(healPokemon.getName() + " is at full health, cannot be healed.");
          }
          else {
            System.out.println("You chose to heal and buff " + healPokemon.getName());
            t.usePotion(pokemonChoice);
            // Pokemon buffPokemon = pokemonGen.addRandomBuff(healPokemon);
            // System.out.println("buff Poke: " + buffPokemon.getName());
          }
          
          // End of 2. Use Potion
          break;

        // 3. Throw Pokeball
        case 3:
          if (!t.hasPokeball()) {
            System.out.println("You do not have any pokeballs left.");
            System.out.println(wild.toString() + "\n");
            break;
          }

          else
          {
            if (t.catchPokemon(wild)) {
                System.out.println("You have captured " + wild.getName() + "!");
                if(t.getNumPokemon() < 7) {
                  battle = false;
                  break;  
                }
                else {
                  System.out.println("\nYou are only able to have 6 pokemon!\n\nChoose a pokemon to remove:");
                  System.out.println(t.getPokemonList());
                  int pokemonRemove =  CheckInput.getIntRange(0, t.getNumPokemon()); 
                  t.removePokemon(pokemonRemove-1);
                  battle = false;
                  break;  
                }

              }

            else {
              System.out.println("You did not capture " + wild.getName() + "!\n");
              System.out.println(wild.toString() + "\n");

            }
          }
 

          // End of Throw Pokeball
          break;

        // 4. Run Away
        case 4: 
          int rand1 = rand.nextInt(4); 
          System.out.println("\nYou couldn't handle the wild " + wild.getName() + " and have run away!\n");
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
           }
      }
      }
  }
}
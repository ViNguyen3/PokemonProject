import java.util.Random;
import java.io.FileNotFoundException;;

/**
* The Main class for our Pokemon game project
* @author Dylan Ros
* @author Vi Nguyen
* @author Angel Rubio
*/
class Main {
  /**
  * The main method consists of every user prompt, construction of Map and Trainer objects, displays the map, directions, ability to quit the game, and various events depending on the trainer's position on the map.
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

    System.out.println("Prof. Oak: Welcome new trainer! What is your name?");
    playerName = CheckInput.getString();
    System.out.println("");
    System.out.println("ﾉ｡≧◇≦）ﾉ What a bad name, " + playerName + " are you serious! LOL!!!");

    System.out.println("Anyways, please choose your first pokemon:\n1. Charmander\n2. Bulbasaur\n3. Squirtle");

    // Use the CheckInput class for the user inputs (range for menu options)
    starterPokemonChoice = CheckInput.getIntRange(1, 3);
    System.out.println("");

    // Initializing the starterPokemon to avoid errors 
    starterPokemon = null;

    switch(starterPokemonChoice) {
      case 1: 
        System.out.println(pokemonGen.getPokemon("Charmander"));
        starterPokemon = pokemonGen.getPokemon("Charmander");
      
     
          
        // System.out.println("              _.--\"\"`-..");
        // System.out.println("            ,'          `.");
        // System.out.println("          ,'          __  `.");
        // System.out.println("         /|          \" __  \\");
        // System.out.println("        , |           / |.   .");
        // System.out.println("        |,'          !_.'|   |");
        // System.out.println("      ,'             '   |   |");
        // System.out.println("     /              |`--'|   |");
        // System.out.println("    |                `---'   |");
        // System.out.println("     .   ,                   |                       ,\".");
        // System.out.println("      ._     '           _'  |                    , ' \\ `");
        // System.out.println("  `.. `.`-...___,...---\"\"    |       __,.        ,`\"   L,|");
        // System.out.println("  |, `- .`._        _,-,.'   .  __.-'-. /        .   ,    \\");
        // System.out.println("-:..     `. `-..--_.,.<       `\"      / `.        `-/ |   .");
        // System.out.println("  `,         \"\"\"\"'     `.              ,'         |   |  ',,");
        // System.out.println("    `.      '            '            /          '    |'. |/");
        // System.out.println("      `.   |              \\       _,-'           |       ''");
        // System.out.println("        `._'               \\   '\"\\                .      |");
        // System.out.println("           |                '     \\                `._  ,'");
        // System.out.println("           |                 '     \\                 .'|");
        // System.out.println("           |                 .      \\                | |");
        // System.out.println("           |                 |       L              ,' |");
        // System.out.println("           `                 |       |             /   '");
        // System.out.println("            \\                |       |           ,'   /");
        // System.out.println("          ,' \\               |  _.._ ,-..___,..-'    ,'");
        // System.out.println("         /     .             .      `!             ,j'");
        // System.out.println("        /       `.          /        .           .'/");
        // System.out.println("       .          `.       /         |        _.'.'");
        // System.out.println("        `.          7`'---'          |------\"'_.'");
        // System.out.println("       _,.`,_     _'                ,''-----\"'");
        // System.out.println("   _,-_    '       `.     .'      ,\\");
        // System.out.println("   -\" /`.         _,'     | _  _  _.|");
        // System.out.println("    \"\"--'---\"\"\"\"\"'        `' '! |! /");
        // System.out.println("                            `\" \" -'");   
        break;
      case 2: 
        starterPokemon = pokemonGen.getPokemon("Bulbasaur");
        // System.out.println("                                        /  ");
        // System.out.println("                        _,.------....___,.' ',.-.");
        // System.out.println("                     ,-'          _,.--\"        |");
        // System.out.println("                   ,'         _.-'              .");
        // System.out.println("                  /   ,     ,'                   `");
        // System.out.println("                 .   /     /                     ``.");
        // System.out.println("                 |  |     .                       \\.\\");
        // System.out.println("       ____      |___._.  |       __               \\ `.");
        // System.out.println("     .'    `---\"\"       ``\"-.--\"'`  \\               .  \\");
        // System.out.println("    .  ,            __               `              |   .");
        // System.out.println("    `,'         ,-\"'  .               \\             |    L");
        // System.out.println("   ,'          '    _.'                -._          /    |");
        // System.out.println("  ,`-.    ,\".   `--'                      >.      ,'     |");
        // System.out.println(" . .'\\'   `-'       __    ,  ,-.         /  `.__.-      ,'");
        // System.out.println(" ||:, .           ,'  ;  /  / \\ `        `.    .      .'/");
        // System.out.println(" j|:D  \\          `--'  ' ,'_  . .         `.__, \\   , /");
        // System.out.println("/ L:_  |                 .  \"' :_;                `.'.'");
        // System.out.println(".    \"\"'                  \"\"\"\"\"'                    V");
        // System.out.println(" `.                                 .    `.   _,..  `");
        // System.out.println("   `,_   .    .                _,-'/    .. `,'   __  `");
        // System.out.println("    ) \\`._        ___....----\"'  ,'   .'  \\ |   '  \\  .");
        // System.out.println("   /   `. \"`-.--\"'         _,' ,'     `---' |    `./  |");
        // System.out.println("  .   _  `\"\"'--.._____..--\"   ,             '         |");
        // System.out.println("  | .\" `. `-.                /-.           /          ,");
        // System.out.println("  | `._.'    `,_            ;  /         ,'          .");
        // System.out.println(" .'          /| `-.        . ,'         ,           ,");
        // System.out.println(" '-.__ __ _,','    '`-..___;-...__   ,.'\\ ____.___.'");
        // System.out.println(" `\"^--'..'   '-`-^-'\"--    `-^-'`.''\"\"\"\"\"`.,^.`.--'");
        break;
      case 3: 
        starterPokemon = pokemonGen.getPokemon("Squirtle");
        // System.out.println("               _,........__");
        // System.out.println("            ,-'            \"`-.");
        // System.out.println("          ,'                   `-.");
        // System.out.println("        ,'                        \\");
        // System.out.println("      ,'                           .");
        // System.out.println("      .'\\               ,\"\".       `");
        // System.out.println("     ._.'|             / |  `       \\");
        // System.out.println("     |   |            `-.'  ||       `.");
        // System.out.println("     |   |            '-._,'||       | \\");
        // System.out.println("     .`.,'             `..,'.'       , |`-.");
        // System.out.println("     l                       .'`.  _/  |   `.");
        // System.out.println("     `-.._'-   ,          _ _'   -\" \\  .     `");
        // System.out.println("`.\"\"\"\"\"'-.`-...,---------','         `. `....__.");
        // System.out.println(".'        `\"-..___      __,'\\          \\  \\     \\");
        // System.out.println("\\_ .          |   `\"\"\"\"'    `.           . \\     \\");
        // System.out.println("  `.          |              `.          |  .     L");
        // System.out.println("    `.        |`--...________.'.        j   |     |");
        // System.out.println("      `._    .'      |          `.     .|   ,     |");
        // System.out.println("         `--,\\       .            `7\"\"' |  ,      |");
        // System.out.println("            ` `      `            /     |  |      |    _,-'\"\"\"`-.");
        // System.out.println("             \\ `.     .          /      |  '      |  ,'          `.");
        // System.out.println("             \\  v.__  .        '       .   \\    /| /              \\");
        // System.out.println("               \\/    `\"\"\\\"\"\"\"\"\"\"`.       \\   \\  /.''                |");
        // System.out.println("                `        .        `._ ___,j.  `/ .-       ,---.     |");
        // System.out.println("                ,`-.      \\         .\"     `.  |/        j     `    |");
        // System.out.println("               /    `.     \\       /         \\ /         |     /    j");
        // System.out.println("              |       `-.   7-.._ .          |\"          '         /");
        // System.out.println("              |          `./_    `|          |            .     _,'");
        // System.out.println("              `.           / `----|          |-............`---'");
        // System.out.println("                \\          \\      |          |");
        // System.out.println("               ,'           )     `.         |");
        // System.out.println("                7____,,..--'      /          |");
        // System.out.println("                                  `---.__,--.'");
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
        System.out.println("\n YOU DIED ");
        System.out.println("\n GAME OVER");
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
        System.out.println("Boss FIGHT !"); 
        Pokemon tempPoke = PokemonGenerator.getInstance().generateRandomPokemon(2);
        Trainer gymLeader = new Trainer("Gym leader", tempPoke);
        System.out.println("The gym leader has appeared! Get ready for battle!\n");
        gymAttack(player, gymLeader, tempPoke);
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
          System.out.println("You have lost the battle so run away!");
          Random rand = new Random();
          int rand3 = rand.nextInt(4); 
          System.out.println("\nYou couldn't handle the wild " + tempPoke.getName() + " and have run away!\n");
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
        Pokemon wild = PokemonGenerator.getInstance().generateRandomPokemon(1);
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
        int num2 = num.nextInt(7); 
        switch(num2)
        {
          case 0: 
            // System.out.println("You run into Vegita from Dragon Ball\nVegita: Where's my money that you borrow before to buy pokeballs!\nA rob half of your money.");
            // System.out.println("                                 ,");
            // System.out.println("                           ,   ,'|");
            // System.out.println("                         ,/|.-'   \\.");
            // System.out.println("                        .-'  '       |.");
            // System.out.println("                  ,  .-'              |");
            // System.out.println("               /|,'                 |'");
            // System.out.println("              / '                    |  ,");
            // System.out.println("             /                       ,'/");
            // System.out.println("          .  |          _              /");
            // System.out.println("          \\`' .-.    ,' `.           |");
            // System.out.println("          \\ /   \\ /      \\          /");
            // System.out.println("          \\|    V        |        |  ,");
            // System.out.println("            (           ) /.--.   ''\"/");
            // System.out.println("             \"b.`. ,' _.ee'' 6)|   ,-'");
            // System.out.println("              \"= --\"\"  )   ' /.-'");
            // System.out.println("               \\ / `---\"   .\"|\'");
            // System.out.println("                \\\"..-    .'  |.");
            // System.out.println("                  `-__..-','   |");
            // System.out.println("               __.) ' .-'/    /\\._");
            // System.out.println("        _.--'/----..--------. _.-\"\"-._");
            // System.out.println("    .-'_)   \\.   /     __..-'     _.-'--.");
            // System.out.println("    / -'/      \"\"\"\"\"\"\"\"\"         ,'-.   . `.");
            // System.out.println("   | ' /                        /    `   `. \\");
            // System.out.println("   |   |                        |         | |");
            // System.out.println("    \\ .'\\                       |     \\     |");
            // System.out.println("   / '  | ,'               . -  \\`.    |  / /");
            // System.out.println("  / /   | |                      `/\"--. -' /\\");
            // System.out.println("  | |     \\ \\                     /     \\     |");
            // System.out.println("  | \\      | \\                 .-|      |    |");
            player.spendMoney((int)((player.getMoney())/2)); 
            break;
          case 1: 
            // System.out.println("You run into Saber\nSaber: Hey, buy me something to eat\n（；¬＿¬)\nSaber took away half your money");
            // System.out.println(" 　　　　　　　　　　　　　＿　 　 ＿＿ 　_,..　-―-    "); 
            // System.out.println("　　　　　　　　　　　__<＞''\"´　　　　　 ｀^''＜⌒丶 ＼"); 
            // System.out.println("　　　　　　　　　　〈／ 　 ／　　　　　　　　　 ＼ 　 ＼丶  "); 
            // System.out.println("　　　　　　　　 ／7ﾞ /　/　　　　　 　 　 　 　 　 ヽ　　∨"); 
            // System.out.println("　　　　　　 　 _〉:∧│　　　　 | :　　　　　|:　　　|ハ"); 
            // System.out.println("　　 　  　 　 〈: 7 : : |　|　 　 : | : :　| : : 　| : : .　j:　i"); 
            // System.out.println("　　　　　　　　〉| : ヽ|　|│:ィ:/|⌒:/ﾄ : : |ィ7ト: /: :│"); 
            // System.out.println("　 　 　 　 　 〈八＼_|　|人ィ灯圷ﾐ/ｲ : ﾘィ灯Y}.: : :|　　"); 
            // System.out.println("　　　　　　　　｀{: :〈│: 　 |　Vツ　　|／　ﾋｿ /:.|/|/　　　 "); 
            // System.out.println("　　　　　　　　　｀ｰｯ| :　　| 　 　 　 　 　 〉　 {: :|"); 
            // System.out.println("　　　　　 　 　 　 /:::| :　 │　　　　　　　　　八:|"); 
            // System.out.println(" 　　　　 　 　 　 /:::/| :　　|＼　　 　 ﾉ‐ 　 ｲ: : :|"); 
            // System.out.println("　　　　　　　　　＼{∧: : : |　　　　.,,_/〉イ|/| : : |"); 
            // System.out.println("　　　　　 　 　 　 厶ｨﾍ: Ν≧=‐<_,´}′ 　 | ∧|"); 
            // System.out.println("　 　 　 　　 　 _／⌒＾ ∧|　 　 __/7 ｛≧=､_l厶_　 　,,.｡;;::,."); 
            // System.out.println("　　　 　 　'´￣｀>､　　 　 ＼／::// /〈:＼　Υ ハ,;;::ﾟ::..　　ﾞ:;,,"); 
            // System.out.println("　　　　　 |　　　ﾞ⌒＼　　　〈::rく/　{　{ﾊ:::〉　V　;斗-冖冖ｰ‐(ヽ"); 
            // System.out.println("　　　　　 |　　＼　　　∨　　｀｝　 　 　 ﾉ´　　} 〈　　　　 　 ⊂ﾆﾉ"); 
            // System.out.println("　　　　　 │　　　ヽ 　　∨　　{　　　　∧　　　∨＼　　　　 ⊂/"); 
            player.spendMoney((int)(player.getMoney()/2)); 
            break;
          case 2: 
            // System.out.println("You run into Hatsune Miku\nMiku: Oi, Onii-chan~~(｡•̀ᴗ-)✧\nC kissed you (⁄ ⁄•⁄ω⁄•⁄ ⁄) and heal you to full health");
            // System.out.println("                                           ░░▒▒░░░░░░       ");
            // System.out.println("                                         ░░░░░░░░░░░░░░▒▒░░ ");
            // System.out.println("                                       ░░▒▒░░░░░░░░░░░░▒▒▓▓░░▒▒  ");
            // System.out.println("                                     ░░░░▒▒░░░░░░░░    ░░▒▒▓▓░░▒▒");
            // System.out.println("                                     ░░░░░░▒▒░░░░░░░░  ░░▒▒▓▓░░▒▒ ");
            // System.out.println("                                     ▒▒▒▒░░░░░░░░░░░░░░░░░░▓▓▒▒░░░░ ");
            // System.out.println("                                     ░░▒▒░░  ░░░░▒▒░░░░░░▒▒▓▓▒▒▒▒░░ ");
            // System.out.println("   ░░                                ░░▒▒▒▒▒▒    ▓▓▒▒▒▒░░░░▓▓▒▒▒▒░░          ");
            // System.out.println(" ░░░░░░  ░░                          ░░▓▓░░        ░░▒▒░░▒▒░░▒▒░░░░     ");
            // System.out.println(" ░░░░░░░░  ░░░░                        ▓▓░░  ░░    ░░▒▒▒▒▒▒  ▒▒░░░░  ");
            // System.out.println("    ░░░░░░░░░░      ░░                  ▒▒▒▒        ▒▒▓▓░░    ▒▒░░░░   ");
            // System.out.println("            ░░░░░░      ░░░░    ░░░░  ▒▒▒▒▒▒▓▓░░░░░░▓▓        ▒▒▒▒░░░░  ");
            // System.out.println("                ░░░░░░░          ▒▒    ░░░░▒▒░░░░░░░░▒▒░░░░  ▒▒▒▒░░▒▒    ");
            // System.out.println("                    ░░░░░░░░░░░░▒▒  ░░░░░░░░░░░░░░          ░░▒▒░░▒▒");
            // System.out.println("                              ▒▒▓▓░░░░░░░░░░░░░░░░          ░░▒▒░░░░");
            // System.out.println("                                ▒▒▒▒░░░░    ░░░░░░▒▒░░  ░░░░░░▒▒░░░░░░");
            // System.out.println("                            ░░▒▒▒▒▒▒▓▓▒▒  ░░░░    ▒▒░░░░░░░░▒▒░░░░░░ ");
            // System.out.println("                            ▒▒▒▒▒▒▒▒░░▓▓▒▒░░      ▒▒░░░░░░░░▒▒░░░░▒▒");
            // System.out.println("                          ░░▒▒▒▒▒▒▒▒░░░░▓▓      ░░░░░░░░░░░░▒▒░░▒▒▒▒");
            // System.out.println("                          ▒▒▒▒▒▒▒▒▒▒░░░░      ░░░░        ░░▒▒░░▒▒▒▒");
            // System.out.println("                      ░░░░▒▒▒▒▒▒░░      ▒▒░░░░  ░░      ░░▒▒░░▒▒▒▒ ");
            // System.out.println("                   ▒▒░░▒▒▒▒░░    ░░▒▒▒▒░░    ░░      ░░▒▒▒▒▒▒░░");
            // System.out.println("                      ▒▒▒▒▒▒    ░░░░  ░░▓▓▒▒    ░░      ▒▒▒▒▒▒▒▒░░");
            // System.out.println("                    ░░░░      ░░░░  ░░░░░░▒▒            ▒▒▒▒▒▒▒▒░░");
            // System.out.println("                 ░░░░  ▒▒▓▓░░░░░░░░░░  ▒▒            ▒▒▒▒▒▒▒▒░░");
            // System.out.println("                    ▒▒░░▒▒▒▒▓▓    ░░░░    ░░      ░░    ▒▒▒▒▒▒░░░░");
            // System.out.println("                    ░░▒▒▒▒▒▒▓▓    ░░░░                  ▓▓▒▒▒▒░░▒▒");
            // System.out.println("               ░░▒▒▒▒▒▒▒▒▒▒░░░░░░                ░░  ▒▒▒▒▒▒  ▒▒");
            // System.out.println("                  ░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░        ░░░░▒▒░░░░▒▒▒▒▒▒  ░░ ");
            // System.out.println("                  ▒▒▒▒▒▒▒▒▒▒▒▒████████████████████████▒▒▒▒▒▒░░  ░░");
            // System.out.println("            ░░▒▒▒▒▓▓▒▒▓▓████████████████████▓▓██▓▓▓▓▒▒▒▒  ░░");
            // System.out.println("                ▒▒▒▒▓▓▒▒▒▒▓▓▓▓██▓▓████▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▒▒  ░░");
            // System.out.println("                ▒▒▒▒▓▓▒▒▓▓██▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▒▒  ▒▒");
            // System.out.println("             ▒▒▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒  ▒▒ ");
            // System.out.println("                ▒▒▒▒░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██  ░░  ");
            // System.out.println("                ▓▓▒▒  ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░ ");
            // System.out.println("           ░░▓▓▒▒░░▓▓▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▓▓  ▒▒");
            // System.out.println("              ░░▓▓░░▒▒▓▓░░  ░░░░░░░░▒▒▒▒░░░░▒▒░░░░░░░░░░▒▒  ░░");
            // System.out.println("              ░░▓▓░░▓▓▒▒    ░░░░░░░░░░        ░░░░░░░░░░░░░░ ");
            // System.out.println("           ░░▒▒  ▓▓▒▒    ░░░░░░░░░░        ░░░░░░░░░░  ░░");
            // System.out.println("              ░░▒▒░░▓▓▒▒  ░░░░░░░░░░          ░░░░░░    ░░");
            // System.out.println("              ░░▒▒░░▒▒░░  ░░░░░░░░░░          ░░░░      ░░ ");
            // System.out.println("            ▒▒  ▒▒    ░░░░░░░░░░            ░░");
            // System.out.println("                ▒▒░░▒▒    ░░░░░░░░              ░░");
            // System.out.println("             ▒▒░░▒▒    ░░░░░░░░              ░░");
            // System.out.println("                ░░░░░░    ░░░░░░░░              ░░░░ ");
            // System.out.println("                  ░░░░    ░░  ░░░░              ░░░░");
            // System.out.println("              ░░      ░░  ░░                ▒▒░░    ░░");
            // System.out.println("                  ░░    ░░░░░░░░                ░░░░    ░░");
            // System.out.println("                     ░░░░░░░░                ░░░░░░░░");
            // System.out.println("                        ░░░░░░░░                ░░  ░░░░  ░░");
            // System.out.println("                        ░░░░░░░░                ░░  ░░░░");
            // System.out.println("                  ░░░░░░  ░░                    ░░░░");
            // System.out.println("                      ▒▒░░  ░░░░                    ░░░░    ░░");
            // System.out.println("                   ▓▓██████                        ▒▒▒▒██▓▓");
            // System.out.println("                      ██████▒▒                        ▓▓████▓▓");
            // System.out.println("                      ██████░░                        ░░██████");
            // System.out.println("               ██████                            ██████  ");
            // System.out.println("                    ░░████▓▓                            ▓▓████ ");
            // System.out.println("                    ░░████░░                            ▒▒████░░ ");
            // System.out.println("             ▒▒████                                ████▓▓");
            // System.out.println("                    ████▓▓                                ██████  ");
            // System.out.println("                    ▓▓▓▓▓▓                                ▓▓██▓▓░░");
            // System.out.println("                  ▒▒▓▓▓▓▒▒░░░░                            ▒▒▓▓▓▓░░    ");
            // System.out.println("                      ▓▓▒▒░░░░░░                          ░░▒▒▒▒▒▒ ");
            // System.out.println("                ▓▓░░░░▓▓▓▓░░░░                            ▓▓▒▒░░▓▓");
            // System.out.println("                ▒▒▒▒▒▒▓▓██▒▒  ░░░░░░░░░░░░░░░░░░░░░░        ▓▓▒▒▒▒▓▓   ");
            // System.out.println("                ██▓▓▓▓▓▓▓▓                            ░░░░▒▒▓▓▓▓▓▓██");
            player.heal();
            break;
          case 3: 
            System.out.println("You run into Saber's dad\nSaber's dad: How dare you decieve my daughter!\n(╬ Ò ‸ Ó)\nC's dad smack you for 10 health and took all your money cause the game hates you!");
            player.takeDamage(10); 
            player.spendMoney(player.getMoney()); 
            break; 
          case 4: 
            // System.out.println("You ran into an antitank mine from World War II!");
            // System.out.println("      _.-^^---....,,--     ");
            // System.out.println("  _--                  --_ ");
            // System.out.println("<                        >)");
            // System.out.println("|                         | ");
            // System.out.println("  |._                   _./  ");
            // System.out.println("    ```--. . , ; .--'''    ");
            // System.out.println("         | |   |       ");
            // System.out.println("      .-=||  | |=-.   ");
            // System.out.println("      `-=#$%&%$#=-'   ");
            // System.out.println("         | ;  :|    ");
            // System.out.println("_____.,-#%&$@%#&#~,._____");
            player.takeDamage((int)(player.getHp()/2)); 
            break;
          case 5: 
            // System.out.println("You were bamboozled by a tank and lose 5 health! ");
            // System.out.println("         ________      ");
            // System.out.println("     (( /========\\ ");
            // System.out.println("     __/__________\\____________n_");
            // System.out.println("   (( /              \\_____________]");
            // System.out.println("     /  =(*)=          \\ ");
            // System.out.println("    |_._._._._._._._._.|         ! ");
            // System.out.println(" (( / __________________ \\      =o ");
            // System.out.println("   | OOOOOOOOOOOOOOOOOOO0 |   =  ");
            player.takeDamage(5);
            break; 
          case 6: 
            // System.out.println("You meet Doraemon and was given some money and heal yourself"); 
            // System.out.println("           ⢀⣠⣤⣴⣶⣶⣶⣶⣶⠶⣶⣤⣤⣀⠀⠀⠀  ");
            // System.out.println("       ⢀⣤⣾⣿⣿⣿⠁⠀⢀⠈⢿⢀⣀⠀⠹⣿⣿⣿⣦⣄");
            // System.out.println("      ⣴⣿⣿⣿⣿⣿⠿⠀⠀⣟⡇⢘⣾⣽⠀⠀⡏⠉⠙⢛⣿⣷⡖⠀");
            // System.out.println("     ⣾⣿⣿⡿⠿⠷⠶⠤⠙⠒⠀⠒⢻⣿⣿⡷⠋⠀⠴⠞⠋⠁⢙⣿⣄");
            // System.out.println("    ⢸⣿⣿⣯⣤⣤⣤⣤⣤⡄⠀⠀⠀⠀⠉⢹⡄⠀⠀⠀⠛⠛⠋⠉⠹⡇ ");
            // System.out.println("    ⢸⣿⣿⠀⠀⠀⣀⣠⣤⣤⣤⣤⣤⣤⣤⣼⣇⣀⣀⣀⣛⣛⣒⣲⢾⡷ ");
            // System.out.println("⢀⠤⠒⠒⢼⣿⣿⠶⠞⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠁⠀⣼⠃ ");
            // System.out.println("⢮⠀⠀⠀⠀⣿⣿⣆⠀⠀⠻⣿⡿⠛⠉⠉⠁⠀⠉⠉⠛⠿⣿⣿⠟⠁⠀⣼⠃⠀  ");
            // System.out.println("⠈⠓⠶⣶⣾⣿⣿⣿⣧⡀⠀⠈⠒⢤⣀⣀⡀⠀⠀⣀⣀⡠⠚⠁⠀⢀⡼⠃⠀⠀");
            // System.out.println("    ⠈⢿⣿⣿⣿⣿⣿⣷⣤⣤⣤⣤⣭⣭⣭⣭⣭⣥⣤⣤⣤⣴⣟⠁");
            player.receiveMoney(10);
            player.heal();
            break;
        }
        Map.getInstance().removeCharAtLoc(player.getLocation());   
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
          System.out.println("\nWelcome to the Pokemon hospital!\nPoor little pokemons, you have a horrible master!\nLet me fix them up.\n\nPOKEMON HAVE BEEN HEALED\n");
          player.healAllPokemon();
         }
       } 
     }while(i != 5 || player.getHp() == 0);   
    
   }


  /**
  * Print the main menu
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
  * Generate randomly from 1 to 6 and choose from the wild pokemon. 
  * @return Pokemon object to use as wild and fight player 
  */
  // public static Pokemon chooseRandomPokemon()
  // {
  //   Random rand = new Random();
  //   Pokemon randPokemon = null;
  //   int rand1 = rand.nextInt(6); 
  //   switch(rand1) {
  //     case 0:
  //       randPokemon = new Bulbasaur();
  //       break; 
  //     case 1:
  //       randPokemon = new Charmander();
  //       break;
  //     case 2:
  //       randPokemon = new Oddish();
  //       break;
  //     case 3:
  //       randPokemon = new Ponyta();
  //       break;
  //     case 4:
  //       randPokemon = new Squirtle();
  //       break;
  //     case 5:
  //       randPokemon = new Staryu();
  //       break;
  //   }
  //   return randPokemon;
  // }


  public static void gymAttack(Trainer t, Trainer gym, Pokemon gymPoke) {
   
    Random rand = new Random();

    boolean battle = true;
    
    while (battle) {
      // If the wild pokemon is defeated, end the fight and reward player 5-10 money.
      if (gymPoke.getHp() == 0) {
        System.out.println("\nThe gym leader's " + gymPoke.getName() + " has been defeated!");
        int rewardMoney = rand.nextInt(5) + 5;
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


          // If chosen pokemon has no health, damage the trainer and break
          if (chosenPokemon.getHp() == 0 ) {
            
            int dmg = rand.nextInt(10) + 1;
            
            System.out.println(chosenPokemon.getName() + " has no more health left!");
            System.out.println("The gym leader's " + gymPoke.getName() + " charges and attacks you instead!");
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
            System.out.println("You chose to heal " + healPokemon.getName());
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
          Pokemon chosenPokemon = t.getPokemon(CheckInput.getIntRange(1, t.getNumPokemon()));
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
          
          int pokemonChoice =  CheckInput.getIntRange(0, t.getNumPokemon());
          Pokemon healPokemon = t.getPokemon(pokemonChoice);
          
          if(healPokemon.getHp() == healPokemon.getMaxHp()) {
            System.out.println(healPokemon.getName() + " is at full health, cannot be healed.");
          }
          else {
            System.out.println("You chose to heal " + healPokemon.getName());
            t.usePotion(pokemonChoice);
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
                battle = false;
                break;
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
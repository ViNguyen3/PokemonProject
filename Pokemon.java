import java.util.Random;
/**
* The abstract Pokemon class contains the pokemon constructor and the methods that handle the pokemon and their health along with the basic attack menu and attacks along with the getting of the pokemon's types.
* @author Dylan Ros
*/
public abstract class Pokemon extends Entity {
  
  /** 
  * battleTable consists of the values tied to element/type advantages/disadvantages that [attacking] and [defending] pokemon use to determine their attack's total damage output.
  * Fire Types are 0, Water types are 1, and Grass types are 2.
  */
  public static final double [] [] battleTable = {{1, .5, 2}, {2, 1, .5}, {.5, 2, 1}};
  
  /** 
  * Pokemon constructor creates new Pokemon
  * Pokemon are assigned 25 HP once made
  * @param n represents the name of the Pokemon and 25 maxHp
  */ 
  public Pokemon(String n, int h, int m) {
    super(n, h, 25);
  }

  // public abstract String getSpecialMenu();

  // public abstract int getNumSpecialMenuItems();

  // public abstract String specialAttack(Pokemon p, int move);

    public String getAttackTypeMenu() {
      return "1. Basic Attacks\n2. Special Attacks";
    }

    public int getNumAttackTypeMenuItems() {
      return 2;
    }
  
  /** 
  * The getBasicMenu method consists of the basic menu options
  * @return the string consisting of the basic attack menu options that the user chooses from.
  */
  // public String getBasicMenu() {
  //  String basicMenu = "1. Slam\n2. Tackle\n3. Punch";
  //  return basicMenu;
 // }

  /*()
  * getNumBasicMenuItems consists of the integer/number of basic attack menu items from the menu.
  * @return the total number of basic menu items
  */
 // public int getNumBasicMenuItems() {
 //   return 3;
 // }

/**
* The basicAttack method consists of a switch statement with cases returning the specific basic attack choices.
* @param p the Pokemon performing the basic attack
* @param move is the integer the player chooses from basic attack menu
* @return the chosen basic attack and the outcome
*/ 
  public String basicAttack(Pokemon p, int move) {
    
    switch (move) {
      case 1:
        return slam(p);
      case 2:
        return tackle(p);
      case 3:
        return punch(p);
      default:
        System.out.println("Invalid entry. Please try again.");
    }
      return "";
  }

  /** 
  * The getAttackMenu method consists of the two attack menu options
  * @return the string consisting of the two type of attack menus
  */
  public String getAttackMenu(int atkType) {
    String attackMenu = "1. Slam\n2. Tackle\n3. Punch";
    return attackMenu;
  }
  /** 
  * getNumAttackMenuItems consists of the integer/number of the attack menu items from the menu.
  * @return the total number of attack menu items
  */
  public int getNumAttackMenuItems(int atkType) {
    return 2;
  }

  public String getAttackString(int atkType, int move) {
    String atkString = "";
    switch (move) {
      case 1:
        atkString += "SLAMMED";
        break;
      case 2:
        atkString += "TACKLED";
        break;
      case 3:
        atkString += "PUNCHED";
        break;
      default:
        System.out.println("Invalid entry. Please try again.");
    }
      return atkString;
  }

  public int getAttackDamage(int atkType, int move) {
    Random rand = new Random();
    int dmg = 0;

    switch (move) {
      case 1:
        // Slam damages between 0 and 5
        dmg = rand.nextInt(6);
        break;

      case 2:
        // Tackle damages between 2 and 3
        dmg = rand.nextInt(2) + 2;
        break;
        
      case 3:
        // Punch damages between 1 and 4
        dmg = rand.nextInt(4) + 1;
        break;
    }
    return dmg;
  }

// attack multiplier based on move, nothing for basic ?
  public int getAttackMultiplier(Pokemon p, int atkType) {
    // FIX ME
    return 0;
  }

// attack bonus added to damage
  public int getAttackBonus(int atkType) {
    // FIX ME
    return 0;
  }

  public String attack(Pokemon p, int atkType, int move) {
    
  }

/**
* The slam method consists of the slam move performed by the pokemon, dealing damage of 0-5
* @param p the Pokemon performing the basic attack
* @return the string describing the attack
*/ 
  public String slam(Pokemon p) {
    // Slam damages between 0 and 5
    Random rand = new Random();
    int dmg = rand.nextInt(6);
    p.takeDamage(dmg);

    return this.getName() + " SLAMS "+ p.getName() + " for  "  + dmg + " damage!";
    
  } 

/**
* The tackle method consists of the tackle move performed by the pokemon, dealing damage of 2-3
* @param p the Pokemon performing the basic attack
* @return the string describing the attack
*/ 
  public String tackle(Pokemon p) {
    // Tackle damages between 2 and 3
    Random rand = new Random();
    int dmg = rand.nextInt(2) + 2;
    p.takeDamage(dmg);
    
    return this.getName() + " TACKLES "+ p.getName() + " for  "  + dmg + " damage!";

  }

/**
* The punch method consists of the punch move performed by the pokemon, dealing damage of 1-4
* @param p the Pokemon performing the basic attack
* @return the string describing the attack
*/ 
  public String punch(Pokemon p) {
    // Punch damages between 1 and 4
    Random rand = new Random();
    int dmg = rand.nextInt(4) + 1;
    p.takeDamage(dmg);
    System.out.println("|_,-_-___-_,_,_,_,__, ,--, /: :\\/': :`\\/: :\\ __,__,__,_,-_-___-_,___.|"); 
    System.out.println("|{    (    (    (    |`;  ' `,'   `.;    `: |{(    )   )   (    (    |"); 
    System.out.println("|-;      )     ,-,   |    |     |  '  |     |.-,  ,.  /;      )     ,|"); 
    System.out.println("| ;   ;;    /\\/   \\/\\| :  |     |  :  |     ||  \\/  \\/ ;   ;;    /\\/ |"); 
    System.out.println("|  |  ;`,  ,  `      | :. |  :  |  :  |  :  | \\         |  ;`,  ,  ` |"); 
    System.out.println("|  ; |  | |    ,  ,,  \\__/: :.. : :.. | :.. |  )   ,    ; |  | |     |"); 
    System.out.println("|  ; ;  `,'   / \\/  \\      `---',\\___/,\\___/ /' , / \\   ; ;  `,'     |"); 
    System.out.println("|   |;   |  ,'  ;\\   ',         `==._ .. . /'  / \\  ;\\   |;   |      |"); 
    System.out.println("|   ||     /    ;;)  ;;\\             `-::-'   /  ;) ;;\\ ||          |"); 
    System.out.println("----------------------------------------------------------------------"); 
    return this.getName() + " PUNCHES "+ p.getName() + " for " + dmg + " damage!"; 
  }

/**
* The getType method assigns Pokemons of a specific type to their proper number according to the battleTable (Fire-0, Water-1, and Grass-2)
* @return the string describing the attack
*/ 
  public int getType() {
    int pType = 0;

    if (this instanceof Fire) pType = 0;
    else if (this instanceof  Water) pType = 1;
    else if (this instanceof Grass) pType = 2;

    return pType;
  }
}
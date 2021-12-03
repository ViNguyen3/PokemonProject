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
  * @param n represents the name of the Pokemon and 25 maxHp
  * @param h represents the current health of the Pokemon
  * @param m represents the max health of the Pokemon
  */ 
  public Pokemon(String n, int h, int m) {
    super(n, h, m);
  }
  
  /** 
  * String getAttackTypeMenu consists of the attack type menu options
  * Pokemon are assigned 25 HP once made
  * @return String consisting of attack type menu options
  */
  public String getAttackTypeMenu() {
    return "1. Basic Attacks\n2. Special Attacks";
  }

  /** 
  * Int getNumAttackTypeMenuItems consists of the integer/number of the attack types from the menu.
  * @return total number of attack type menu items
  */
  public int getNumAttackTypeMenuItems() {
    return 2;
  }

  /** 
  * The getAttackMenu method consists of the two attack menu options
  * @param atkType represents the attack type choice from the attack type menu
  * @return attackMenu which is the string consisting of the two type of attack menus
  * @return empty string if not atkType != 1
  */
  public String getAttackMenu(int atkType) {
    String attackMenu = "1. Slam\n2. Tackle\n3. Punch";
    if(atkType == 1) {
      return attackMenu;
    }
    else {
      return "";
    }
  }
  /** 
  * getNumAttackMenuItems consists of the integer/number of the attack menu items from the menu.
  * @param atkType represents the attack type choice from the attack type menu
  * @return the total number of attack menu items
  */
  public int getNumAttackMenuItems(int atkType) {
    return 2;
  }

  /** 
  * The getAttackString method consists the strings for the basic attack moves
  * @param atkType represents the attack type choice from the attack type menu
  * @param move represents the chosen basic attack move
  * @return atkString which is the string based on chosen basic attack
  */
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

  /** 
  * The getAttackDamage method consists of the damage ranges for each basic attack
  * @param atkType represents the attack type choice from the attack type menu
  * @param move represents the chosen basic attack move
  * @return dmg which is the integer number representing the damage for each basic attack
  */
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

  /** 
  * The getAttackMultiplier method consists of the attack multiplier based on attack type
  * @param p represents the pokemon that will receive the multiplier
  * @param atkType represents the attack type choice from the attack type menu
  * @return 1 which is the integer representing the attack multiplier
  */
  public double getAttackMultiplier(Pokemon p, int atkType) {
    if (atkType == 1) {
      return 1;
    }
    return 1;
  }

  /** 
  * The getAttackBonus method consists of the attack multiplier based on attack type
  * @param atkType represents the attack type choice from the attack type menu
  * @return 0 which is the integer in place due to it being overridden in buffs
  */
  public int getAttackBonus(int atkType) {
    return 0;
  }

  /** 
  * The attack method consists of operations for attacks including attack damage, multiplier, and total damage.
  * @param p represents the pokemon that will receive the multiplier
  * @param atkType represents the attack type choice from the attack type menu
  * @param move represents the chosen attack move
  * @return the string displaying the pokemon taking damage, the attackstring, and the total damage
  */
  public String attack(Pokemon p, int atkType, int move) {
    int attackDmg = this.getAttackDamage(atkType, move);
    int attackBonus = this.getAttackBonus(atkType);
    double attackMultiplier = this.getAttackMultiplier(p, atkType);

    double totalDmg = (attackDmg + attackBonus) * attackMultiplier;
    p.takeDamage((int)totalDmg);

    return p.getName() + " is " + this.getAttackString(atkType, move) + " and takes " + (int)totalDmg + " damage!"; 
  }


  //   System.out.println("|_,-_-___-_,_,_,_,__, ,--, /: :\\/': :`\\/: :\\ __,__,__,_,-_-___-_,___.|"); 
  //   System.out.println("|{    (    (    (    |`;  ' `,'   `.;    `: |{(    )   )   (    (    |"); 
  //   System.out.println("|-;      )     ,-,   |    |     |  '  |     |.-,  ,.  /;      )     ,|"); 
  //   System.out.println("| ;   ;;    /\\/   \\/\\| :  |     |  :  |     ||  \\/  \\/ ;   ;;    /\\/ |"); 
  //   System.out.println("|  |  ;`,  ,  `      | :. |  :  |  :  |  :  | \\         |  ;`,  ,  ` |"); 
  //   System.out.println("|  ; |  | |    ,  ,,  \\__/: :.. : :.. | :.. |  )   ,    ; |  | |     |"); 
  //   System.out.println("|  ; ;  `,'   / \\/  \\      `---',\\___/,\\___/ /' , / \\   ; ;  `,'     |"); 
  //   System.out.println("|   |;   |  ,'  ;\\   ',         `==._ .. . /'  / \\  ;\\   |;   |      |"); 
  //   System.out.println("|   ||     /    ;;)  ;;\\             `-::-'   /  ;) ;;\\ ||          |"); 
  //   System.out.println("----------------------------------------------------------------------"); 

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
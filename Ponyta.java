import java.util.Random;

/**
* The public class Ponyta extends to the fire class in order to let the pokemon the use specfic fire moves.
* Ponyta is fire type pokemon so it will always use fire attack as its special attacks shown in the class.
* It takes x2 damage from water types attacks and x.5 damage from grass type attacks. 
* @author Angel Rubio
*/
public class Ponyta extends Pokemon implements Fire {


  /**
  * Ponyta just ensures that this file is treated as the pokemon Ponyta.
  */
  public Ponyta (){
    super("Ponyta");
  }

  /**
  * getSpecialMenu is the speified menu for special fire attacks meant for fire type ponyta.
  * @return the special attacks for ponyta
  */
  public String getSpecialMenu() {
    System.out.println("\nChoose a Special Attack:");
    String specialMenu = "1. Ember\n2. Fire Blast\n3. Fire Punch";
    return specialMenu;
  }

  /**
  * getNumSpecialMenuItems()
  *@return a special menu of items like potions.
  */
  public int getNumSpecialMenuItems() {
    return 3;
  }

  /**
  * String specialAttack turns all the fire based special attack into strings and returns it.
  *@param p is the pokemon being fought against.
  *@param move is the special attack being casted.
  * @return returns a specified move based on case.
  */
  public String specialAttack(Pokemon p, int move) {
     switch (move) {
      case 1:
        return ember(p);
      case 2:
        return fireBlast(p);
      case 3:
        return firePunch(p);
      default:
        System.out.println("Invalid entry. Please try again.");
    }
    return ""; 
  }

  /**
  * String ember(pokemon p) turns the entire battle with the usage of ember into a string chain.
  * @param pokemon p is the pokemon that is being fought against. 
  * @return amount of damage ember did to pokemon in a string format
  */
  //0-4 dmg 
  public String ember(Pokemon p) {
    Random rand = new Random();
    double dmgType = battleTable[this.getType()][p.getType()];
    int dmg = rand.nextInt(5);
    int specialDmg = (int) (dmg * dmgType);
    p.takeDamage(specialDmg);

    return this.getName() + " uses EMBER on " + p.getName() + " for " + specialDmg + " damage!";
  }
  
   /**
  * String fireBlast(pokemon p) turns the entire battle with the usage of fireblast into a string chain.
  * @param p is the pokemon that is being fought against.  
  * @return amount of damage fireblast to pokemon in a string format
  */
  //2-5dmg 
  public String fireBlast(Pokemon p) {
    Random rand = new Random();
    double dmgType = battleTable[this.getType()][p.getType()];
    int dmg = rand.nextInt(4)+2;
    int specialDmg = (int) (dmg * dmgType);
    p.takeDamage(specialDmg);

    return this.getName() + " FIREBLASTS " + p.getName() + " for " + specialDmg + " damage!";
  }


   /**
  * String firePunch(pokemon p) turns the entire battle with the usage of firepunch into a string chain. 
  * @param p is the pokemon that is being fought against. 
  * @return amount of damage firepunch does to a pokemon in a string.
  */
  //1-4 dmg 
  public String firePunch(Pokemon p) {
    Random rand = new Random();
    double dmgType = battleTable[this.getType()][p.getType()];
    int dmg = rand.nextInt(4)+1;
    int specialDmg = (int) (dmg * dmgType);
    p.takeDamage(specialDmg);

    return this.getName() + " used to learn boxing from Muhammad Ali and FIREPUNCHES " + p.getName() + " for " + specialDmg + " damage!";
  }
  
}
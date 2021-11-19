/**
* The public class Squirtle extends from Pokemon class and implements interface Water in order to let the pokemon the use specfic Water moves.
* Squirtle is a water type pokemon
* @author Vi Nguyen 
*/
import java.util.Random;
public class Squirtle extends Pokemon implements Water {
  /**
  * The Squirtle constructor creates the Squirtle.
  */
  public Squirtle (){
    super("Squirtle");
  }

  /** 
  * The getSpecialMenu method consists of the special menu options
  * @return the string consisting of the special attack menu options that the user chooses from.
  */
  public String getSpecialMenu() {
    System.out.println("\nChoose a Special Attack:");
    return "1. Water Gun\n2. Bubble Beam\n3. Waterfall";
  }

  /** 
  * getNumSpecialMenuItems consists of the integer/number of special attack menu items from the menu.
  * @return the total number of special menu items
  */
  public int getNumSpecialMenuItems() {
    return 3; 
  }
  
  /**
  * The specialAttack method consists of a switch statement with cases returning the specific special attack choices.
  * @param p the Pokemon performing the special attack
  * @param move is the integer the player chooses from special attack menu
  * @return the chosen special attack and the outcome
  */ 
  public String specialAttack(Pokemon p, int move) {
    switch (move) {
      case 1:
        return waterGun(p);
      case 2:
        return bubbleBeam(p);
      case 3:
        return waterfall(p);
      default:
        System.out.println("Invalid entry. Please try again.");
    }
    return ""; 
    }
  

  /**
  * The waterGun method consists of the waterGun move performed by the Pokemon, dealing damage of 2-5
  * @param p the Pokemon performing the special attack
  * @return the string describing the attack
  */ 
  public String waterGun(Pokemon p) {
    Random rand = new Random();
    double dmgType = battleTable[this.getType()][p.getType()];
    int dmg = rand.nextInt(4)+2;
    int specialDmg = (int) (dmg * dmgType);
    p.takeDamage(specialDmg);

    return this.getName() + " uses WATERGUN on " + p.getName() + " for " + specialDmg + " damage!";
  }
  
  /**
  * The bubbleBeam method consists of the bubbleBeam move performed by the Pokemon, dealing damage of 1-3
  * @param p the Pokemon performing the special attack
  * @return the string describing the attack
  */ 
  public String bubbleBeam(Pokemon p) {
    Random rand = new Random();
    double dmgType = battleTable[this.getType()][p.getType()];
    int dmg = rand.nextInt(3)+1;
    int specialDmg = (int) (dmg * dmgType);
    p.takeDamage(specialDmg);

    return this.getName() + " BUBBLEBEAMS " + p.getName() + " for " + specialDmg + " damage!";
  }
  
  /**
  * The waterfall method consists of the waterfall move performed by the Pokemon, dealing damage of 1-4
  * @param p the Pokemon performing the special attack
  * @return the string describing the attack
  */ 
  public String waterfall(Pokemon p) {
    Random rand = new Random();
    double dmgType = battleTable[this.getType()][p.getType()];
    int dmg = rand.nextInt(4)+1;
    int specialDmg = (int) (dmg * dmgType);
    p.takeDamage(specialDmg);
   
    return this.getName() + " unleashes a WATERFALL on " + p.getName() + " for " + specialDmg + " damage!";
  }
  
}
import java.util.Random;

/**
* The Bulbasaur class extends the Pokemon class and implements the Grass interface.
* Bulbasaur is a grass type Pokemon
* @author Dylan Ros
*/
public class Bulbasaur extends Pokemon implements Grass {
/**
* The Bulbasaur constructor creates the Bulbasaur.
*/
  public Bulbasaur (){
    super("Bulbasaur");
  }
  /** 
  * The getSpecialMenu method consists of the special menu options
  @return the string consisting of the special attack menu options that the user chooses from.
  */
  public String getSpecialMenu() {
    System.out.println("\nChoose a Special Attack:");
    String specialMenu = "1. Vine Whip\n2. Razor Leaf\n3. Solar Beam";
    return specialMenu;
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
        return vineWhip(p);
      case 2:
        return razorLeaf(p);
      case 3:
        return solarBeam(p);
      default:
        System.out.println("Invalid entry. Please try again.");
    }
    return "";  
  }
/**
* The vineWhip method consists of the vineWhip move performed by the Pokemon, dealing damage of 1-3
* @param p the Pokemon performing the special attack
* @return the string describing the attack
*/ 
  public String vineWhip(Pokemon p) {
    // Vine whip damages for 1-3
    Random rand = new Random();
    double dmgType = battleTable[this.getType()][p.getType()];
    int dmg = rand.nextInt(3) + 1;
    int specialDmg = (int) (dmg * dmgType);
    p.takeDamage(specialDmg);

    return this.getName() + "  WHIPS " + p.getName() + " for " + specialDmg + " damage!";
  }
/**
* The razorLeaf method consists of the razorLeaf move performed by the Pokemon, dealing damage of 2-4
* @param p the Pokemon performing the special attack
* @return the string describing the attack
*/ 
  public String razorLeaf(Pokemon p) {
    // Razor leaf damages for 2-4
    Random rand = new Random();
    double dmgType = battleTable[this.getType()][p.getType()];
    int dmg = rand.nextInt(3) + 2;
    int specialDmg = (int) (dmg * dmgType);
    p.takeDamage(specialDmg);

    return this.getName() + " SLICES " + p.getName() + " for " + specialDmg + " damage!";
  }
/**
* The solarBeam method consists of the solarBeam move performed by the Pokemon, Bulbasaur specifically dealing damage of 0-5
* @param p the Pokemon performing the special attack
* @return the string describing the attack
*/ 
  public String solarBeam(Pokemon p) {
    // Solar beam by Bulbasaur damages for 0-5
    Random rand = new Random();
    double dmgType = battleTable[this.getType()][p.getType()];
    int dmg = rand.nextInt(6);
    int specialDmg = (int) (dmg * dmgType);
    p.takeDamage(specialDmg);
    System.out.println("_    ___    ___    ___    ___          ");
    System.out.println("_`| / __`| / __`| / __`| / .-^  ___  ");
    System.out.println("---/ /----/ /----/ /----/ /--=^^   ^^=,");
    System.out.println("--/ /----/ /----/ /----/ /---=__   __=' ");
    System.out.println("|._/   |._/   |._/   |._/       ^^^    /n");
    return this.getName() + " kamehameha BEAMS " + p.getName() + " for " + specialDmg + " damage!";
  }

}
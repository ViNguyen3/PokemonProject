/**
* The interface Water consists of the Water special attack menu options, the number of Water special attack menu options, and the three Water special attacks.
@author Vi Nguyen 
*/


import java.util.Random;
public class Water extends Pokemon 
{
  /** 
  * Water constructor creates new Water pokemon
  * @param n represents the name of the Pokemon and 25 maxHp
  * @param h represents the current health of the Pokemon
  * @param m represents the max health of the Pokemon
  */   
   public Water(String n, int h, int m)
   {
     super(n, h, m);
   }
  /** 
  * The getAttackMenu method consists of the two attack menu options
  * @param atkType represents the attack type choice from the attack type menu
  * @return attackMenu if atkType is 1, returns basic attack menu
  * @return attackMenu if atkType is 2, returns the special attack menu
  */
   @Override 
   public String getAttackMenu(int atkType)
   {
    String attackMenu = "1. Water Gun\n2. Bubble Beam\n3. Waterfall";
    if(atkType == 1) {
      attackMenu = super.getAttackMenu(1);
      return attackMenu;
    }
    else {
      return attackMenu;
    }    
   }
  /** 
  * getNumAttackMenuItems consists of the integer/number of the attack menu items from the menu.
  * @param atkType represents the attack type choice from the attack type menu
  * @return the total number of attack menu items
  */     
   @Override   
   public int getNumAttackMenuItems(int atkType)
   {
    return 3; 
   }
  /** 
  * The getAttackString method consists the strings for the special attack moves
  * @param atkType represents the attack type choice from the attack type menu
  * @param move represents the chosen basic attack move
  * @return atkString which is the string based on chosen basic attack
  */
   @Override 
   public String getAttackString(int atkType, int move)
   {
    String atkString = "";
    if(atkType == 1) {
      return super.getAttackString(atkType, move);
    }
    else {
      switch (move) {
        case 1:
          atkString += "sprayed with WATER GUN";
          break;
        case 2:
          atkString += "BUBBLE BEAMED";
          break;
        case 3:
          atkString += "submerged with WATERFALL";
          break;
        default:
          System.out.println("Invalid entry. Please try again.");
      }
    }
      return atkString;
   }
  /** 
  * The getAttackDamage method consists of the damage ranges for each special attack
  * @param atkType represents the attack type choice from the attack type menu
  * @param move represents the chosen basic attack move
  * @return dmg which is the integer number representing the damage for each special attack
  */
   @Override 
   public int getAttackDamage(int atkType, int move)
   {
      Random rand = new Random();
      int dmg = 0;

      switch (move) {
      case 1:
        //range 1-5 
        dmg = rand.nextInt(5) + 1; 
        return dmg;
      case 2:
        //range 1-3
        dmg = rand.nextInt(3) + 1;
        return dmg;
      case 3:
        //range 1-4
        dmg = rand.nextInt(4) + 1;
        return dmg;
      default:
        System.out.println("Invalid entry. Please try again.");
    }
    return 0; 
   }
  /** 
  * The getAttackMultiplier method consists of the attack multiplier based on attack type
  * @param p represents the pokemon that will receive the multiplier
  * @param atkType represents the attack type choice from the attack type menu
  * @return 1 if atkType is equal to 1 (basic attack)
  * @return dmgMultiplier if atkType is equal to 2 (special attack) using the battleTable
  */
   @Override 
   public double getAttackMultiplier(Pokemon p, int atkType)
   {
     double dmgMultiplier = 0;
     if (atkType == 1) {
       return 1;
     }

     else {
        dmgMultiplier = battleTable[this.getType()][p.getType()];
      }
      return dmgMultiplier;
   }
}
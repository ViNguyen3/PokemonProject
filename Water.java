/**
* The interface Water consists of the Water special attack menu options, the number of Water special attack menu options, and the three Water special attacks.
@author Vi Nguyen 
*/
// public interface Water {
//   public String specialMenu = "1. Water Gun\n2. Bubble Beam\n3. Waterfall";
  
//   public String waterGun(Pokemon p);

//   public String bubbleBeam(Pokemon p);

//   public String waterfall(Pokemon p);
// }

import java.util.Random;
public class Water extends Pokemon 
{
   public Water(String n, int h, int m)
   {
     super(n, h, m);
   }

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
   
   @Override   
   public int getNumAttackMenuItems(int atkType)
   {
    return 3; 
   }

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
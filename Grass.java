/**
* The interface Grass consists of the Grass special attack menu options, the number of Grass special attack menu options, and the three Grass special attacks.
@author Dylan Ros
*/
// public interface Grass 
// {
//   public String specialMenu = "1. Vine Whip\n2. Razor Leaf\n3. Solar Beam";

//   public int numSpecialMenuItems = 3;
  
//   public String vineWhip(Pokemon p);

//   public String razorLeaf(Pokemon p);

//   public String solarBeam(Pokemon p); 
// }

import java.util.Random;
public class Grass extends Pokemon 
{
   public Grass(String n, int h, int m)
   {
     super(n, h, m);
   }

   @Override 
   public String getAttackMenu(int atkType)
   {
    String attackMenu = "1. Vine Whip\n2. Razor Leaf\n3. Solar Beam";
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
          atkString += "VINE WHIPPED";
          break;
        case 2:
          atkString += "cut with RAZOR LEAVES";
          break;
        case 3:
          atkString += "SOLAR BEAMED";
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
        //range 1-3
        dmg = rand.nextInt(3) + 1; 
        return dmg;
      case 2:
        //range 2-4
        dmg = rand.nextInt(3) + 2;
        return dmg;
      case 3:
        //range 0-5
        dmg = rand.nextInt(6);
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
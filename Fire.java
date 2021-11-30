/**
* The class interface fire includes the three special moves ember, fireBlast and firePunch.
* The interface is meant to be added to the two fire type pokemon
* @author Angel Rubio
*/

// public interface Fire {
//   public String specialMenu = "1. Ember\n2. Fire Blast\n3. Fire Punch";

//   public int numSpecialMenuItems = 3;
  
//   public String ember(Pokemon p);

//   public String fireBlast(Pokemon p);

//   public String firePunch(Pokemon p); 
// }

import java.util.Random;
public class Fire extends Pokemon 
{
   public Fire(String n, int h, int m)
   {
     super(n, h, m);
   }

   @Override 
   public String getAttackMenu(int atkType)
   {
    String attackMenu = "1. Ember\n2. Fire Blast\n3. Fire Punch";

    if(atkType == 1) {
      attackMenu = super.getAttackMenu(1);
      return attackMenu;
    }
    else {
      return "1. Ember\n2. Fire Blast\n3. Fire Punch";
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
          atkString += "hit with EMBERS";
          break;
        case 2:
          atkString += "FIRE BLASTED";
          break;
        case 3:
          atkString += "FIRE PUNCHED";
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
        //range 0-4 
        dmg = rand.nextInt(5); 
        return dmg;
      case 2:
        //range 1-5
        dmg = rand.nextInt(5) + 1;
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
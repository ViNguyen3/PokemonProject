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


public class Fire extends Pokemon 
{
   public Fire(String n, int h, int m)
   {
     
   }

   @Override 
   public String getAttackMenu(int atkType)
   {
     String specialMenu = "1. Ember\n2. Fire Blast\n3. Fire Punch";
   }
   
   @Override   
   public int getNumAttackMenuItems(int atkType)
   {

   }

   @Override 
   public String getAttackString(int atkType, int move)
   {

   }

   @Override 
   public int getAttackDamage(int atkType, int move)
   {

   }

   @Override 
   public int getAttackMutiplier(Pokemon p, int atkType)
   {

   }
}
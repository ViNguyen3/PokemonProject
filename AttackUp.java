/**
* The concreate AttackUp class contains the AttackUp constructor and methods overriding the one in Decorator class 
* @author Vi Nguyen
*/
import java.util.Random; 
public class AttackUp extends PokemonDecorator 
{
  /**
  *Constructor of the AttackUp calling the super constructor from Decorator.
  *@param p takes in Pokemon object 
  */
  public AttackUp(Pokemon p)
  {
    super(p, " +ATK", 0);
  } 

  /**
  * getAttackBonus calling super method from the Decorator 
  *@param atkType takes in an int 
  */
  @Override
  public int getAttackBonus(int atkType)
  {
    //generate a random value for bonus attack from 1-2 
    //attack type shouldn't matter in this situation 
    Random rand = new Random();
    int dmg = rand.nextInt(2) + 1;
    return dmg + super.getAttackBonus(atkType);
  }
}
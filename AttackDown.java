/**
* The concreate AttackDown class contains the AttackDown constructor and methods overriding the one in Decorator class 
* @author Vi Nguyen
*/
public class AttackDown extends PokemonDecorator
{
  /**
  *Constructor of the AttackDown calling the super constructor from Decorator.
  *@param p takes in Pokemon object 
  */
  public AttackDown(Pokemon p)
  {
    super(p, " -ATK", 0);
  }
  
@Override
  /**
  * getAttackBonus calling super method from the Decorator 
  *@param atkType takes in an int 
  */
  public int getAttackBonus(int atkType)
  {
    //default is decrease attack point by 1 
    return super.getAttackBonus(atkType)-1; 
  }
}
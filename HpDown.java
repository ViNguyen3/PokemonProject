import java.lang.Math;
/**
* The concreate HpDown class contains the HpDown constructor and methods overriding the one in Decorator class 
* @author Vi Nguyen
*/
public class HpDown extends PokemonDecorator 
{
  /**
  *Constructor of the HpDown calling the super constructor from Decorator.
  *@param p takes in Pokemon object 
  */
  public HpDown(Pokemon p)
  {
    super(p, " -HP", -1);
  }
}
import java.util.Random;
import java.lang.Math;
/**
* The concreate HpUp class contains the HpUp constructor and methods overriding the one in Decorator class 
* @author Vi Nguyen
*/
public class HpUp extends PokemonDecorator 
{
  /**
  *Constructor of the HpUp calling the super constructor from Decorator.
  *@param p takes in Pokemon object 
  */
  public HpUp(Pokemon p)
  {
    super(p, " +HP", (int)((Math.random() * (2-1)) + 1));
  }
}
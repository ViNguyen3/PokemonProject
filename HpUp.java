import java.util.Random;
import java.lang.Math;
public class HpUp extends PokemonDecorator 
{
  public HpUp(Pokemon p)
  {
    super(p, " +HP", (int)((Math.random() * (2-1)) + 1));
  }
}
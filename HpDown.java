import java.lang.Math;
public class HpDown extends PokemonDecorator 
{
  public HpDown(Pokemon p)
  {
    super(p, "-HP", -1);
  }
}
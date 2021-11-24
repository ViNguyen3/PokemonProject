import java.util.Random;
public class HpUp extends PokemonDecorator 
{
  public HpUp(Pokemon p)
  {
    Random rand = new Random();
    int bonus = rand.nextInt(2) + 1;
    super(p, "+HP", bonus);
  }
}
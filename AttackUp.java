import java.util.Random; 
public class AttackUp extends PokemonDecorator 
{
  public AttackUp(Pokemon p)
  {
    super(p, " +ATK", 0);
  } 

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
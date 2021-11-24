public class AttackDown extends PokemonDecorator
{
  public AttackDown(Pokemon p)
  {
    super(p, "-ATK", 0);
  }

  public int getAttackBonus(int type)
  {
    //default is decrease attack point by 1 
    return -1; 
  }
}
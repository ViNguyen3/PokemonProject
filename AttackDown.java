public class AttackDown extends PokemonDecorator
{
  public AttackDown(Pokemon p)
  {
    super(p, " -ATK", 0);
  }
  
@Override
  public int getAttackBonus(int atkType)
  {
    //default is decrease attack point by 1 
    return super.getAttackBonus(atkType)-1; 
  }
}
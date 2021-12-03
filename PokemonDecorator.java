public abstract class PokemonDecorator extends Pokemon 
/**
* The abstract PokemonDecorator class contains the PokemonDecorator constructor and methods overriding the one in Pokemon class 
* @author Vi Nguyen
*/
{
  private Pokemon pokemon; 
  
  /**
  *Constructor of the Decorator 
  *@param p takes in Pokemon object 
  *@param extraName takes in a String to add to the name of the new pokemon
  *@param extraHp takes in extra Hp to add to the old one.
  */
  public PokemonDecorator(Pokemon p, String extraName, int extraHp)
  {
    super(p.getName() + extraName, p.getHp() + extraHp, p.getMaxHp() + extraHp);
    pokemon = p; 
  }
  
  //call the method from the element subclasses
  //java will automatically skip the abstract and call from the concreate classes 

  /**
  *getAttackMenu override the super class's method
  *@return calling from elements classes
  */
  @Override
  public String getAttackMenu(int atkType) {
    return pokemon.getAttackMenu(atkType); 
  }

  /**
  *getNumAttackMenuItems override the super class's method
  *@return calling from elements classes
  */  
  @Override 
  public int getNumAttackMenuItems(int atkType)
  {
    return pokemon.getNumAttackMenuItems(atkType);
  }

  /**
  *getAttackString override the super class's method
  *@return calling from elements classes
  */  
  @Override 
  public String getAttackString(int atkType, int move)
  {
    return pokemon.getAttackString(atkType, move); 
  }

  /**
  *getAttackDamage override the super class's method
  *@return calling from elements classes
  */  
  @Override 
  public int getAttackDamage(int atkType, int move)
  {
    return pokemon.getAttackDamage(atkType, move); 
  }
  
  /**
  *getAttackMultiplier override the super class's method
  *@return calling from elements classes
  */  
  @Override 
  public double getAttackMultiplier(Pokemon p, int type)
  {
    return pokemon.getAttackMultiplier(p, type); 
  }

  /**
  *getAttackBonus override the super class's method
  *@return calling from buff classes
  */  
  @Override 
  public int getAttackBonus(int type)
  {
    return super.getAttackBonus(type);         
  }

  /**
  *getType override the super class's method
  *@return calling from pokemon classes
  */  
  @Override
  public int getType() {

    return pokemon.getType();
  }  
}
//this class is abstract 
public abstract class Entity
{
  private String name; 
  private int hp; 
  private int maxHp; 

  //Constructor of the class 
  public Entity(String name, int maxHp)
  {
    this.name = name; 
    this.hp = 0; 
    this.maxHp = maxHp;
  }

  // Keep subtracting and stop when hp reaches 0 
  public void takeDamage(int d)
  {
    if (this.hp > 0)
    {
      this.hp -= d;
    }
    else
    {
      System.out.println("HP has reached 0 cannot substract anymore!");
    }
  }
  
  //Heal full health
  public void heal()
  {
    this.hp = this.maxHp; 
  }

//Accessors 
  public String getName()
  {
    return this.name;
  }
  
  public int getHp() 
  {
    return this.hp; 
  }

  public int getMaxHp() 
  {
    return this.maxHp;
  }
  
  @Override
  public String toString()
  {
    return this.name + " HP: " + this.hp+ "/" + this.maxHp;
  }
}
/**
* The Entity class is an abstract class that consists of all entities in the game. (trainers and different types of pokemon) Deals with health and damage.
* @author Vi Nguyen
*/public abstract class Entity
{
  private String name; 
  private int hp; 
  private int maxHp; 

  //Constructor of the class 
  public Entity(String name, int h, int m)
  {
    this.name = name; 
    this.hp = h; 
    this.maxHp = m;
  }

  /**
  * takeDamage(int d) Keep subtracting and stop when hp reaches 0
  * @param d represents damage taken by an entity
  */ 
  public void takeDamage(int d)
  { 
    if (this.hp >= d)
    {
      this.hp -= d;
    }
    else if (this.hp < d)
    {
      this.hp = 0; 
    }
    else
    {
      System.out.println("HP has reached 0 cannot substract anymore!");
    }
  }
  
  /**
  * heal() heal full health for the entity that call the method 
  */ 
  public void heal()
  {
    this.hp = this.maxHp; 
  }

  /**
  * getName() return name 
  * @return return a String name 
  */ 
  public String getName()
  {
    return this.name;
  }
  /**
  * getHp() return current hp
  * @return return an int which is entity's health  
  */ 
  public int getHp() 
  {
    return this.hp; 
  }
  /**
  * getMaxHp() return maxHp 
  * @return returning int max hp of the entity 
  */ 
  public int getMaxHp() 
  {
    return this.maxHp;
  }
  
  /**
  * toString() returns the name and HP of the entity 
  * @return return the String of the entity 
  */
  @Override
  public String toString()
  {
    return this.name + " HP: " + this.hp+ "/" + this.maxHp;
  }
}
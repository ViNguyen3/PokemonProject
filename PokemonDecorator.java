public abstract class PokemonDecorator extends Pokemon 
{
  private Pokemon pokemon; 

  public PokemonDecorator(Pokemon p, String extraName, int extraHp)
  {
  
  }
  
  //is it the same as the one in the POkemon class 
  public String getAttackMenu(int atkType) {
    System.out.println("\nChoose an attack:");
    String attackMenu = "1. Basic Attack\n2. Special Attack";
    return attackMenu;
  }


  public int getNumAttackMenuItems(int atkType)
  {
      
  }
  
  //copy from Pokemon class 
  public String getAttackString(int atkType, int move)
  {
    String atkString = "";
    switch (move) {
      case 1:
        atkString += "SLAMMED";
        break;
      case 2:
        atkString += "TACKLED";
        break;
      case 3:
        atkString += "PUNCHED";
        break;
      default:
        System.out.println("Invalid entry. Please try again.");
    }
      return atkString;
  }

  public int getAttackDamage(int atkType, int move)
  {
    Random rand = new Random();
    int dmg = 0;

    switch (move) {
      case 1:
        // Slam damages between 0 and 5
        dmg = rand.nextInt(6);
        break;

      case 2:
        // Tackle damages between 2 and 3
        dmg = rand.nextInt(2) + 2;
        break;
        
      case 3:
        // Punch damages between 1 and 4
        dmg = rand.nextInt(4) + 1;
        break;
    }
    return dmg;
  }
  
  public int getAttackMultiplier(Pokemon p, int type)
  {

  }

  public int getAttackBonus(int type)
  {
            
  }
}
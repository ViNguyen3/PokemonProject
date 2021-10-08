import java.util.Random;

public abstract class Pokemon extends Entity {
  
  // Battle Table for elemental advtanges/disadvantages, fire 0, water 1, grass 2
  public static final double [] [] battleTable = {{1, .5, 2}, {2, 1, .5}, {.5, 2, 1}};
  
  public Pokemon(String n) {
    
  }

  public abstract String getSpecialMenu();

  public abstract int getNumSpecialMenuItems();

  public abstract String specialAttack(Pokemon p, int move);
  
  public String getBasicMenu() {
    String basicMenu = "1. Slam\n2. Tackle\n3. Punch";
    return basicMenu;
  }

  public int getNumBasicMenuItems() {
    return 3;
  }

  public String basicAttack(Pokemon p, int move) {
    
    switch (move) {
      case 1:
        return slam(p);
      case 2:
        return tackle(p);
      case 3:
        return punch(p);
    }

  }

  public String getAttackMenu() {
    String attackMenu = "1. Basic Attack\n2.Special Attack";
    return attackMenu;
  }

  public int getNumAttackMenuItems() {
    return 2;
  }

  public String slam(Pokemon p) {
    // Slam damages between 0 and 5
    Random rand = new Random();
    int dmg = rand.nextInt(6);
    p.takeDamage(dmg);

    return p.getName() + " is SLAMMED for " + dmg + " damage!";
    
  } 

  public String tackle(Pokemon p) {
    // Tackle damages between 2 and 3
    Random rand = new Random();
    int dmg = rand.nextInt(2) + 2;
    p.takeDamage(dmg);

    return p.getName() + " is TACKLED for " + dmg + " damage!";

  }

  public String punch(Pokemon p) {
    // Punch damages between 1 and 4
    Random rand = new Random();
    int dmg = rand.nextInt(4) + 1;
    p.takeDamage(dmg);

    return p.getName() + " is PUNCHED for " + dmg + " damage!"; 
  }

  // Fire 0, Water 1, Grass 2
  public int getType() {


  }

}
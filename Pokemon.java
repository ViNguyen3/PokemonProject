import java.util.Random;

public abstract class Pokemon extends Entity {
  
  // Battle Table for elemental advtanges/disadvantages, fire 0, water 1, grass 2
  public static final double [] [] battleTable = {{1, .5, 2}, {2, 1, .5}, {.5, 2, 1}};
  
  // Constructor for pokemon, string n for its name 
  // 25 represents 25 HP that the pokemon will start with
  public Pokemon(String n) {
    super(n, 25);
  }

  public abstract String getSpecialMenu();

  public abstract int getNumSpecialMenuItems();

  public abstract String specialAttack(Pokemon p, int move);
  
  // Basic attack menu
  public String getBasicMenu() {
    String basicMenu = "1. Slam\n2. Tackle\n3. Punch";
    return basicMenu;
  }

  // Number of items in basic attack menu
  public int getNumBasicMenuItems() {
    return 3;
  }

// Basic attacks from menu
  public String basicAttack(Pokemon p, int move) {
    
    switch (move) {
      case 1:
        return slam(p);
      case 2:
        return tackle(p);
      case 3:
        return punch(p);
      default:
        System.out.println("Invalid entry. Please try again.");
    }
      return "";
  }

// Attack type menu
  public String getAttackMenu() {
    String attackMenu = "1. Basic Attack\n2.Special Attack";
    return attackMenu;
  }

// Number of items in attack menu
  public int getNumAttackMenuItems() {
    return 2;
  }

// Basic attack: Slam
  public String slam(Pokemon p) {
    // Slam damages between 0 and 5
    Random rand = new Random();
    int dmg = rand.nextInt(6);
    p.takeDamage(dmg);

    return p.getName() + " is SLAMMED by "+ this.getName() + " damage!";
    
  } 

// Basic attack: Tackle
  public String tackle(Pokemon p) {
    // Tackle damages between 2 and 3
    Random rand = new Random();
    int dmg = rand.nextInt(2) + 2;
    p.takeDamage(dmg);
    
    return p.getName() + " is TACKLED by "+ this.getName() + dmg + " damage!";

  }

// Basic attack: Punch
  public String punch(Pokemon p) {
    // Punch damages between 1 and 4
    Random rand = new Random();
    int dmg = rand.nextInt(4) + 1;
    p.takeDamage(dmg);

    return p.getName() + " is PUNCHED by "+ this.getName() + dmg + " damage!"; 
  }

// Pokemon's type, will be used for battle table
// "Resolved to a type" errors until types are with Pokemon class
  public int getType() {
    int pType = 0;

    if (this instanceof Fire) pType = 0;
    else if (this instanceof  Water) pType = 1;
    else if (this instanceof Grass) pType = 2;

    return pType;
  }

}
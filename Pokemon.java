public abstract class Pokemon {
  
  public static final double [] [] battleTable = {{1, 0.5, 2}, {2, 1, .5}, {.5, 2, 1}};
  
  public Pokemon(String n) {
    
  }

  public abstract String getSpecialMenu();

  public abstract int getNumSpecialMenuItems();

  public abstract String specialAttack(Pokemon p, int move);
  


}
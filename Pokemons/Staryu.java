public class Staryu extends Pokemon implements Water {

  public Staryu (){
    super("Staryu");
  }

  public String getSpecialMenu() {
    return Water.specialMenu;
  }

  public int getNumSpecialMenuItems() {
    
  }

  public String specialAttack(Pokemon p, int move) {
    return "FIXME: Implement this method";
  }

  public String waterGun(Pokemon p) {
    return "FIXME";
  }
  
  public String bubbleBeam(Pokemon p) {
    return "FIXME";
  }

  public String waterfall(Pokemon p) {
    return "FIXME";
  }
  
}
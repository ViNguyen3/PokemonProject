import java.util.Random;
public class Staryu extends Pokemon implements Water {

  public Staryu (){
    super("Staryu");
  }

  //copy from interface 
  public String getSpecialMenu() {
    return Water.specialMenu;
  }
  // copy from interface 
  public int getNumSpecialMenuItems() {
    return 3; 
  }

  public String specialAttack(Pokemon p, int move) {
    switch (move) {
      case 1:
        return waterGun(p);
      case 2:
        return bubbleBeam(p);
      case 3:
        return waterfall(p);
      default:
        System.out.println("Invalid entry. Please try again.");
    }
    return "";
  }
  
  //1-5 dmg 
  public String waterGun(Pokemon p) {
    Random rand = new Random();
    double dmgType = battleTable[this.getType()][p.getType()];
    int dmg = rand.nextInt(5)+1;
    int specialDmg = (int) (dmg * dmgType);
    p.takeDamage(specialDmg);

    return p.getName() + " WaterGun for " + specialDmg + " damage!";
  }
  
  // 1-2 dmg 
  public String bubbleBeam(Pokemon p) {
    Random rand = new Random();
    double dmgType = battleTable[this.getType()][p.getType()];
    int dmg = rand.nextInt(2)+1;
    int specialDmg = (int) (dmg * dmgType);
    p.takeDamage(specialDmg);

    return p.getName() + " BubbleBeam for " + specialDmg + " damage!";
  }

  // 1-4 dmg 
  public String waterfall(Pokemon p) {
    Random rand = new Random();
    double dmgType = battleTable[this.getType()][p.getType()];
    int dmg = rand.nextInt(4)+1;
    int specialDmg = (int) (dmg * dmgType);
    p.takeDamage(specialDmg);

    return p.getName() + " WaterFall for " + specialDmg + " damage!";
  }
  
}
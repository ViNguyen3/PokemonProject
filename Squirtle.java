import java.util.Random;
public class Squirtle extends Pokemon implements Water {

  public Squirtle (){
    super("Squirtle");
  }

  //copy from interface 
  public String getSpecialMenu() {
    return "1. Water Gun\n2. Bubble Beam\n3. Waterfall";
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
  

  //2-5 dmg 
  public String waterGun(Pokemon p) {
    Random rand = new Random();
    double dmgType = battleTable[this.getType()][p.getType()];
    int dmg = rand.nextInt(4)+2;
    int specialDmg = (int) (dmg * dmgType);
    p.takeDamage(specialDmg);

    return p.getName() + " WaterGun for " + specialDmg + " damage!";
  }
  
  //1-3 dmg 
  public String bubbleBeam(Pokemon p) {
    Random rand = new Random();
    double dmgType = battleTable[this.getType()][p.getType()];
    int dmg = rand.nextInt(3)+1;
    int specialDmg = (int) (dmg * dmgType);
    p.takeDamage(specialDmg);

    return p.getName() + " BubbleBeam for " + specialDmg + " damage!";
  }

  //1-4 dmg 
  public String waterfall(Pokemon p) {
    Random rand = new Random();
    double dmgType = battleTable[this.getType()][p.getType()];
    int dmg = rand.nextInt(4)+1;
    int specialDmg = (int) (dmg * dmgType);
    p.takeDamage(specialDmg);

    return p.getName() + " WaterFall for " + specialDmg + " damage!";
  }
  
}
import java.util.Random;
public class Ponyta extends Pokemon implements Fire {

  public Ponyta (){
    super("Ponyta");
  }

  public String getSpecialMenu() {
    String specialMenu = "1. Vine Whip\n2. Razor Leaf\n3. Solar Beam";
    return specialMenu;
  }

  public int getNumSpecialMenuItems() {
    return 3;
  }

  public String specialAttack(Pokemon p, int move) {
     switch (move) {
      case 1:
        return vineWhip(p);
      case 2:
        return razorLeaf(p);
      case 3:
        return solarBeam(p);
      }
  }

  //0-4 dmg 
  public String ember(Pokemon p) {
    Random rand = new Random();
    double dmgType = battleTable[this.getType()][p.getType()];
    int dmg = rand.nextInt(5);
    int specialDmg = (int) (dmg * dmgType);
    p.takeDamage(specialDmg);

    return p.getName() + " Ember for " + specialDmg + " damage!";
  }
  
  //2-5dmg 
  public String fireBlast(Pokemon p) {
    Random rand = new Random();
    double dmgType = battleTable[this.getType()][p.getType()];
    int dmg = rand.nextInt(4)+2;
    int specialDmg = (int) (dmg * dmgType);
    p.takeDamage(specialDmg);

    return p.getName() + " FireBlast for " + specialDmg + " damage!";
  }

  //1-4 dmg 
  public String firePunch(Pokemon p) {
    Random rand = new Random();
    double dmgType = battleTable[this.getType()][p.getType()];
    int dmg = rand.nextInt(4)+1;
    int specialDmg = (int) (dmg * dmgType);
    p.takeDamage(specialDmg);

    return p.getName() + " FirePunch for " + specialDmg + " damage!";
  }
  
}
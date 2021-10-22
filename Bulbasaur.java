import java.util.Random;

public class Bulbasaur extends Pokemon implements Grass {

  public Bulbasaur (){
    super("Bulbasaur");
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
      default:
        System.out.println("Invalid entry. Please try again.");
    }
    return "";  
  }

  public String vineWhip(Pokemon p) {
    // Vine whip damages for 1-3
    Random rand = new Random();
    double dmgType = battleTable[this.getType()][p.getType()];
    int dmg = rand.nextInt(3) + 1;
    int specialDmg = (int) (dmg * dmgType);
    p.takeDamage(specialDmg);

    return this.getName() + "  WHIPS " + p.getName() + " for " + specialDmg + " damage!";
  }
  
  public String razorLeaf(Pokemon p) {
    // Razor leaf damages for 2-4
    Random rand = new Random();
    double dmgType = battleTable[this.getType()][p.getType()];
    int dmg = rand.nextInt(3) + 2;
    int specialDmg = (int) (dmg * dmgType);
    p.takeDamage(specialDmg);

    return this.getName() + " SLICES " + p.getName() + " for " + specialDmg + " damage!";
  }

  public String solarBeam(Pokemon p) {
    // Solar beam by Bulbasaur damages for 0-5
    Random rand = new Random();
    double dmgType = battleTable[this.getType()][p.getType()];
    int dmg = rand.nextInt(6);
    int specialDmg = (int) (dmg * dmgType);
    p.takeDamage(specialDmg);
    System.out.println("_    ___    ___    ___    ___          ");
    System.out.println("_`| / __`| / __`| / __`| / .-^  ___  ");
    System.out.println("---/ /----/ /----/ /----/ /--=^^   ^^=,");
    System.out.println("--/ /----/ /----/ /----/ /---=__   __=' ");
    System.out.println("|._/   |._/   |._/   |._/       ^^^    /n");
    return this.getName() + " kamehameha BEAMS " + p.getName() + " for " + specialDmg + " damage!";

  }

}
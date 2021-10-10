public class Oddish extends Pokemon implements Grass {

  public Oddish (){
    super("Oddish");
  }

  public String getSpecialMenu() {
    return "FIXME: Implement this method";
  }

  public int getNumSpecialMenuItems() {

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

  public String vineWhip(Pokemon p) {
    return "FIXME";
  }

  public String razorLeaf(Pokemon p) {
    return "FIXME";
  }

  public String solarBeam(Pokemon p) {
    return "FIXME";
  }

}
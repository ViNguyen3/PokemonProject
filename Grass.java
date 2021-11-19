/**
* The interface Grass consists of the Grass special attack menu options, the number of Grass special attack menu options, and the three Grass special attacks.
@author Dylan Ros
*/
public interface Grass 
{
  public String specialMenu = "1. Vine Whip\n2. Razor Leaf\n3. Solar Beam";

  public int numSpecialMenuItems = 3;
  
  public String vineWhip(Pokemon p);

  public String razorLeaf(Pokemon p);

  public String solarBeam(Pokemon p); 
}
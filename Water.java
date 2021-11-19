/**
* The interface Water consists of the Water special attack menu options, the number of Water special attack menu options, and the three Water special attacks.
@author Vi Nguyen 
*/
public interface Water {
  public String specialMenu = "1. Water Gun\n2. Bubble Beam\n3. Waterfall";
  
  public String waterGun(Pokemon p);

  public String bubbleBeam(Pokemon p);

  public String waterfall(Pokemon p);
}
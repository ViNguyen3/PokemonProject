import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashMap;
import java.util.Random;
/**
* The PokemonGenerator class contains the PokemonGenerator constructor which reads the pokemonlist.txt with pokemons and their type into a hashmap and methods that handle pokemon generation and randomization for pokemons and buff/debuffs.
* @author Dylan Ros
*/
public class PokemonGenerator {
  private HashMap<String, String> pokemon = new HashMap<>();

  private static PokemonGenerator instance = null;
  /** 
  * PokemonGenerator constructor reads the pokemonlist.txt with pokemons and their type into a hashmap
  */
  private PokemonGenerator() {
    try{
      File pokemonList = new File("PokemonList.txt");
      Scanner fileScan = new Scanner(pokemonList);

      Pattern p = Pattern.compile("(\\w+),(\\w+)");
      
      Matcher match;

      while(fileScan.hasNextLine()) {
        String currentLine = fileScan.nextLine();
        match = p.matcher(currentLine);
        if(match.find()) {
        pokemon.put(match.group(1), match.group(2));
        // System.out.println(match.group(1) + " " + match.group(2));
        }        
      }
      fileScan.close();
  }  
      catch(FileNotFoundException fnf) {
        System.out.println("File was not found.");
      }
    }
  /** 
  * PokemonGenerator getInstance method for the creation or buffing of pokemon
  * @return instance which is a new PokemonGenerator
  */
  public static PokemonGenerator getInstance() {
    if(instance == null) {
      instance = new PokemonGenerator();
    }
    return instance;
  }

  /** 
  * generateRandomPokemon randomly selects pokemon and their type from the hashmap and constructs it along with adding a random buff based on levels greater than 1
  * @param level represents the pokemon level aka map
  * @return generatePokemon, the constructed pokemon along with any buffs
  */
  public Pokemon generateRandomPokemon(int level) {
    Random rand = new Random();
    int listPokemon = rand.nextInt(pokemon.size());
    String[] name = pokemon.keySet().toArray(new String[pokemon.size()]);
    String getName = name[listPokemon];
    Pokemon generatePokemon = getPokemon(getName);

   for(int i = 0; i < level; i++) {
    //  System.out.println("Looping: " + i);
     generatePokemon = addRandomBuff(generatePokemon);
   }
  //  System.out.println("After buff in loop: " + generatePokemon.getName());
   return generatePokemon;
  }

  /** 
  * getPokemon passes in the string with the pokemon's name and constructs the corresponding type
  * @param name represents the type
  * @return newPokemon which is a new 
  */
  public Pokemon getPokemon(String name) {
    Pokemon newPokemon = new Fire(name, 25, 25);

    switch(pokemon.get(name)) {
      case "Fire" :
        newPokemon = new Fire(name, 25, 25);
        break;
      case "Grass" : 
        newPokemon = new Grass(name, 25, 25);
        break;
      case "Water" :
        newPokemon = new Water(name, 25, 25);
        break;
    }
    return newPokemon;
  }

  /** 
  * addRandomBuff randomly selects a buff for the pokemon
  * @param p represents the pokemon
  * @return p1 the pokemon's buff
  */
  public Pokemon addRandomBuff(Pokemon p) {
    Random rand = new Random();
    int res = rand.nextInt(2) + 1;
    //create new buff poke 
    if(res == 1)
    {
      Pokemon p1 = new AttackUp(p);
      p1.getAttackBonus(2);
      return p1;
    }
    else 
    {
      Pokemon p1 = new HpUp(p);
      return p1;
    }
  }

  /** 
  * addRandomDebuff randomly selects a debuff for the pokemon
  * @param p represents the pokemon
  * @return p1 the pokemon's debuff
  */
  public Pokemon addRandomDebuff(Pokemon p) {
    Random rand = new Random();
    int res = rand.nextInt(2) + 1;
    //create new debuff poke 
    if(res == 1)
    {
      Pokemon p1 = new AttackDown(p);
      p1.getAttackBonus(2);
      return p1;
    }
    else 
    {
      Pokemon p1 = new HpDown(p);
      return p1;
    }
  }

  // public static void main(String[] args) throws FileNotFoundException
  // {
  //   PokemonGenerator test = new PokemonGenerator(); 
    
  //   System.out.println(test.getPokemon("Charmander"));

  // }
}


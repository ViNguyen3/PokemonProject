import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashMap;
import java.util.Random;


public class PokemonGenerator {
  private HashMap<String, String> pokemon = new HashMap<>();

  private static PokemonGenerator instance = null;

  private PokemonGenerator() {
    try{
      File pokemonList = new File("PokemonList.txt");
      Scanner fileScan = new Scanner(pokemonList);

      Pattern p = Pattern.compile("(\\w+), (\\w+)");
      
      Matcher match;

      while(fileScan.hasNextLine()) {
        String currentLine = fileScan.nextLine();
        match = p.matcher(currentLine);
        if(match.find()) {
        pokemon.put(match.group(1), match.group(2));
        }        
      }
      fileScan.close();
  }  
      catch(FileNotFoundException fnf) {
        System.out.println("File was not found.");
      }
    }

  public static PokemonGenerator getInstance() {
    if(instance == null) {
      instance = new PokemonGenerator();
    }
    return instance;
  }

  public Pokemon generateRandomPokemon(int level) {
    Random rand = new Random();
    String randPokemon = "";
    int listPokemon = rand.nextInt(pokemon.size());
    int l = 0;

    for(String key : pokemon.keySet()) {
      if(l == listPokemon) {
        randPokemon = key;
      l++;
      }
    }

    Pokemon generatePokemon = getPokemon(randPokemon);

   for(int i = 1; i < level; i++) {
     addRandomBuff(generatePokemon);
   }
    return generatePokemon;
  }

  public Pokemon getPokemon(String name) {
    Pokemon newPokemon = null;
    
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
}
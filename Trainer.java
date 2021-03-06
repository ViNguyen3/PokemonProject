import java.util.ArrayList;
import java.awt.Point;
import java.io.FileNotFoundException;
import java.util.Random;
/**
* The trainer class creates constructors and methods that the other files read while these constructors return either a specific String, variable, or boolean back to the main in order to follow a specific command.
* integer money containes the money the trainer has
* int potions contains the amount of potions the trainer has
* Int pokeballs contains the amount of pokeballs the trainer has
* private point loc contains the current location of the trainer 
* private map reads through the {@link Map}
* pokemon is the arraylist that contains all the pokemon the trainer has collected.
* 
*/
public class Trainer extends Entity{
  private int money;
  private int potions;
  private int pokeballs;
  private Point loc;
  // private Map map;
  private ArrayList<Pokemon> pokemon = new ArrayList<Pokemon>();
  
  /**
  *The trainer method gives the trainer a set hp, a point in the map, and starts of with a fresh set of money, potions and pokeballs.
  */
  public Trainer(String n, Pokemon p){
  // public Trainer(String n, Pokemon p, Map m){
    super(n,30,30);
    // map = m; 
    pokemon.add(p);
    loc = Map.getInstance().findStart();
    // loc = map.findStart();
    money = 25;
    potions = 1;
    pokeballs = 5;
    
  }

 /**
  * Handles the money that the trainer receives
  * @return returns the current amount of money the trainer posesses.
  */
  public int getMoney()
  {
    return money;
  }

   /**
  * spendMoney is a boolean method that checks if the total cash is greater or less than price for item
  * @param amnt is the amount of money said item cost and subtrated from total money.
  * @return boolean based on money being spent
  */
  public boolean spendMoney(int amnt)
  {
    if(money >= amnt){
      money -= amnt;
      return true;
    }
    else{
      return false;
    }
    
    
    
  }

   /**
  * receiveMoney adds a set amount to your current set of money.
  * @param amt is the amount money that is received and added to your total
  */
  public void receiveMoney(int amt)
  {
    money = money+amt;
     
  }
   /**
  * hasPotion() is a boolean method that checks to see if you have potions.
  * @return boolean based on potions in player inventory
  */
  public boolean hasPotion()
  {
    if(potions > 0){
      return true;
    }
    else{
      return false;
    } 
  
  }

   /**
  *receivePotion() adds a potion to your total amount of potions
  */
  public void receivePotion() 
  {
    potions++;
  
  }

   /**
  *usePotion uses a potion on a specified pokemon while the amount of potions is greater than zero.
  *@param pokeIndex is a specific pokemon located in the pokemon arraylist.
  */
  public void usePotion(int pokeIndex)
  { 
    if(potions > 0)
    {
      getPokemon(pokeIndex).heal(); 

      PokemonGenerator pokemonGen = PokemonGenerator.getInstance();
      Pokemon buffPokemon = pokemonGen.addRandomBuff(pokemon.get(pokeIndex - 1));
      pokemon.set(pokeIndex -1, buffPokemon);
      
      // Random rand = new Random();pke
      // int res = rand.nextInt(2) + 1;
      // //create new buff poke 
      // if(res == 1)
      // {
      //   Pokemon p1 = new AttackUp(pokemon.get(pokeIndex));
      //   pokemon.set(pokeIndex,p1);
      // }
      // else 
      // {
      //   Pokemon p1 = new HpUp(pokemon.get(pokeIndex));
      //   pokemon.set(pokeIndex,p1);
      // }
      potions--;
    }
  }
  
   /**
  *Checks to see if the user has a pokeball.
  * @return boolean based on pokeballs in player inventory
  */
  public boolean hasPokeball() 
  {
    if(pokeballs > 0){
      return true;
    }
    else{
      return false;
    }   
    
  }

   /**
  *receivePokeball() increases the amount of pokeballs and adds that to your current amount.
  */
  public void receivePokeball() 
  {
    pokeballs++;
  }

   /**
  *catchPokemon is a method that determines the catchrate of the pokemon and decides whether or not you catch it. It utilizes the random integer variable between 1-100 to help utilze the percent rate for which you catch pokemon.
  *@param p is an outside pokemon that has the potential to be added to the pokemon arraylist if caught.
  *@return method returns true if pokemon is capturable and false if the pokemon isn't.
  */
  public boolean catchPokemon(Pokemon p){
    pokeballs--; 
    Random rand = new Random();
    int upperbound = 100;
    if(pokeballs >= 1){
      int hp = p.getHp();
      int maxHp = p.getMaxHp();
      double avg = (hp/maxHp);
      double trueAvg = Math.round(avg * 100.0) / 100.0;
      double percentage = (1 - trueAvg)*(100);
      int n = rand.nextInt(upperbound);

      if (n <= percentage){
        pokemon.add(p);
        return true;
      }
      else if( n > percentage)
      {
        return false;
      }
    }
    return false;
  } 
  
   /**
  * Point getLocation() reads the trainer current location 
  *@return returns the current trainer location
  */
  public Point getLocation() 
  {
    return loc; 
  }

   /**
  * goNorth() is a method that reads the trainers current location to see if they can go North.
  *@return trainer current location after moving one step north.
  */
  public char goNorth() 
  { 
    if(loc.getX() - 1 < 0){
      System.out.println("Can't go that way!\n");
      return 'a';
    }
    else{
      loc.move((int)loc.getX()-1, (int)loc.getY());
      // System.out.println("Loc: " + loc.toString());
      Map.getInstance().reveal(loc); 
      // map.reveal(loc);
      return Map.getInstance().getCharAtLoc(loc);
      // return map.getCharAtLoc(loc);
    }
  }



  /**
  * goSouth() is a method that reads the trainers current location to see if they can go south.
  *@return trainer current location after moving one step south.
  */
  public char goSouth() 
  {
    if(loc.getX() + 1 >= 5){
       System.out.println("Can't go that way!\n");
       return 'a';
    }
     else{
       loc.move((int)loc.getX()+1, (int)loc.getY());
      //  System.out.println("Loc: " + loc.toString());
       Map.getInstance().reveal(loc); 
       return Map.getInstance().getCharAtLoc(loc);
      // map.reveal(loc); 
      // return map.getCharAtLoc(loc);
     }
  }


  /**
  * goEast() is a method that reads the trainers current location to see if they can go East.
  *@return trainer current location after moving one step east.
  */
  public char goEast() 
  {
    if(loc.getY() + 1 >= 5){
      //  System.out.println("Can't go that way!\n");
       return 'a';
    }
     else{
       loc.move((int)loc.getX(), (int)loc.getY()+1);
      //  System.out.println("Loc: " + loc.toString());
       Map.getInstance().reveal(loc); 
      //  map.reveal(loc);
      //  System.out.println("Go East: " + Map.getInstance().getCharAtLoc(loc));
      //  System.out.println("Go East: " + map.getCharAtLoc(loc)); 
       return Map.getInstance().getCharAtLoc(loc);
      //  return map.getCharAtLoc(loc);
     }
  }


  /**
  * goWest() is a method that reads the trainers current location to see if they can go West.
  *@return trainer current location after moving one step north.
  */
  public char goWest() 
  {
     if(loc.getY() - 1 < 0){
      //  System.out.println("Can't go that way!\n");
       return 'a';
    }
     else{
       loc.move((int)loc.getX(), (int)loc.getY()-1);
       Map.getInstance().reveal(loc); 
       return Map.getInstance().getCharAtLoc(loc);
      //  map.reveal(loc); 
      //  return map.getCharAtLoc(loc);
     }
  }
  

  /**
  * getNumPokemon() is a method that calls the pokemon arraylist.
  *@return the current size of the arraylist.
  */
  public int getNumPokemon(){
    return pokemon.size();
  }


  /**
  * healAllPokemon() is a method that goes through the arraylist and heals every single pokemon within the arraylist.
  */
  public void healAllPokemon()
  {
    for(int i = 0; i < pokemon.size(); i++){
       (pokemon.get(i)).heal();
    }
  }


  /**
  * getPokemon finds a specific pokemon in the pokemon arraylist.
  *@param index is used to be the specfic number in the arraylist where the pokemon is located
  *@return returns said pokemon within index that is called
  */
  public Pokemon getPokemon(int index)
  {
    return this.pokemon.get(index - 1);
  }


  /**
  * getPokemonList() turns the arraylist pokemon into a string.
  *@return returns the string that was the arraylist.
  */
  public String getPokemonList(){
    String p = "";
    for(int i = 0; i < pokemon.size(); i++)
    {
      p += (i+1) + ". " + pokemon.get(i).toString() + "\n";
    }
    return p;
  }


  /**
  *buffAllPokemon creates new buff pokemon with decorators and then replace the old one in the list.
  */
  public void buffAllPokemon()
  { 
    Random rand = new Random();
    int res = rand.nextInt(2) + 1;
    //create new buff poke 
    for(int i = 0; i < pokemon.size(); i++){
      if(res == 1)
      {
        Pokemon p1 = new AttackUp(pokemon.get(i));
        pokemon.set(i,p1);
      }
      else 
      {
        Pokemon p1 = new HpUp(pokemon.get(i));
        pokemon.set(i,p1);
      }
    }
  }

  /**
  *debuffAllPokemon creates new debuff pokemon with decorators and then replace the old one in the list.
  */
  public void debuffPokemon(int index)
  {
    PokemonGenerator pokemonGen = PokemonGenerator.getInstance();
    Pokemon buffPokemon = pokemonGen.addRandomDebuff(pokemon.get(index - 1));
    pokemon.set(index -1, buffPokemon);
  }

  //remove the pokemon from the list 
  public Pokemon removePokemon(int index)
  {
    return pokemon.remove(index);
  }

  /**
  * Convert the integer variables money, pokeballs, and potions; the trainer hp; the map and character location (loc); and the arraylist pokemon and convert it into a string.
  @return returns the formated string where each variable is in a different line in the output.
  */ 
  @Override
  public String toString() 
  {
    String e = "";  
    String a = String.valueOf(money);
    String b = String.valueOf(pokeballs);
    String c = super.toString();
    String d = Map.getInstance().mapToString(loc);
    // String d = map.mapToString(loc);
    String f = String.valueOf(potions);
    for(int i = 0; i < pokemon.size(); i++)
    {
       e += (i+1) + ". " + pokemon.get(i).toString() + "\n";
    }
      return   c + "\n" + "\nInventory:\n-----------\n" + " Money: " + a + "\n" + " Potions: " + f + "\n" + " Pokeball: " + b + "\n" + "\nMap:\n" + d + "\n" + "\nPokemons:\n----------\n" +  e  + " \n ";
  }
}   
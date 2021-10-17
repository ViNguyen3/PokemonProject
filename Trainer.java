import java.util.ArrayList;
import java.awt.Point;

public class Trainer extends Entity{
  private int money;
  private int potions;
  private int pokeballs;
  private Point loc;
  private Map map;
  private ArrayList<Pokemon> pokemon;

  public Trainer(String n, Pokemon p, Map m){
    super(n,100);
    map = m; 
    pokemon.add(p);
    loc = m.findStart();
  }

  public int getMoney()
  {
    return money;
  }

  public boolean spendMoney(int amnt)
  {
    amnt = money--;
    if (money>= amnt){
      return true;
    }
    else{
      return false;
    }
    //decrease money 
    //return True if money >= amt 
    //return False if money < amt 
  }

  public void receiveMoney(int amt)
  {
    money = money++;
    amt = money + money;
    //increase money + amt 
  }

  public boolean hasPotion()
  {
    if(potions > 0){
      return true;
    }
    else{
      return false;
    }
    //return true if potion > 0 
    //return fasle if potion = 0 
  }

  public void receivePotion() 
  {
    potions++;
    //increase potion++ 
  }

  public void usePotion(int pokeIndex)
  {
    Entity.heal(pokemon[pokeIndex]);
    //.heal() the pokemon at the specific index in the list. 
  }
  
  public boolean hasPokeball() 
  {
    if(pokeballs > 0){
      return true;
    }
    else{
      return false;
    }
    //return true if pokeballs > 0 
    //return false if pokeballs = 0 
  }

  public void receivePokeball() 
  {
    pokeballs = pokeballs++;
    //increase pokeballs
    
  }

  //Prof's answer 
  // it should check that the user has a pokeball, and if they do, then get the hp and maxHp of the pokemon, use the hp to calculate the likelyhood of it being caught (there's an example calculation in the project description).  Then randomize to determine whether it was successful, add the pokemon to the user's list of pokemon, and return true if it was successful, false otherwise
  public boolean catchPokemon(Pokemon p){
    
    int hp = p.getHp();
    if(hp <= (hp/2)){
      return true;
    }
    else{
      return false;
    }
  }

  public Point getLocation() 
  {
    return loc; 
  }
    
  public char goNorth() 
  {

    
    
    
    // start = loc[0][0]
    // [0][1]
    // char temp = map.getCharAtLoc([][]])
    // if  temp != null 
    //   return temp
    // else 
    //   Invalid
  }

  public char goSouth() 
  {
    
  }

  public char goEast() 
  {
    
  }

  public char goWest() 
  {

  }
  
  public int getNumPokemon(){
    return pokemon.size();
  }

  public void healAllPokemon()
  {
    for(int i = 0; i < pokemon.size(); i++){
       Entity.heal(i);
    }
    //traverse the list 
    //pokemon in the list.heal() 
  }

  public Pokemon getPokemon(int index)
  {
    return this.pokemon.get(index);
  }

  public string getPokemonList(){
    System.out.println(pokemon);
    String p = "";
    for (String pokemon : pokemons){
      return p+= pokemon+" , ";
    }
  }

  @Override
  public String toString() 
  {
    return System.out.println(money);
    return System.out.println(pokemon);
    return System.out.println(map);
    return System.out.println(pokeballs);
    
  }
}

/*
usePotion() will choose from ArrayList pokemon to choose which pokemon to heal() 
catchPokemon() checks hitpoint if it can be caught, returns true if it’s caught, false otherwise; check for formula in directions
getLocation() returns the location
char goNorth/South/East/West() gets location of where trainer is at, checks to where he would be at after moving, and checks to see if that location is in the array or map, if it’s not in the map then it would return a x and you do not complete that move so leave trainer in his original location and say “You cannot go that way”
getNumPokemon() returns size of arraylist
healAllPokemon() calls heal() on all pokemon 
getPokemonList() builds a toString of ArrayList
toString() should display hitpoints, money, pokeballs, pokemon, and the map
*/


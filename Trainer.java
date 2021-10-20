import java.util.ArrayList;
import java.awt.Point;
import java.io.FileNotFoundException;
import java.util.Random;

public class Trainer extends Entity{
  private int money;
  private int potions;
  private int pokeballs;
  private Point loc;
  private Map map;
  private ArrayList<Pokemon> pokemon = new ArrayList<Pokemon>();
  

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
    if(money >= amnt){
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
    money = money+amt;
    
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
    (pokemon.get(pokeIndex)).heal(); 
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
  //double check later 
  public boolean catchPokemon(Pokemon p){
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

  public Point getLocation() 
  {
    return loc; 
  }

  public char goNorth() 
  { 
    if(loc.getX() - 1 < 0){
      System.out.println("invalid");
      return 'a';
    }
    else{
      loc.move((int)loc.getX()-1, (int)loc.getY());
      // System.out.println("Loc: " + loc.toString());
      map.reveal(loc); 
      return map.getCharAtLoc(loc);
    }
  }

//if any methods return a means invalid 
  public char goSouth() 
  {
    if(loc.getX() + 1 >= 5){
       System.out.println("invalid");
       return 'a';
    }
     else{
       loc.move((int)loc.getX()+1, (int)loc.getY());
      //  System.out.println("Loc: " + loc.toString());
       map.reveal(loc); 
       return map.getCharAtLoc(loc);
     }
  }

  public char goEast() 
  {
    if(loc.getY() + 1 >= 5){
       System.out.println("invalid");
       return 'a';
    }
     else{
       loc.move((int)loc.getX(), (int)loc.getY()+1);
      //  System.out.println("Loc: " + loc.toString());
       map.reveal(loc); 
       return map.getCharAtLoc(loc);
     }
  }

  public char goWest() 
  {
     if(loc.getY() - 1 < 0){
       System.out.println("invalid");
       return 'a';
    }
     else{
       loc.move((int)loc.getX(), (int)loc.getY()-1);
       map.reveal(loc); 
       return map.getCharAtLoc(loc);
     }
  }
  
  public int getNumPokemon(){
    return pokemon.size();
  }

  public void healAllPokemon()
  {
    for(int i = 0; i < pokemon.size(); i++){
       (pokemon.get(i)).heal();
    }
    //traverse the list 
    //pokemon in the list.heal() 
  }

  public Pokemon getPokemon(int index)
  {
    return this.pokemon.get(index);
  }

  public String getPokemonList(){
    System.out.println(pokemon);
    String p = "";
    for(int i = 0; i < pokemon.size(); i++)
    {
      p = p+ pokemon.get(i) + " , ";
    }
    return p;
  }

  @Override
  public String toString() 
  {
    String e = "";  
    String a = String.valueOf(money);
    String b = String.valueOf(pokeballs);
    String c = super.toString();
    String d = map.mapToString(loc);
    for(int i = 0; i < pokemon.size(); i++)
    {
       e += pokemon.get(i).toString();
    }
      return "Trainer HP: "+  c + "\n" + "Money: " + a + "\n" + "Pokeball: " + b + "\n" + d + "\n" + e + "\n";
  }
  
 public static void main(String[] args) throws FileNotFoundException
  {
    Pokemon test2 = new Staryu(); 
    Pokemon test5 = new Bulbasaur();
    Pokemon test6 = new Charmander();
    Pokemon test7 = new Oddish();
    Pokemon test8 = new Squirtle();
    Pokemon test9 = new Ponyta();
    Map test3 = new Map();
    test3.loadMap(2);
    Trainer test4 = new Trainer("test", test9, test3);
    System.out.println(test4.toString());
   
    // for (int i = 0; i < 4; i++)
    // {
    //   test4.goNorth(); 
    //   System.out.println(test4.toString());
    // }
    // for (int i = 0; i < 4; i++)
    // {
    //   test4.goWest(); 
    //   System.out.println(test4.toString());
    // }
    // for (int i = 0; i < 4; i++)
    // {
    //   test4.goSouth(); 
    //   System.out.println(test4.toString());
    // }
    // for (int i = 0; i < 4; i++)
    // {
    //   test4.goEast(); 
    //   System.out.println(test4.toString());
    // }
    // test4.goWest(); 
    // System.out.println(test4.toString());
    //System.out.println(test4.toString());
    //test4.goSouth();
    //System.out.println(test4.toString());
    //test4.goEast();
   // System.out.println(test4.toString());
   
    // Point c = test4.getLocation();
    // System.out.println(c);
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
Ah you just mean any of the Direction methods.String
I thought you meant you did all the others, but could not figure out North.
Well you just need to check if that is a valid "spot to go to" then if it is, change the location the player goes to. Once that happens, you getCharAtLocation() and return that char.
I don't know how you guys handle "cannot go that way", the way I did is by returning the null character '\0'.
*/
// public static void main(String[] args)
// {
//   Random rand = new Random();
//   for(int i = 0; i < 5; i++ )
//   {
//      int test = rand.nextInt(75); 
//     System.out.print("Result: " + test); 
//   }
// } 

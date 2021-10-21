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
* @author Angel Rubio
*/
public class Trainer extends Entity{
  private int money;
  private int potions;
  private int pokeballs;
  private Point loc;
  private Map map;
  private ArrayList<Pokemon> pokemon = new ArrayList<Pokemon>();
  
  /**
  *The trainer method gives the trainer a set hp, a point in the map, and starts of with a fresh set of money, potions and pokeballs.
  */
  public Trainer(String n, Pokemon p, Map m){
    super(n,30);
    map = m; 
    pokemon.add(p);
    loc = m.findStart();
    money = 25;
    potions = 1;
    pokeballs = 5;
    
  }

   /**
  * getMoney() returns the current amount of money the trainer posesses.
  */
  public int getMoney()
  {
    return money;
  }

   /**
  *spendMoney(int amnt) is a boolean method that returns true if your current money is greater than amount owed and false if it is the exact opposite.
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
    //decrease money 
    //return True if money >= amt 
    //return False if money < amt 
  }

   /**
  *receiveMoney(int amt) adds a set amount to your current set of money.
  */
  public void receiveMoney(int amt)
  {
    money = money+amt;
    
    //increase money + amt 
  }
   /**
  * hasPotion() is a boolean method that returns true if you have a potion and false if you don't.
  */
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

   /**
  *receivePotion() adds a potion to your total amount of potions
  */
  public void receivePotion() 
  {
    potions++;
    //increase potion++ 
  }

   /**
  *usePotion uses a potion on a specified pokemon while the amount of potions is greater than zero.
  */
  public void usePotion(int pokeIndex)
  { 
    if(potions > 0)
    {
      getPokemon(pokeIndex).heal(); 
      potions--;
    }
    //.heal() the pokemon at the specific index in the list. 
  }
  
   /**
  *Checks to see if the user has a pokeball. Returns true if trainer has at least one pokemon, returns false if it is zero.
  */
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

   /**
  *receivePokeball() increases the amount of pokeballs and adds that to your current amount.
  */
  public void receivePokeball() 
  {
    pokeballs++;
    //increase pokeballs
    
  }

  //Prof's answer 
  // it should check that the user has a pokeball, and if they do, then get the hp and maxHp of the pokemon, use the hp to calculate the likelyhood of it being caught (there's an example calculation in the project description).  Then randomize to determine whether it was successful, add the pokemon to the user's list of pokemon, and return true if it was successful, false otherwise
  //double check later 

   /**
  *catchPokemon is a method that determines the catchrate of the pokemon and decides whether or not you catch it. It utilizes the random integer variable between 1-100 to help utilze the percent rate for which you catch pokemon. The higher the pokemon's hp is the less of the chance you have to catch it. Same is true for the other end of the spectrum. The boolean then returns true if the random number runs through the percent range and false if it isn't in the percent range
  */
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
      //System.out.println("Can't go that way!\n");
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
      //  System.out.println("Can't go that way!\n");
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
      //  System.out.println("Can't go that way!\n");
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
      //  System.out.println("Can't go that way!\n");
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
    return this.pokemon.get(index - 1);
  }

  public String getPokemonList(){
    String p = "";
    for(int i = 0; i < pokemon.size(); i++)
    {
      p += (i+1) + ". " + pokemon.get(i).toString();
    }
    return p;
  }

  //put potion later 
  @Override
  public String toString() 
  {
    String e = "";  
    String a = String.valueOf(money);
    String b = String.valueOf(pokeballs);
    String c = super.toString();
    String d = map.mapToString(loc);
    String f = String.valueOf(potions);
    for(int i = 0; i < pokemon.size(); i++)
    {
       e += (i+1) + ". " + pokemon.get(i).toString() + "\n";
    }
      return   c + "\n" + "Money: " + a + "\n" + "Potions: " + f + "\n" + "Pokeball: " + b + "\n" + d + "\n" +  e  + " \n ";
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

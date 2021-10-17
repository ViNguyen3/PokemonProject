class Main {
  public static void main(String[] args)
  {
    
  }

  //display menu for item in the store, gets users' input,//checks that the user has enough money, spends the //money and gets the item if they do, otherwise //notifies the user that they don't have enough. 
  public static void store(Trainer t)
  {
    int val = 0;
    do{
      System.out.println("1. Buy Potion - $5\n2. Buy Poke Balls - $3\n3. Exit"); 
      val = CheckInput.getIntRange(1,3); 
      if (val == 1 & t.getMoney() >= 5)
      {
        System.out.println("Here's your potion");
        t.spendMoney(3);
        t.receivePotion();
      }
      else if (val == 2 & t.getMoney() >= 3) 
      {
        System.out.println("Here's your Pokeball");
        t.spendMoney(5);
        t.receivePokeball();
      }
      else
      {
        System.out.println("You are broke go make some money and come back later!");
      }
    }while(val != 3);
  }

  //generate randomly from 1 to 6 and choose from the wild pokemon
  public static Pokemon chooseRandoPokemon()
  {

  }

}
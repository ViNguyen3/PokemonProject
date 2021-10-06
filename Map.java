import java.io.*;
import java.util.Scanner; 
import java.io.FileNotFoundException;
class Map 
{
  // char[][] map;
  // boolean[][] revealed;
  

  public static void main(String[] args) throws FileNotFoundException
  {
    char[][] map = new char[5][5];
    boolean[][] revealed = new boolean[5][5];
    Scanner in = new Scanner(new File("Area3.txt"));
    int counter = 0;
    int i = 0,j = 0;
    while (in.hasNextLine())
    {
      String currentLine = in.nextLine();
      //loop go through current line 
      for(int z = 0; z < currentLine.length(); z++)
      { 
        if(Character.isLetter(currentLine.charAt(z)))
        {
          map[j][i] = currentLine.charAt(z);
          revealed[j][i] = false; 
          i++;
        }
        //   System.out.println(map[i][j]);
        //   map[j][i] = currentLine.charAt(z);
        //   i++;
        if(i == 5)
        {
          j++; 
          i = 0;
        }
      }
    }
    in.close();

    for (int a = 0; a < map.length; a++)
    {
      for(int b = 0; b < map[a].length; b++)
      {
        System.out.print(" " + map[a][b]);
      }
      System.out.println();
    }

    System.out.println(); 
    
    for (int a = 0; a < revealed.length; a++)
    {
      for(int b = 0; b < revealed[a].length; b++)
      {
        System.out.print(" " + revealed[a][b]);
      }
      System.out.println();
    }


    // String test = "He Llo"; 
    // System.out.println(test.length()); 
    // for(int i = 0; i < test.length()-1;i++)
    // {
    //   System.out.println(test.charAt(i));
    // }
  }
}
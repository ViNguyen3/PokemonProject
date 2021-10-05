import java.io.*;
import java.util.Scanner; 
import java.io.FileNotFoundException;
class Map 
{
  // char[][] map;
  // boolean[][] revealed;
  
  // read from file - Done 
  public static void main(String[] args) throws FileNotFoundException
  {
    char[][] map = new char[5][];
    Scanner in = new Scanner(new File("Area3.txt"));
    int counter = 0;
    int i = 0,j = 0;
    while (in.hasNextLine())
    {
      String currentLine = in.nextLine();
      //loop go through current line 
      for(int z = 0; z < currentLine.length()-1; z++)
      { 
        i = 0;
        if(Character.isLetter(currentLine.charAt(z)))
        {
          System.out.println(map[i][j]);
          map[j][i] = currentLine.charAt(z);
          i++;
        }
        j++;
      }
    }
    in.close();

    // for (int a = 0; i < map.length-1; i++)
    // {
    //   for(int b = 0; b < map[a].length; b++)
    //   {
    //     System.out.print(map[a][b]);
    //   }
    // }

    // String test = "He Llo"; 
    // System.out.println(test.length()); 
    // for(int i = 0; i < test.length()-1;i++)
    // {
    //   System.out.println(test.charAt(i));
    // }
  }
}
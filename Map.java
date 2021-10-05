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
    String[][] map = new String[5][];
    Scanner in = new Scanner(new File("Area3.txt"));
    int counter = 0;
    int i = 0,j = 0;
    while (in.hasNextLine())
    {
      String currentLine = in.next();
      System.out.print(currentLine);
    }
    in.close();

  }
}
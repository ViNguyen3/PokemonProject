import java.io.*;
import java.util.Scanner; 
import java.io.FileNotFoundException;
class Map
{
  private char[][] map; 
  private boolean[][] revealed;

  //constructor iniltalize the revealed array to all False 
  public Map() 
  {
    this.revealed = new boolean[5][5];
    this.map = new char[5][5];
    for( int i = 0; i < revealed.length; i++ ) {
     for( int j = 0; j < revealed[0].length; j++ ) {
        revealed[i][j] = false;
       }
     }
  }

  //this method read file and put it into the array map
  public void loadMap(int mapNum) throws FileNotFoundException
  {
    String mapName = "Area" + mapNum + ".txt"; 
    Scanner in = new Scanner(new File(mapName)); 
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
          i++;
        }
        if(i == 5)
        {
          j++; 
          i = 0;
        }
      }
    }
    in.close();
  }
  
  public char getCharAtLoc(Point p)
  {

  }

  public String mapToString()
  {
    for (int a = 0; a < this.map.length; a++)
    {
      for(int b = 0; b < this.map[a].length; b++)
      {
        return " " + this.map[a][b];
      }
      return "\n";
    }
  }

  public Point findStart()
  {
    
  }

  public void reveal(Point p)
  {

  }

  public removeCharAtLoc(Point p)
  {
    
  }
} 
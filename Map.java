import java.io.*;
import java.awt.Point; 
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
  
  //return the character on the map by the given index of the point
  public char getCharAtLoc(Point p)
  { 
    char re = map[(int)p.getX()][(int)p.getY()]; 
    return re ;
  }

  //Test the mapRe on seperate file to see if it works 
  //uses boolean to hide or display - Have not done yet 
  //Put Trainer's position as * - have not done yet 
  public String mapToString()
  {
    String mapRe = ""; 
    for (int a = 0; a < this.map.length; a++)
    {
      for(int b = 0; b < this.map[a].length; b++)
      {
        mapRe += this.map[a][b]; 
      }
      mapRe += "\n"; 
    }
    return mapRe;  
  }

  //loop through the array and find s which will be the starting point 
  public Point findStart()
  {
    Point startPoint = new Point(0,0);
    for (int a = 0; a < this.map.length; a++)
    {
      for(int b = 0; b < this.map[a].length; b++)
      {
        if(this.map[a][b] == ('s'))
        {
          startPoint.setLocation(a, b);  
          return startPoint;
        }
      }
    }
    return startPoint; 
  }

  //changes the value of an element in the boolean array to True accordingly to the given point and then the toString should reveal it.  
  public void reveal(Point p)
  {
    revealed[(int)p.getX()][(int)p.getY()] = true; 
  }

  //remove i, w, p at given p by setting it equal to "" 
  public void removeCharAtLoc(Point p)
  {
    //since char does not take '' have to go around like this 
    String emptyStr = " "; 
    map[(int)p.getX()][(int)p.getY()] = emptyStr.charAt(0); 
  }
} 
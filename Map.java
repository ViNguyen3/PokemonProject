/**
* The Map class read file, checking boolean value, returning underlinning character as well as how the map should be printed out to the main. 
*char[][] map is an array containning characters that were read from a file 
*boolean[][] revealed is a backing array keeping track of boolean value of each character.
* @author Vi Nguyen 
*/
import java.io.*;
import java.awt.Point; 
import java.util.Scanner; 
import java.io.FileNotFoundException;
class Map
{ 
  private char[][] map; 
  private boolean[][] revealed;
  private static Map instance = null;

  /**
  * Default constructor - iniltalize the revealed array to all False 
  */
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

  public static Map getInstance()
  {
    return instance;
  }

  /**
  * Read file and put it into the array map as well as reset the boolean array when load next map.
  * @param mapNum set the number of the map to read 
  */
  public void loadMap(int mapNum) throws FileNotFoundException
  {
    String mapName = "Area" + mapNum + ".txt"; 
    Scanner in = new Scanner(new File(mapName)); 
    int i = 0,j = 0;
    //this loop is to read file 
    while (in.hasNextLine())
    {
      String currentLine = in.nextLine();
      //loop go through current line and set boolean value 
      for(int z = 0; z < currentLine.length(); z++)
      { 
        if(Character.isLetter(currentLine.charAt(z)))
        {
          map[j][i] = currentLine.charAt(z); 
          revealed[j][i] = false;
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
  

  /**
  * Return the character on the map by the given index of the point
  * @param p takes in location which is index of the element in the array
  * @return return the character in the Array at the specifed index
  */
  public char getCharAtLoc(Point p)
  { 
    char re = map[(int)p.getX()][(int)p.getY()];
    // revealed[(int)p.getX()][(int)p.getY()] = true; 
    return re ;
  }
  

  /**
  * Put Trainer's position as * accordingly to the Point p as well as checking the boolean value to either display chracter or x 
  * @param p takes in to the player location
  * @return return the String map 
  */
  public String mapToString(Point p)
  {
    this.reveal(p); 
    String mapRe = ""; 
    for (int a = 0; a < this.map.length; a++)
    {
      for(int b = 0; b < this.map[a].length; b++)
      {
        //check boolean value, if False show x if true show the word 
        if(this.revealed[a][b] == false)
        {
          mapRe = mapRe + " " + "x"; 
        }
        else
        {
          if (a == (int)p.getX() & b == (int)p.getY())
          {
            mapRe = mapRe + " " + "*"; 
          }
          else
          {
            mapRe = mapRe + " " + this.map[a][b]; 
          }
        }
      }
      mapRe += "\n"; 
    }
    return mapRe;  
  }

  /**
  * Loop through the array and find character s which will be the starting point
  * @return return Point object which is the location of the starting point  
  */
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

 
  /**
  * Changes the value of an element in the boolean array to True accordingly to the given point and then the toString should reveal it.  
  * @param p is the location (indexes) in the array
  */
  public void reveal(Point p)
  {
    revealed[(int)p.getX()][(int)p.getY()] = true; 
  }

 
  /**
  * Remove i, w, p at given p by setting it equal to 'n'
  * @param p is the location (indexes) in the array
  */
  public void removeCharAtLoc(Point p)
  {
    map[(int)p.getX()][(int)p.getY()] = 'n'; 
  }
}

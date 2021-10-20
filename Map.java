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
    // revealed[(int)p.getX()][(int)p.getY()] = true; 
    return re ;
  }


  //Put Trainer's position as * accordingly to the Point p
  public String mapToString(Point p)
  {
    // this.reveal(this.findStart()); 
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
    map[(int)p.getX()][(int)p.getY()] = 'n'; 
  }


  //Testing purposes only 
  // public static void main(String[] args) throws FileNotFoundException
  // {
    // Point startPoint = new Point(0,0);
    // Point startPoint2 = new Point(2,4);
    // Point startPoint3 = new Point(3,2);
    // Map testObj = new Map(); 
    // testObj.loadMap(3);
    // System.out.println();
    // System.out.println();
    // System.out.println(testObj.findStart());
    // testObj.reveal(startPoint);
    // testObj.reveal(startPoint2);
    // testObj.reveal(startPoint3);
    // System.out.print(testObj.mapToString(testObj.findStart()));
    // testObj.loadMap(2);
    // System.out.print(testObj.mapToString());
    // System.out.println();
    // System.out.println();

  
    

    // testObj.reveal(startPoint);
    // testObj.reveal(startPoint2);
    // testObj.reveal(startPoint3);
    // System.out.print(testObj.mapToString());
  // }
} 
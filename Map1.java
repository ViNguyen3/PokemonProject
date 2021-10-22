import java.io.*;
import java.util.Scanner; 
import java.io.FileNotFoundException;
//This class is for testing purposes only 
class Map1 
{
  // char[][] map;
  // boolean[][] revealed;
  
  

  public static void main(String[] args) throws FileNotFoundException
  {
    // char[][] map = new char[5][5];
    // boolean[][] revealed = new boolean[5][5];
    // Scanner in = new Scanner(new File("Area3.txt"));
    // int i = 0,j = 0;
    // while (in.hasNextLine())
    // {
    //   String currentLine = in.nextLine();
    //   //loop go through current line 
    //   for(int z = 0; z < currentLine.length(); z++)
    //   { 
    //     if(Character.isLetter(currentLine.charAt(z)))
    //     {
    //       map[j][i] = currentLine.charAt(z);
    //       // revealed[j][i] = false; 
    //       i++;
    //     }
    //     //   System.out.println(map[i][j]);
    //     //   map[j][i] = currentLine.charAt(z);
    //     //   i++;
    //     if(i == 5)
    //     {
    //       j++; 
    //       i = 0;
    //     }
    //   }
    // }
    // in.close();

    // for (int a = 0; a < map.length; a++)
    // {
    //   for(int b = 0; b < map[a].length; b++)
    //   {
    //     System.out.print(" " + map[a][b]);
    //   }
    //   System.out.println();
    // }

    // System.out.println(); 
    
    // for( int c = 0; c < revealed.length; c++ ) {
    //  for( int d = 0; d < revealed[0].length; d++ ) {
    //     revealed[c][d] = false;
    //    }
    //  }
    
    // for (int a = 0; a < revealed.length; a++)
    // {
    //   for(int b = 0; b < revealed[a].length; b++)
    //   {
    //     System.out.print(" " + revealed[a][b]);
    //   }
    //   System.out.println();
    // }
    // System.out.println("      _.-^^---....,,--     ");
    // System.out.println("  _--                  --_ ");
    // System.out.println("<                        >)");
    // System.out.println("|                         | ");
    // System.out.println("  |._                   _./  ");
    // System.out.println("    ```--. . , ; .--'''    ");
    // System.out.println("         | |   |       ");
    // System.out.println("      .-=||  | |=-.   ");
    // System.out.println("      `-=#$%&%$#=-'   ");
    // System.out.println("         | ;  :|    ");
    // System.out.println("_____.,-#%&$@%#&#~,._____");
    // System.out.println("");

    // System.out.println("           ⢀⣠⣤⣴⣶⣶⣶⣶⣶⠶⣶⣤⣤⣀⠀⠀⠀  ");
    // System.out.println("       ⢀⣤⣾⣿⣿⣿⠁⠀⢀⠈⢿⢀⣀⠀⠹⣿⣿⣿⣦⣄");
    // System.out.println("      ⣴⣿⣿⣿⣿⣿⠿⠀⠀⣟⡇⢘⣾⣽⠀⠀⡏⠉⠙⢛⣿⣷⡖⠀");
    // System.out.println("     ⣾⣿⣿⡿⠿⠷⠶⠤⠙⠒⠀⠒⢻⣿⣿⡷⠋⠀⠴⠞⠋⠁⢙⣿⣄");
    // System.out.println("    ⢸⣿⣿⣯⣤⣤⣤⣤⣤⡄⠀⠀⠀⠀⠉⢹⡄⠀⠀⠀⠛⠛⠋⠉⠹⡇ ");
    // System.out.println("    ⢸⣿⣿⠀⠀⠀⣀⣠⣤⣤⣤⣤⣤⣤⣤⣼⣇⣀⣀⣀⣛⣛⣒⣲⢾⡷ ");
    // System.out.println("⢀⠤⠒⠒⢼⣿⣿⠶⠞⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠁⠀⣼⠃ ");
    // System.out.println("⢮⠀⠀⠀⠀⣿⣿⣆⠀⠀⠻⣿⡿⠛⠉⠉⠁⠀⠉⠉⠛⠿⣿⣿⠟⠁⠀⣼⠃⠀  ");
    // System.out.println("⠈⠓⠶⣶⣾⣿⣿⣿⣧⡀⠀⠈⠒⢤⣀⣀⡀⠀⠀⣀⣀⡠⠚⠁⠀⢀⡼⠃⠀⠀");
    // System.out.println("    ⠈⢿⣿⣿⣿⣿⣿⣷⣤⣤⣤⣤⣭⣭⣭⣭⣭⣥⣤⣤⣤⣴⣟⠁");
    // System.out.println("_____.,-#%&$@%#&#~,._____");
    // System.out.println("_    ___    ___    ___    ___          ");
    // System.out.println("_`| / __`| / __`| / __`| / .-^  ___  ");
    // System.out.println("---/ /----/ /----/ /----/ /--=^^   ^^=,");
    // System.out.println("--/ /----/ /----/ /----/ /---=__   __=' ");
    // System.out.println("|._/   |._/   |._/   |._/       ^^^    ");
    
    
    

    // System.out.println("                                 ,");
    // System.out.println("                           ,   ,'|");
    // System.out.println("                         ,/|.-'   \\.");
    // System.out.println("                        .-'  '       |.");
    // System.out.println("                  ,  .-'              |");
    // System.out.println("               /|,'                 |'");
    // System.out.println("              / '                    |  ,");
    // System.out.println("             /                       ,'/");
    // System.out.println("          .  |          _              /");
    // System.out.println("          \\`' .-.    ,' `.           |");
    // System.out.println("          \\ /   \\ /      \\          /");
    // System.out.println("          \\|    V        |        |  ,");
    // System.out.println("            (           ) /.--.   ''\"/");
    // System.out.println("             \"b.`. ,' _.ee'' 6)|   ,-'");
    // System.out.println("              \"= --\"\"  )   ' /.-'");
    // System.out.println("               \\ / `---\"   .\"|\'");
    // System.out.println("                \\\"..-    .'  |.");
    // System.out.println("                  `-__..-','   |");
    // System.out.println("               __.) ' .-'/    /\\._");
    // System.out.println("        _.--'/----..--------. _.-\"\"-._");
    // System.out.println("    .-'_)   \\.   /     __..-'     _.-'--.");
    // System.out.println("    / -'/      \"\"\"\"\"\"\"\"\"         ,'-.   . `.");
    // System.out.println("   | ' /                        /    `   `. \\");
    // System.out.println("   |   |                        |         | |");
    // System.out.println("    \\ .'\\                       |     \\     |");
    // System.out.println("   / '  | ,'               . -  \\`.    |  / /");
    // System.out.println("  / /   | |                      `/\"--. -' /\\");
    // System.out.println("  | |     \\ \\                     /     \\     |");
    // System.out.println("  | \\      | \\                 .-|      |    |");



    // System.out.println("                                           ░░▒▒░░░░░░       ");
    // System.out.println("                                         ░░░░░░░░░░░░░░▒▒░░ ");
    // System.out.println("                                       ░░▒▒░░░░░░░░░░░░▒▒▓▓░░▒▒  ");
    // System.out.println("                                     ░░░░▒▒░░░░░░░░    ░░▒▒▓▓░░▒▒");
    // System.out.println("                                     ░░░░░░▒▒░░░░░░░░  ░░▒▒▓▓░░▒▒ ");
    // System.out.println("                                     ▒▒▒▒░░░░░░░░░░░░░░░░░░▓▓▒▒░░░░ ");
    // System.out.println("                                     ░░▒▒░░  ░░░░▒▒░░░░░░▒▒▓▓▒▒▒▒░░ ");
    // System.out.println("   ░░                                ░░▒▒▒▒▒▒    ▓▓▒▒▒▒░░░░▓▓▒▒▒▒░░          ");
    // System.out.println(" ░░░░░░  ░░                          ░░▓▓░░        ░░▒▒░░▒▒░░▒▒░░░░     ");
    // System.out.println(" ░░░░░░░░  ░░░░                        ▓▓░░  ░░    ░░▒▒▒▒▒▒  ▒▒░░░░  ");
    // System.out.println("    ░░░░░░░░░░      ░░                  ▒▒▒▒        ▒▒▓▓░░    ▒▒░░░░   ");
    // System.out.println("            ░░░░░░      ░░░░    ░░░░  ▒▒▒▒▒▒▓▓░░░░░░▓▓        ▒▒▒▒░░░░  ");
    // System.out.println("                ░░░░░░░          ▒▒    ░░░░▒▒░░░░░░░░▒▒░░░░  ▒▒▒▒░░▒▒    ");
    // System.out.println("                    ░░░░░░░░░░░░▒▒  ░░░░░░░░░░░░░░          ░░▒▒░░▒▒");
    // System.out.println("                              ▒▒▓▓░░░░░░░░░░░░░░░░          ░░▒▒░░░░");
    // System.out.println("                                ▒▒▒▒░░░░    ░░░░░░▒▒░░  ░░░░░░▒▒░░░░░░");
    // System.out.println("                            ░░▒▒▒▒▒▒▓▓▒▒  ░░░░    ▒▒░░░░░░░░▒▒░░░░░░ ");
    // System.out.println("                            ▒▒▒▒▒▒▒▒░░▓▓▒▒░░      ▒▒░░░░░░░░▒▒░░░░▒▒");
    // System.out.println("                          ░░▒▒▒▒▒▒▒▒░░░░▓▓      ░░░░░░░░░░░░▒▒░░▒▒▒▒");
    // System.out.println("                          ▒▒▒▒▒▒▒▒▒▒░░░░      ░░░░        ░░▒▒░░▒▒▒▒");
    // System.out.println("                      ░░░░▒▒▒▒▒▒░░      ▒▒░░░░  ░░      ░░▒▒░░▒▒▒▒ ");
    //    System.out.println("                   ▒▒░░▒▒▒▒░░    ░░▒▒▒▒░░    ░░      ░░▒▒▒▒▒▒░░");
    // System.out.println("                      ▒▒▒▒▒▒    ░░░░  ░░▓▓▒▒    ░░      ▒▒▒▒▒▒▒▒░░");
    // System.out.println("                    ░░░░      ░░░░  ░░░░░░▒▒            ▒▒▒▒▒▒▒▒░░");
    //    System.out.println("                 ░░░░  ▒▒▓▓░░░░░░░░░░  ▒▒            ▒▒▒▒▒▒▒▒░░");
    // System.out.println("                    ▒▒░░▒▒▒▒▓▓    ░░░░    ░░      ░░    ▒▒▒▒▒▒░░░░");
    // System.out.println("                    ░░▒▒▒▒▒▒▓▓    ░░░░                  ▓▓▒▒▒▒░░▒▒");
    //    System.out.println("               ░░▒▒▒▒▒▒▒▒▒▒░░░░░░                ░░  ▒▒▒▒▒▒  ▒▒");
    // System.out.println("                  ░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░        ░░░░▒▒░░░░▒▒▒▒▒▒  ░░ ");
    // System.out.println("                  ▒▒▒▒▒▒▒▒▒▒▒▒████████████████████████▒▒▒▒▒▒░░  ░░");
    //     System.out.println("            ░░▒▒▒▒▓▓▒▒▓▓████████████████████▓▓██▓▓▓▓▒▒▒▒  ░░");
    // System.out.println("                ▒▒▒▒▓▓▒▒▒▒▓▓▓▓██▓▓████▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▒▒  ░░");
    // System.out.println("                ▒▒▒▒▓▓▒▒▓▓██▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▒▒  ▒▒");
    //    System.out.println("             ▒▒▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒  ▒▒ ");
    // System.out.println("                ▒▒▒▒░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██  ░░  ");
    // System.out.println("                ▓▓▒▒  ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░ ");
    //    System.out.println("           ░░▓▓▒▒░░▓▓▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▓▓  ▒▒");
    // System.out.println("              ░░▓▓░░▒▒▓▓░░  ░░░░░░░░▒▒▒▒░░░░▒▒░░░░░░░░░░▒▒  ░░");
    // System.out.println("              ░░▓▓░░▓▓▒▒    ░░░░░░░░░░        ░░░░░░░░░░░░░░ ");
    //    System.out.println("           ░░▒▒  ▓▓▒▒    ░░░░░░░░░░        ░░░░░░░░░░  ░░");
    // System.out.println("              ░░▒▒░░▓▓▒▒  ░░░░░░░░░░          ░░░░░░    ░░");
    // System.out.println("              ░░▒▒░░▒▒░░  ░░░░░░░░░░          ░░░░      ░░ ");
    //     System.out.println("            ▒▒  ▒▒    ░░░░░░░░░░            ░░");
    // System.out.println("                ▒▒░░▒▒    ░░░░░░░░              ░░");
    //    System.out.println("             ▒▒░░▒▒    ░░░░░░░░              ░░");
    // System.out.println("                ░░░░░░    ░░░░░░░░              ░░░░ ");
    // System.out.println("                  ░░░░    ░░  ░░░░              ░░░░");
    //     System.out.println("              ░░      ░░  ░░                ▒▒░░    ░░");
    // System.out.println("                  ░░    ░░░░░░░░                ░░░░    ░░");
    //    System.out.println("                     ░░░░░░░░                ░░░░░░░░");
    // System.out.println("                        ░░░░░░░░                ░░  ░░░░  ░░");
    // System.out.println("                        ░░░░░░░░                ░░  ░░░░");
    //     System.out.println("                  ░░░░░░  ░░                    ░░░░");
    // System.out.println("                      ▒▒░░  ░░░░                    ░░░░    ░░");
    //    System.out.println("                   ▓▓██████                        ▒▒▒▒██▓▓");
    // System.out.println("                      ██████▒▒                        ▓▓████▓▓");
    // System.out.println("                      ██████░░                        ░░██████");
    //        System.out.println("               ██████                            ██████  ");
    // System.out.println("                    ░░████▓▓                            ▓▓████ ");
    // System.out.println("                    ░░████░░                            ▒▒████░░ ");
    //        System.out.println("             ▒▒████                                ████▓▓");
    // System.out.println("                    ████▓▓                                ██████  ");
    // System.out.println("                    ▓▓▓▓▓▓                                ▓▓██▓▓░░");
    // System.out.println("                  ▒▒▓▓▓▓▒▒░░░░                            ▒▒▓▓▓▓░░    ");
    // System.out.println("                      ▓▓▒▒░░░░░░                          ░░▒▒▒▒▒▒ ");
    // System.out.println("                ▓▓░░░░▓▓▓▓░░░░                            ▓▓▒▒░░▓▓");
    // System.out.println("                ▒▒▒▒▒▒▓▓██▒▒  ░░░░░░░░░░░░░░░░░░░░░░        ▓▓▒▒▒▒▓▓   ");
    // System.out.println("                ██▓▓▓▓▓▓▓▓                            ░░░░▒▒▓▓▓▓▓▓██");
    System.out.println("");
    
    
  }
}
// // // import java.io.*;
// // // import java.util.Scanner; 
// // // import java.io.FileNotFoundException;
// // // //This class is for testing purposes only 
// class Map1 
// {
// //   // char[][] map;
// //   // boolean[][] revealed;
  
  

//   public static void main(String[] args) 
//   {
// // //     // char[][] map = new char[5][5];
// // //     // boolean[][] revealed = new boolean[5][5];
// // //     // Scanner in = new Scanner(new File("Area3.txt"));
// // //     // int i = 0,j = 0;
// // //     // while (in.hasNextLine())
// // //     // {
// // //     //   String currentLine = in.nextLine();
// // //     //   //loop go through current line 
// // //     //   for(int z = 0; z < currentLine.length(); z++)
// // //     //   { 
// // //     //     if(Character.isLetter(currentLine.charAt(z)))
// // //     //     {
// // //     //       map[j][i] = currentLine.charAt(z);
// // //     //       // revealed[j][i] = false; 
// // //     //       i++;
// // //     //     }
// // //     //     //   System.out.println(map[i][j]);
// // //     //     //   map[j][i] = currentLine.charAt(z);
// // //     //     //   i++;
// // //     //     if(i == 5)
// // //     //     {
// // //     //       j++; 
// // //     //       i = 0;
// // //     //     }
// // //     //   }
// // //     // }
// // //     // in.close();

// // //     // for (int a = 0; a < map.length; a++)
// // //     // {
// // //     //   for(int b = 0; b < map[a].length; b++)
// // //     //   {
// // //     //     System.out.print(" " + map[a][b]);
// // //     //   }
// // //     //   System.out.println();
// // //     // }

// // //     // System.out.println(); 
    
// // //     // for( int c = 0; c < revealed.length; c++ ) {
// // //     //  for( int d = 0; d < revealed[0].length; d++ ) {
// // //     //     revealed[c][d] = false;
// // //     //    }
// // //     //  }
    
// // //     // for (int a = 0; a < revealed.length; a++)
// // //     // {
// // //     //   for(int b = 0; b < revealed[a].length; b++)
// // //     //   {
// // //     //     System.out.print(" " + revealed[a][b]);
// // //     //   }
// // //     //   System.out.println();
// // //     // }
// // //     // System.out.println("      _.-^^---....,,--     ");
// // //     // System.out.println("  _--                  --_ ");
// // //     // System.out.println("<                        >)");
// // //     // System.out.println("|                         | ");
// // //     // System.out.println("  |._                   _./  ");
// // //     // System.out.println("    ```--. . , ; .--'''    ");
// // //     // System.out.println("         | |   |       ");
// // //     // System.out.println("      .-=||  | |=-.   ");
// // //     // System.out.println("      `-=#$%&%$#=-'   ");
// // //     // System.out.println("         | ;  :|    ");
// // //     // System.out.println("_____.,-#%&$@%#&#~,._____");
// // //     // System.out.println("");

// // //     // System.out.println("           ⢀⣠⣤⣴⣶⣶⣶⣶⣶⠶⣶⣤⣤⣀⠀⠀⠀  ");
// // //     // System.out.println("       ⢀⣤⣾⣿⣿⣿⠁⠀⢀⠈⢿⢀⣀⠀⠹⣿⣿⣿⣦⣄");
// // //     // System.out.println("      ⣴⣿⣿⣿⣿⣿⠿⠀⠀⣟⡇⢘⣾⣽⠀⠀⡏⠉⠙⢛⣿⣷⡖⠀");
// // //     // System.out.println("     ⣾⣿⣿⡿⠿⠷⠶⠤⠙⠒⠀⠒⢻⣿⣿⡷⠋⠀⠴⠞⠋⠁⢙⣿⣄");
// // //     // System.out.println("    ⢸⣿⣿⣯⣤⣤⣤⣤⣤⡄⠀⠀⠀⠀⠉⢹⡄⠀⠀⠀⠛⠛⠋⠉⠹⡇ ");
// // //     // System.out.println("    ⢸⣿⣿⠀⠀⠀⣀⣠⣤⣤⣤⣤⣤⣤⣤⣼⣇⣀⣀⣀⣛⣛⣒⣲⢾⡷ ");
// // //     // System.out.println("⢀⠤⠒⠒⢼⣿⣿⠶⠞⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠁⠀⣼⠃ ");
// // //     // System.out.println("⢮⠀⠀⠀⠀⣿⣿⣆⠀⠀⠻⣿⡿⠛⠉⠉⠁⠀⠉⠉⠛⠿⣿⣿⠟⠁⠀⣼⠃⠀  ");
// // //     // System.out.println("⠈⠓⠶⣶⣾⣿⣿⣿⣧⡀⠀⠈⠒⢤⣀⣀⡀⠀⠀⣀⣀⡠⠚⠁⠀⢀⡼⠃⠀⠀");
// // //     // System.out.println("    ⠈⢿⣿⣿⣿⣿⣿⣷⣤⣤⣤⣤⣭⣭⣭⣭⣭⣥⣤⣤⣤⣴⣟⠁");
// // //     // System.out.println("_____.,-#%&$@%#&#~,._____");
// // //     // System.out.println("_    ___    ___    ___    ___          ");
// // //     // System.out.println("_`| / __`| / __`| / __`| / .-^  ___  ");
// // //     // System.out.println("---/ /----/ /----/ /----/ /--=^^   ^^=,");
// // //     // System.out.println("--/ /----/ /----/ /----/ /---=__   __=' ");
// // //     // System.out.println("|._/   |._/   |._/   |._/       ^^^    ");
    
    
    

// // //     // System.out.println("                                 ,");
// // //     // System.out.println("                           ,   ,'|");
// // //     // System.out.println("                         ,/|.-'   \\.");
// // //     // System.out.println("                        .-'  '       |.");
// // //     // System.out.println("                  ,  .-'              |");
// // //     // System.out.println("               /|,'                 |'");
// // //     // System.out.println("              / '                    |  ,");
// // //     // System.out.println("             /                       ,'/");
// // //     // System.out.println("          .  |          _              /");
// // //     // System.out.println("          \\`' .-.    ,' `.           |");
// // //     // System.out.println("          \\ /   \\ /      \\          /");
// // //     // System.out.println("          \\|    V        |        |  ,");
// // //     // System.out.println("            (           ) /.--.   ''\"/");
// // //     // System.out.println("             \"b.`. ,' _.ee'' 6)|   ,-'");
// // //     // System.out.println("              \"= --\"\"  )   ' /.-'");
// // //     // System.out.println("               \\ / `---\"   .\"|\'");
// // //     // System.out.println("                \\\"..-    .'  |.");
// // //     // System.out.println("                  `-__..-','   |");
// // //     // System.out.println("               __.) ' .-'/    /\\._");
// // //     // System.out.println("        _.--'/----..--------. _.-\"\"-._");
// // //     // System.out.println("    .-'_)   \\.   /     __..-'     _.-'--.");
// // //     // System.out.println("    / -'/      \"\"\"\"\"\"\"\"\"         ,'-.   . `.");
// // //     // System.out.println("   | ' /                        /    `   `. \\");
// // //     // System.out.println("   |   |                        |         | |");
// // //     // System.out.println("    \\ .'\\                       |     \\     |");
// // //     // System.out.println("   / '  | ,'               . -  \\`.    |  / /");
// // //     // System.out.println("  / /   | |                      `/\"--. -' /\\");
// // //     // System.out.println("  | |     \\ \\                     /     \\     |");
// // //     // System.out.println("  | \\      | \\                 .-|      |    |");



// // //     // System.out.println("                                           ░░▒▒░░░░░░       ");
// // //     // System.out.println("                                         ░░░░░░░░░░░░░░▒▒░░ ");
// // //     // System.out.println("                                       ░░▒▒░░░░░░░░░░░░▒▒▓▓░░▒▒  ");
// // //     // System.out.println("                                     ░░░░▒▒░░░░░░░░    ░░▒▒▓▓░░▒▒");
// // //     // System.out.println("                                     ░░░░░░▒▒░░░░░░░░  ░░▒▒▓▓░░▒▒ ");
// // //     // System.out.println("                                     ▒▒▒▒░░░░░░░░░░░░░░░░░░▓▓▒▒░░░░ ");
// // //     // System.out.println("                                     ░░▒▒░░  ░░░░▒▒░░░░░░▒▒▓▓▒▒▒▒░░ ");
// // //     // System.out.println("   ░░                                ░░▒▒▒▒▒▒    ▓▓▒▒▒▒░░░░▓▓▒▒▒▒░░          ");
// // //     // System.out.println(" ░░░░░░  ░░                          ░░▓▓░░        ░░▒▒░░▒▒░░▒▒░░░░     ");
// // //     // System.out.println(" ░░░░░░░░  ░░░░                        ▓▓░░  ░░    ░░▒▒▒▒▒▒  ▒▒░░░░  ");
// // //     // System.out.println("    ░░░░░░░░░░      ░░                  ▒▒▒▒        ▒▒▓▓░░    ▒▒░░░░   ");
// // //     // System.out.println("            ░░░░░░      ░░░░    ░░░░  ▒▒▒▒▒▒▓▓░░░░░░▓▓        ▒▒▒▒░░░░  ");
// // //     // System.out.println("                ░░░░░░░          ▒▒    ░░░░▒▒░░░░░░░░▒▒░░░░  ▒▒▒▒░░▒▒    ");
// // //     // System.out.println("                    ░░░░░░░░░░░░▒▒  ░░░░░░░░░░░░░░          ░░▒▒░░▒▒");
// // //     // System.out.println("                              ▒▒▓▓░░░░░░░░░░░░░░░░          ░░▒▒░░░░");
// // //     // System.out.println("                                ▒▒▒▒░░░░    ░░░░░░▒▒░░  ░░░░░░▒▒░░░░░░");
// // //     // System.out.println("                            ░░▒▒▒▒▒▒▓▓▒▒  ░░░░    ▒▒░░░░░░░░▒▒░░░░░░ ");
// // //     // System.out.println("                            ▒▒▒▒▒▒▒▒░░▓▓▒▒░░      ▒▒░░░░░░░░▒▒░░░░▒▒");
// // //     // System.out.println("                          ░░▒▒▒▒▒▒▒▒░░░░▓▓      ░░░░░░░░░░░░▒▒░░▒▒▒▒");
// // //     // System.out.println("                          ▒▒▒▒▒▒▒▒▒▒░░░░      ░░░░        ░░▒▒░░▒▒▒▒");
// // //     // System.out.println("                      ░░░░▒▒▒▒▒▒░░      ▒▒░░░░  ░░      ░░▒▒░░▒▒▒▒ ");
// // //     //    System.out.println("                   ▒▒░░▒▒▒▒░░    ░░▒▒▒▒░░    ░░      ░░▒▒▒▒▒▒░░");
// // //     // System.out.println("                      ▒▒▒▒▒▒    ░░░░  ░░▓▓▒▒    ░░      ▒▒▒▒▒▒▒▒░░");
// // //     // System.out.println("                    ░░░░      ░░░░  ░░░░░░▒▒            ▒▒▒▒▒▒▒▒░░");
// // //     //    System.out.println("                 ░░░░  ▒▒▓▓░░░░░░░░░░  ▒▒            ▒▒▒▒▒▒▒▒░░");
// // //     // System.out.println("                    ▒▒░░▒▒▒▒▓▓    ░░░░    ░░      ░░    ▒▒▒▒▒▒░░░░");
// // //     // System.out.println("                    ░░▒▒▒▒▒▒▓▓    ░░░░                  ▓▓▒▒▒▒░░▒▒");
// // //     //    System.out.println("               ░░▒▒▒▒▒▒▒▒▒▒░░░░░░                ░░  ▒▒▒▒▒▒  ▒▒");
// // //     // System.out.println("                  ░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░        ░░░░▒▒░░░░▒▒▒▒▒▒  ░░ ");
// // //     // System.out.println("                  ▒▒▒▒▒▒▒▒▒▒▒▒████████████████████████▒▒▒▒▒▒░░  ░░");
// // //     //     System.out.println("            ░░▒▒▒▒▓▓▒▒▓▓████████████████████▓▓██▓▓▓▓▒▒▒▒  ░░");
// // //     // System.out.println("                ▒▒▒▒▓▓▒▒▒▒▓▓▓▓██▓▓████▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▒▒  ░░");
// // //     // System.out.println("                ▒▒▒▒▓▓▒▒▓▓██▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▒▒  ▒▒");
// // //     //    System.out.println("             ▒▒▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒  ▒▒ ");
// // //     // System.out.println("                ▒▒▒▒░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██  ░░  ");
// // //     // System.out.println("                ▓▓▒▒  ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░ ");
// // //     //    System.out.println("           ░░▓▓▒▒░░▓▓▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▓▓  ▒▒");
// // //     // System.out.println("              ░░▓▓░░▒▒▓▓░░  ░░░░░░░░▒▒▒▒░░░░▒▒░░░░░░░░░░▒▒  ░░");
// // //     // System.out.println("              ░░▓▓░░▓▓▒▒    ░░░░░░░░░░        ░░░░░░░░░░░░░░ ");
// // //     //    System.out.println("           ░░▒▒  ▓▓▒▒    ░░░░░░░░░░        ░░░░░░░░░░  ░░");
// // //     // System.out.println("              ░░▒▒░░▓▓▒▒  ░░░░░░░░░░          ░░░░░░    ░░");
// // //     // System.out.println("              ░░▒▒░░▒▒░░  ░░░░░░░░░░          ░░░░      ░░ ");
// // //     //     System.out.println("            ▒▒  ▒▒    ░░░░░░░░░░            ░░");
// // //     // System.out.println("                ▒▒░░▒▒    ░░░░░░░░              ░░");
// // //     //    System.out.println("             ▒▒░░▒▒    ░░░░░░░░              ░░");
// // //     // System.out.println("                ░░░░░░    ░░░░░░░░              ░░░░ ");
// // //     // System.out.println("                  ░░░░    ░░  ░░░░              ░░░░");
// // //     //     System.out.println("              ░░      ░░  ░░                ▒▒░░    ░░");
// // //     // System.out.println("                  ░░    ░░░░░░░░                ░░░░    ░░");
// // //     //    System.out.println("                     ░░░░░░░░                ░░░░░░░░");
// // //     // System.out.println("                        ░░░░░░░░                ░░  ░░░░  ░░");
// // //     // System.out.println("                        ░░░░░░░░                ░░  ░░░░");
// // //     //     System.out.println("                  ░░░░░░  ░░                    ░░░░");
// // //     // System.out.println("                      ▒▒░░  ░░░░                    ░░░░    ░░");
// // //     //    System.out.println("                   ▓▓██████                        ▒▒▒▒██▓▓");
// // //     // System.out.println("                      ██████▒▒                        ▓▓████▓▓");
// // //     // System.out.println("                      ██████░░                        ░░██████");
// // //     //        System.out.println("               ██████                            ██████  ");
// // //     // System.out.println("                    ░░████▓▓                            ▓▓████ ");
// // //     // System.out.println("                    ░░████░░                            ▒▒████░░ ");
// // //     //        System.out.println("             ▒▒████                                ████▓▓");
// // //     // System.out.println("                    ████▓▓                                ██████  ");
// // //     // System.out.println("                    ▓▓▓▓▓▓                                ▓▓██▓▓░░");
// // //     // System.out.println("                  ▒▒▓▓▓▓▒▒░░░░                            ▒▒▓▓▓▓░░    ");
// // //     // System.out.println("                      ▓▓▒▒░░░░░░                          ░░▒▒▒▒▒▒ ");
// // //     // System.out.println("                ▓▓░░░░▓▓▓▓░░░░                            ▓▓▒▒░░▓▓");
// // //     // System.out.println("                ▒▒▒▒▒▒▓▓██▒▒  ░░░░░░░░░░░░░░░░░░░░░░        ▓▓▒▒▒▒▓▓   ");
// // //     // System.out.println("                ██▓▓▓▓▓▓▓▓                            ░░░░▒▒▓▓▓▓▓▓██");
// // //     // System.out.println("");
    
// //     // System.out.println("|_,-_-___-_,_,_,_,__, ,--, /: :\\/': :`\\/: :\\ __,__,__,_,-_-___-_,___.|"); 
// //     // System.out.println("|{    (    (    (    |`;  ' `,'   `.;    `: |{(    )   )   (    (    |"); 
// //     // System.out.println("|-;      )     ,-,   |    |     |  '  |     |.-,  ,.  /;      )     ,|"); 
// //     // System.out.println("| ;   ;;    /\\/   \\/\\| :  |     |  :  |     ||  \\/  \\/ ;   ;;    /\\/ |"); 
// //     // System.out.println("|  |  ;`,  ,  `      | :. |  :  |  :  |  :  | \\         |  ;`,  ,  ` |"); 
// //     // System.out.println("|  ; |  | |    ,  ,,  \\__/: :.. : :.. | :.. |  )   ,    ; |  | |     |"); 
// //     // System.out.println("|  ; ;  `,'   / \\/  \\      `---',\\___/,\\___/ /' , / \\   ; ;  `,'     |"); 
// //     // System.out.println("|   |;   |  ,'  ;\\   ',         `==._ .. . /'  / \\  ;\\   |;   |      |"); 
// //     // System.out.println("|   ||     /    ;;)  ;;\\             `-::-'   /  ;) ;;\\ ||          |"); 
// //     // System.out.println("----------------------------------------------------------------------"); 
// //     // System.out.println(); 
// //     // System.out.println(); 
// //     // System.out.println(); 
// //     // System.out.println(); 
// //     // System.out.println(); 
// //     // System.out.println(); 
// //     // System.out.println(); 
// //     // System.out.println(); 
// //     // System.out.println(); 
// //     // System.out.println(); 
// //     // System.out.println(); 
// //     // System.out.println(); 
    
// //     // System.out.println(" 　　　　　　　　　　　　　　＿　 　 ＿＿ 　_,..　-―-    "); 
// //     // System.out.println("　　　　　　　　　　　　__<＞''"´　　　　　 ｀^''＜⌒丶 ＼"); 
// //     // System.out.println("　　　　　　　　　　　〈／ 　 ／　　　　　　　　　 ＼ 　 ＼丶  "); 
// //     // System.out.println("　　　　　　　　　 ／7ﾞ /　/　　　　　 　 　 　 　 　 ヽ　　∨"); 
// //     // System.out.println("　　　　　　　 　 _〉:∧│　　　　 | :　　　　　|:　　　|ハ"); 
// //     // System.out.println("　　 　 　 　 　 〈: 7 : : |　|　 　 : | : :　| : : 　| : : .　j:　i"); 
// //     // System.out.println("　　　　　　　　　〉| : ヽ|　|│:ィ:/|⌒:/ﾄ : : |ィ7ト: /: :│"); 
// //     // System.out.println("　　 　 　 　 　 〈八＼_|　|人ィ灯圷ﾐ/ｲ : ﾘィ灯Y}.: : :|　　"); 
// //     // System.out.println("　　　　　　　　　｀{: :〈│: 　 |　Vツ　　|／　ﾋｿ /:.|/|/　　　 "); 
// //     // System.out.println("　　　　　　　　　　｀ｰｯ| :　　| 　 　 　 　 　 〉　 {: :|"); 
// //     // System.out.println("　　　　　　 　 　 　 /:::| :　 │　　　　　　　　　八:|"); 
// //     // System.out.println(" 　　　　　 　 　 　 /:::/| :　　|＼　　 　 ﾉ‐ 　 ｲ: : :|"); 
// //     // System.out.println("　　　　　　　　　　＼{∧: : : |　　　　.,,_/〉イ|/| : : |"); 
// //     // System.out.println("　　　　　　 　 　 　 厶ｨﾍ: Ν≧=‐<_,´}′ 　 | ∧|"); 
// //     // System.out.println("　 　 　 　 　 　 _／⌒＾ ∧|　 　 __/7 ｛≧=､_l厶_　 　,,.｡;;::,."); 
// //     // System.out.println("　　　 　 　 '´￣｀>､　　 　 ＼／::// /〈:＼　Υ ハ,;;::ﾟ::..　　ﾞ:;,,"); 
// //     // System.out.println("　　　　　　|　　　ﾞ⌒＼　　　〈::rく/　{　{ﾊ:::〉　V　;斗-冖冖ｰ‐(ヽ"); 
// //     // System.out.println("　　　　　　|　　＼　　　∨　　｀｝　 　 　 ﾉ´　　} 〈　　　　 　 ⊂ﾆﾉ"); 
// //     // System.out.println("　　　　　 │　　　ヽ 　　∨　　{　　　　∧　　　∨＼　　　　 ⊂/"); 


// //             // System.out.println(" 　　　　　　　　　     ＿　 　 ＿＿ 　_,..　-―-    "); 
// //             // System.out.println("　　　　　　　　　　__<＞''\"´　　　　　 ｀^''＜⌒丶 ＼"); 
// //             // System.out.println("　　　　　　　　　〈／ 　 ／　　　　　　　　　 ＼ 　 ＼丶  "); 
// //             // System.out.println("　　　　　　　　 ／7ﾞ /　/　　　　　 　 　 　 　 　 ヽ　　∨"); 
// //             // System.out.println("　　　　　　 　 _〉:∧│　　　　 | :　　　　　|:　　　|ハ"); 
// //             // System.out.println("　　 　  　 　〈: 7 : : |　|　 　 : | : :　| : : 　| : : .　j:　i"); 
// //             // System.out.println("　　　　　　　　 〉| : ヽ|　|│:ィ:/|⌒:/ﾄ : : |ィ7ト: /: :│"); 
// //             // System.out.println("　 　 　 　 　〈八＼_|　|人ィ灯圷ﾐ/ｲ : ﾘィ灯Y}.: : :|　　"); 
// //             // System.out.println("　　　　　　　　｀{: :〈│: 　 |　Vツ　　|／　ﾋｿ /:.|/|/　　　 "); 
// //             // System.out.println("　　　　　　　　  ｀ｰｯ| :　　| 　 　 　 　 　 〉　 {: :|"); 
// //             // System.out.println("　　　　　 　 　 　/:::| :　 │　　　　　　　　　八:|"); 
// //             // System.out.println(" 　　　　 　 　 　/:::/| :　　|＼　　 　 ﾉ‐ 　 ｲ: : :|"); 
// //             // System.out.println("　　　　　　　　　＼{∧: : : |　　　　.,,_/〉イ|/| : : |"); 
// //             // System.out.println("　　　　　 　 　 　 厶ｨﾍ: Ν≧=‐<_,´}′ 　 | ∧|"); 
// //             // System.out.println("　 　 　 　　 　 _／⌒＾ ∧|　 　 __/7 ｛≧=､_l厶_　 　,,.｡;;::,."); 
// //             // System.out.println("　　　 　 　'´￣｀>､　　 　 ＼／::// /〈:＼　Υ ハ,;;::ﾟ::..　　ﾞ:;,,"); 
// //             // System.out.println("　　　　　 |　　　ﾞ⌒＼　　　〈::rく/　{　{ﾊ:::〉　V　;斗-冖冖ｰ‐(ヽ"); 
// //             // System.out.println("　　　　　 |　　＼　　　∨　　｀｝　 　 　 ﾉ´　　} 〈　　　　 　 ⊂ﾆﾉ"); 
// //             // System.out.println("　　　　　 │　　　ヽ 　　∨　　{　　　　∧　　　∨＼　　　　 ⊂/"); 



// // System.out.println("                                        /  ");
// // System.out.println("                        _,.------....___,.' ',.-.");
// // System.out.println("                     ,-'          _,.--\"        |");
// // System.out.println("                   ,'         _.-'              .");
// // System.out.println("                  /   ,     ,'                   `");
// // System.out.println("                 .   /     /                     ``.");
// // System.out.println("                 |  |     .                       \\.\\");
// // System.out.println("       ____      |___._.  |       __               \\ `.");
// // System.out.println("     .'    `---\"\"       ``\"-.--\"'`  \\               .  \\");
// // System.out.println("    .  ,            __               `              |   .");
// // System.out.println("    `,'         ,-\"'  .               \\             |    L");
// // System.out.println("   ,'          '    _.'                -._          /    |");
// // System.out.println("  ,`-.    ,\".   `--'                      >.      ,'     |");
// // System.out.println(" . .'\\'   `-'       __    ,  ,-.         /  `.__.-      ,'");
// // System.out.println(" ||:, .           ,'  ;  /  / \\ `        `.    .      .'/");
// // System.out.println(" j|:D  \\          `--'  ' ,'_  . .         `.__, \\   , /");
// // System.out.println("/ L:_  |                 .  \"' :_;                `.'.'");
// // System.out.println(".    \"\"'                  \"\"\"\"\"'                    V");
// // System.out.println(" `.                                 .    `.   _,..  `");
// // System.out.println("   `,_   .    .                _,-'/    .. `,'   __  `");
// // System.out.println("    ) \\`._        ___....----\"'  ,'   .'  \\ |   '  \\  .");
// // System.out.println("   /   `. \"`-.--\"'         _,' ,'     `---' |    `./  |");
// // System.out.println("  .   _  `\"\"'--.._____..--\"   ,             '         |");
// // System.out.println("  | .\" `. `-.                /-.           /          ,");
// // System.out.println("  | `._.'    `,_            ;  /         ,'          .");
// // System.out.println(" .'          /| `-.        . ,'         ,           ,");
// // System.out.println(" '-.__ __ _,','    '`-..___;-...__   ,.'\\ ____.___.'");
// // System.out.println(" `\"^--'..'   '-`-^-'\"--    `-^-'`.''\"\"\"\"\"`.,^.`.--'");


// // System.out.println("               _,........__");
// // System.out.println("            ,-'            \"`-.");
// // System.out.println("          ,'                   `-.");
// // System.out.println("        ,'                        \\");
// // System.out.println("      ,'                           .");
// // System.out.println("      .'\\               ,\"\".       `");
// // System.out.println("     ._.'|             / |  `       \\");
// // System.out.println("     |   |            `-.'  ||       `.");
// // System.out.println("     |   |            '-._,'||       | \\");
// // System.out.println("     .`.,'             `..,'.'       , |`-.");
// // System.out.println("     l                       .'`.  _/  |   `.");
// // System.out.println("     `-.._'-   ,          _ _'   -\" \\  .     `");
// // System.out.println("`.\"\"\"\"\"'-.`-...,---------','         `. `....__.");
// // System.out.println(".'        `\"-..___      __,'\\          \\  \\     \\");
// // System.out.println("\\_ .          |   `\"\"\"\"'    `.           . \\     \\");
// // System.out.println("  `.          |              `.          |  .     L");
// // System.out.println("    `.        |`--...________.'.        j   |     |");
// // System.out.println("      `._    .'      |          `.     .|   ,     |");
// // System.out.println("         `--,\\       .            `7\"\"' |  ,      |");
// // System.out.println("            ` `      `            /     |  |      |    _,-'\"\"\"`-.");
// // System.out.println("             \\ `.     .          /      |  '      |  ,'          `.");
// // System.out.println("             \\  v.__  .        '       .   \\    /| /              \\");
// // System.out.println("               \\/    `\"\"\\\"\"\"\"\"\"\"`.       \\   \\  /.''                |");
// // System.out.println("                `        .        `._ ___,j.  `/ .-       ,---.     |");
// // System.out.println("                ,`-.      \\         .\"     `.  |/        j     `    |");
// // System.out.println("               /    `.     \\       /         \\ /         |     /    j");
// // System.out.println("              |       `-.   7-.._ .          |\"          '         /");
// // System.out.println("              |          `./_    `|          |            .     _,'");
// // System.out.println("              `.           / `----|          |-............`---'");
// // System.out.println("                \\          \\      |          |");
// // System.out.println("               ,'           )     `.         |");
// // System.out.println("                7____,,..--'      /          |");
// // System.out.println("                                  `---.__,--.'");


// // System.out.println("              _.--\"\"`-..");
// // System.out.println("            ,'          `.");
// // System.out.println("          ,'          __  `.");
// // System.out.println("         /|          \" __  \\");
// // System.out.println("        , |           / |.   .");
// // System.out.println("        |,'          !_.'|   |");
// // System.out.println("      ,'             '   |   |");
// // System.out.println("     /              |`--'|   |");
// // System.out.println("    |                `---'   |");
// // System.out.println("     .   ,                   |                       ,\".");
// // System.out.println("      ._     '           _'  |                    , ' \\ `");
// // System.out.println("  `.. `.`-...___,...---\"\"    |       __,.        ,`\"   L,|");
// // System.out.println("  |, `- .`._        _,-,.'   .  __.-'-. /        .   ,    \\");
// // System.out.println("-:..     `. `-..--_.,.<       `\"      / `.        `-/ |   .");
// // System.out.println("  `,         \"\"\"\"'     `.              ,'         |   |  ',,");
// // System.out.println("    `.      '            '            /          '    |'. |/");
// // System.out.println("      `.   |              \\       _,-'           |       ''");
// // System.out.println("        `._'               \\   '\"\\                .      |");
// // System.out.println("           |                '     \\                `._  ,'");
// // System.out.println("           |                 '     \\                 .'|");
// // System.out.println("           |                 .      \\                | |");
// // System.out.println("           |                 |       L              ,' |");
// // System.out.println("           `                 |       |             /   '");
// // System.out.println("            \\                |       |           ,'   /");
// // System.out.println("          ,' \\               |  _.._ ,-..___,..-'    ,'");
// // System.out.println("         /     .             .      `!             ,j'");
// // System.out.println("        /       `.          /        .           .'/");
// // System.out.println("       .          `.       /         |        _.'.'");
// // System.out.println("        `.          7`'---'          |------\"'_.'");
// // System.out.println("       _,.`,_     _'                ,''-----\"'");
// // System.out.println("   _,-_    '       `.     .'      ,\\");
// // System.out.println("   -\" /`.         _,'     | _  _  _.|");
// // System.out.println("    \"\"--'---\"\"\"\"\"'        `' '! |! /");
// // System.out.println("                            `\" \" -'");   
//   }
// }
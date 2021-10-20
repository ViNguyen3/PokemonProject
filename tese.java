import java.util.Scanner; 
class tese
{
  public static void main(String[] args)
  {
    Scanner test = new Scanner(System.in); 
    System.out.println("Enter: ");
    int n = test.nextInt(); 
    int i = 0;
    do
    {
      System.out.println("Enter: ");
      n = test.nextInt();
      if(n == 3)
      {
        System.out.println("Nothing");
        break;
      }
      System.out.println("i: " + i);
      i++; 
    }while(n != 3);
  }
}
import java.util.Scanner;

class Even_or_odd
{
  public static void main(String args[])
  {
    
    System.out.println("Enter an Integer number:");

    Scanner rasesh= new Scanner(System.in);
    int num =rasesh.nextInt();

    if ( num % 2 == 0 )
        System.out.println("Entered number is even");
     else
        System.out.println("Entered number is odd");
  }
}
import java.util.Scanner;
class Fibonacci_s
 {
  public static void main(String[] args)
  {
	   System.out.println("enter a number");
      Scanner scan= new Scanner(System.in);
	  int n=scan.nextInt();
      int  firstTerm = 0, secondTerm = 1;
    System.out.println("Fibonacci Series till " + n + " terms:");

    for (int i=1; i<=n;++i) 
	{
      System.out.print(firstTerm + ", ");

      
      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
    }
  }
}
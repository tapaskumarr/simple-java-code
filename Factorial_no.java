import java.util.Scanner;
class Factorial_no
{
   public static void main(String args[])
   {	
   System.out.println("enter a number");
   Scanner scan= new Scanner(System.in);
   int a=scan.nextInt();
   int fact=1,i;
   for(i=1;i<=a;i++)
   {
   fact=fact*i;
   }
   
   System.out.println("factorial of "+a+" is "+fact);
   }
   }
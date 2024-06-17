import java.util.Scanner;
class Largest_among_3no
{
   public static void main(String args[])
   {	
   System.out.println("enter 3 number");
   Scanner scan= new Scanner(System.in);
   int a=scan.nextInt();
   int b=scan.nextInt();
   int c=scan.nextInt();  
   if(a>b)
   {
    if(a>c)
	  { 
	   System.out.println(a+" is gretest number");
	  } 
   }
   else if(b>a)
   {
	   if(b>c)
	   {
	   System.out.println(b+"  is gretest number");
	   }
   }
   
	   System.out.println(c+"  is gretest number");
   }
   }
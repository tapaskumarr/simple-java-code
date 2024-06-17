import java.util.Scanner;
class Prime_or_not
{
   public static void main(String args[])
   {		
	
	
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter any number:");
	
	int num=scan.nextInt();
	int temp=0;
        
	for(int i=2;i<=num/2;i++)
	{
	   if(num%i==0)
	   {
	     temp=temp+i;
	   }
	}
	
	if(temp==0)
	   System.out.println(num + " is a Prime Number");
	else
	   System.out.println(num + " is not a Prime Number");
   }
}
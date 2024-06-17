/*4. Java Program To Check Leap Year Or Not*/
import java.util.Scanner;
class Leapyr
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System. out. print("Enter any year:");
		int a=sc.nextInt();
		if(a%4==0)
		{
			System.out.println(a+"is a leap year");
		}
		else
		{
			System.out.println(a+"is not a leap year");
		}
	}
}

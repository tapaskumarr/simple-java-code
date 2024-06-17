import java.util.Scanner;
class Average
{
   public static void main(String args[])
   {	
  int n;
  double res=0;
  
   Scanner scan= new Scanner(System.in);
   
    System.out.println("enter how many numbers to cal avg");
    n=scan.nextInt();
   int a[]=new int[n];
    System.out.println("enter "+n+"numbers");
   for(int i=0;i<n;i++){
   a[i]=scan.nextInt();}
   for(int i=0;i<n;i++){
   res=res+a[i];}
    System.out.println("avg="+res/n);

   
   
   }
   }
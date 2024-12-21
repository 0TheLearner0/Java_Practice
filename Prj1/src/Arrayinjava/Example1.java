package Arrayinjava;
import java.util.Scanner;
public class Example1 {
  public static void main(String x[])
  {
	  int i,n;
	  Scanner obj=new Scanner(System.in);
	  System.out.println("Enter Term");
	  n=obj.nextInt();
	  int ar[]=new int[n];
	  for(i=0;i<n;i++)
	  {
		  System.out.println("Enter Num");
		  ar[i]=obj.nextInt(); 
	  }
	  System.out.println("Display The Number");
	  for(i=0;i<n;i++)
	  {
		  System.out.println(ar[i]);
	  }
  }
}

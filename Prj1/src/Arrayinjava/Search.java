package Arrayinjava;
import java.util.Scanner;
public class Search {
  public static void main(String x[])
  {
	  int n,i,m=0;
	  Scanner obj=new Scanner(System.in);
	  System.out.println("Enter Term");
	  n=obj.nextInt();
	  int ar[]=new int[n];
	  for(i=0;i<n;i++)
	  {
		  System.out.println("Enter Number");
		  ar[i]=obj.nextInt();
	  }
	  System.out.println("Enter Number for search");
	  int sn=obj.nextInt();
	  for(i=0;i<n;i++)
	  {
		  if(ar[i]==sn)
			  m++;
	  }
	  if(m==0)
		  System.out.println("Number not found");
	  else
		  System.out.println(sn+"has been found");
  }
}

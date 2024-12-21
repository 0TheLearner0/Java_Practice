package Example;
import java.util.*;
import java.io.*;
public class Rough {
	public int Sum(int x,int y)
	 {
		int s=0;
		s=x+y;
		return s;
	 }
	 public int Sub(int x,int y)
	 {
		 int substract;
		 substract=x-y;
		 
		 return substract;
	 }
 public static void main(String arg[])
 {
  Scanner obj=new Scanner(System.in);
  int a,b;
  Rough r=new Rough();
  System.out.println("Enter First number: ");
  a=obj.nextInt();
  System.out.println("Enter Second number: ");
  b=obj.nextInt();
  int res=r.Sum(a,b);
  int res1=r.Sub(a,b);
  System.out.println("Sum of "+a+" and "+b+": "+res);
  System.out.println("Sum of "+a+" and "+b+": "+res1);
  
 }
 
 
}

package Class;
import java.util.Scanner;
class ft{
	int x;
	Scanner obj=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter Number");
		x=obj.nextInt();
		
	}
	void factable()
	{
		int f=1,i,j;
		for(i=1;i<=x;i++)
		{
         f=f*i;
		}
		System.out.println("Factorial of "+x+"  ="+" "+f);
		System.out.println("");
		System.out.println("Table of"+" "+f);
		for(j=1;j<=10;j++)
		{
			System.out.println(f*j);
		}
	}
}	

public class Factoftable {
	public static void main(String x[])
	{
		ft ft=new ft();
		ft.input();
		ft.factable();
	}
}

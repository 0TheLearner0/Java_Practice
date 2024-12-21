package Calculation;
import java.util.Scanner;
public class factorization {
	
	public static void main(String x[])
	{
		int x1,i;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Number");
		x1=obj.nextInt();
		System.out.print("Factorization of "+" "+(x1)+" "+" =");
		for(i=1;i<=x1;i++)
		{
			if(x1%i==0)
				System.out.print((i)+",");
			
		}
	}

}

package Calculation;
//Lowest digit
import java.util.Scanner;

public class lowdigit {
	public static void main(String x[])
	{
		int x1,r,lo;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Number");
		x1=obj.nextInt();
		lo=x1;
		while(x1!=0)
		{
			
			r=x1%10;
			if(r<lo)
				lo=r;
			x1=x1/10;
		}
		//System.out.println("Greatest digit ="+" "+(gr));
		System.out.println("Lowest  digit ="+" "+(lo));
	}


}

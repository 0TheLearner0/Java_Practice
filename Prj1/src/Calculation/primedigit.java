package Calculation;
import java.util.Scanner;
//Count Prime Digit
public class primedigit {
	public static void main(String x[])
	{
		int x1,r,m=0;
		Scanner object=new Scanner(System.in);
		System.out.println("Enter Number");
		x1=object.nextInt();
		while(x1!=0)
		{
			r=x1%10;
			x1/=10;
			if(r==1||r==2||r==3||r==5||r==7)
				m++;
		}
		if(m!=0)
			System.out.println("Total Prime Digit ="+" "+(m));
		else
			System.out.println("NO Prime digit found");
	}

}

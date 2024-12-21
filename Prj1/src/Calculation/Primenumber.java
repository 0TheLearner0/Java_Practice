package Calculation;
//Prime number
import java.util.Scanner; //This line for inputting
public class Primenumber {
	public static void main(String x[])
	{
		int x1,i,f=1;
		Scanner obj=new Scanner(System.in); //This line for input
		System.out.println("Enter Number");//This line for input
		x1=obj.nextInt(); //This line for input
		for(i=2;i<x1/2;i++)
		{
			if(x1%i==0)
			{
		   f=0;
			break;
			}
		}
		if(f==0)
			System.out.println((x1)+" "+"is not prime number");
		else
			System.out.println((x1)+" "+"is prime number");
	}

}

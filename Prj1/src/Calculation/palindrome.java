package Calculation;
 import java.util.Scanner;
public class palindrome {
		public static void main(String x[])
		{
			int x1,y,r,s=0;
			Scanner obj=new Scanner(System.in);
			System.out.println("Enter Number");
			x1=obj.nextInt();
			y=x1;
			while(x1!=0)
			{
				r=x1%10;
				s=s*10+r;
				x1=(x1/10);
			}
			if(y==s)
				System.out.println((y)+" "+"is pallindrome number");
			else
				System.out.println("Given number is not pallindrom");
			
		}

	}




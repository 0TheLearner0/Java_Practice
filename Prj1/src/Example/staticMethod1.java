package Example;
import java.util.*;
public class staticMethod1 {

	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		sum();
		palindrome();
		
		
	}
	
	static void sum()
	{
		int s=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a=sc.nextInt();
		System.out.println("Enter the Second number: ");
		int b=sc.nextInt();
		s=a+b;
		
		System.out.print("Sum of "+a+" and "+b+" = "+s+"\n");
		sc.close();
		
	}
	static void palindrome()
	{
		Scanner scan=new Scanner(System.in);
		int s=0,r;
		System.out.println("Check Palindrome number.");
		int num=121;
		int num1=num;
		
		while(num!=0)
		{
			r=num%10;
			s=s*10+r;
			num=(num/10);
		}
		if(num1==s)
			System.out.println(num1+" is palindrome number.");
		else
			System.out.println(num1+" is not palindrome number.");
		scan.close();
	}

}

//Copy OR CLone constructor;
package Constructor;
import java.util.Scanner;
class Z{
	int x,y;
	Scanner obj=new Scanner(System.in);
	Z() //default constructor
	{
		int f=1,i;
		System.out.println("Enter Number");
		x=obj.nextInt();
		for(i=1;i<=x;i++)
			f=f*i;
		System.out.println("Factorial of"+x+"="+f);
	}
	Z(int a,int b) //Parameterize constructor
	{
		x=a;
		y=b;
		System.out.println("Sum="+(x+y));
	}
	Z(Z h) //Clone constructor
	{
		int x;
		x=h.x;
		for(int i=1;i<=10;i++)
			System.out.println(x*i);
	}
	Z(Z h,Z h1)
	{
		x=h.x;
		y=h1.y;
		System.out.println("Div ="+(x/y));
	}
}
public class Copycons {
public static void main(String x[])
{
	int p,q;
	Z h=new Z();
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter first number");
	p=obj.nextInt();
	System.out.println("Enter Second Number");
	q=obj.nextInt();
	Z h1=new Z(p,q);
	Z h2=new Z(h);
	Z h3=new Z(h1,h1);
}
}

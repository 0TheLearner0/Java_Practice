package Class;
import java.util.Scanner;
class A{
	int x,y;
	Scanner obj=new Scanner(System.in);
	void input() 
	{
	  System.out.println("Enter First Number");
	  x=obj.nextInt();
	  System.out.println("Enter Second Number");
	  y=obj.nextInt();
	}
	
	void sum()
	{
		int s=0;
		s=x+y;
		System.out.println("Sum ="+" "+s);
	}
}

public class summ {
	public static void main(String x[])
	{
		A a=new A();
		a.input();
		a.sum();
	}

}

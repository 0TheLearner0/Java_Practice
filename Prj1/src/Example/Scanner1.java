package Example;
import java.util.Scanner;
class A{
	int x,y;
	Scanner obj=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter First Number: ");
		x=obj.nextInt();
		System.out.println("Enter Second Number: ");
		y=obj.nextInt();
	}
	void sum()
	{
		int s=0;
		s=x+y;
		System.out.println("Sum of "+x+" and "+y+": "+s);
	}
	void mul()
	{
		int m=1;
		m=x*y;
		System.out.println("Multiplication of "+x+" and "+y+": "+m);
	}
	void div()
	{
		int d;
		d=x/y;
		System.out.println("Division of "+x+" and "+y+": "+d);
	}
}
public class Scanner1 {
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		a.input();
		a.sum(); 
		a.mul();
		a.div();
	}

}

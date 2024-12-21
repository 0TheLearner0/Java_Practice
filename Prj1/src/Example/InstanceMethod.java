package Example;
import java.util.Scanner;
public class InstanceMethod {
	
	

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub

		InstanceMethod obj=new InstanceMethod();
		System.out.println("The sum is: "+obj.add(12,13));
		System.out.println("The Multiplication is: "+obj.mul(12,5));
	}
	int s;
	public int add(int a,int b)
	{
		s=a+b;
		return s;
	}
	int m=1;
	public int mul(int x,int y)
	{
		
		m=x*y;
	
		return m;
	}

}

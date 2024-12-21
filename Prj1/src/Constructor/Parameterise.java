package Constructor;
import java.util.Scanner;
class H1
{
	int x;
	Scanner obj=new Scanner(System.in);
	H1(int a,int b)
	{
		System.out.println("Sum ="+(a+b));
	}
}
public class Parameterise {
	public static void main(String x[])
	{
		H1 h1=new H1(5,7);
	}

}

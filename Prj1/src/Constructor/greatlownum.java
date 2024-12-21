package Constructor;
import java.util.Scanner;
class GLN
{
	int x;
	Scanner obj=new Scanner(System.in);
	GLN()
	{
		int i,t,gr=0,lo=0;
		System.out.println("Enter Term");
		t=obj.nextInt();
		for(i=0;i<t;i++)
		{
			System.out.println("Enter Number");
			x=obj.nextInt();
			if(i==0)
			{
		gr=x;
		lo=x;
			}
			else
			{
		if(x>gr)
			gr=x;
		if(x<lo)
			lo=x;
			}
		}
		System.out.println("Greatest Number ="+gr);
		System.out.println("Lowest number ="+lo);
	}
}
public class greatlownum {
	public static void main(String x[])
	{
		GLN gln=new GLN();
	}

}

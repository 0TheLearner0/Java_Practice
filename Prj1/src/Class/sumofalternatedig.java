package Class;
import java.util.Scanner;
class AD{
	int x;
	Scanner obj=new Scanner(System.in);
	void input() {
		System.out.println("Enter Number");
		x=obj.nextInt();
	}
	void sumdigit()
	{
		int r,s=0;
		while(x!=0)
		{
			if(s==0)
			{
				r=x%10;
                s=s+r;
                x=x/10;
			}
			else
			{
				x=x/10;
				r=x%10;
				s=s+r;
				x=x/10;
			}
		}
		System.out.println("Sum of alternate digit ="+s);


	}
}	
public class sumofalternatedig {
	public static void main(String x[])
	{
		AD f=new AD();
		f.input();
		f.sumdigit();
	}
}
 


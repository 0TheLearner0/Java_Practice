package Class;
import java.util.Scanner;
class GD{
	int x;
	Scanner obj=new Scanner(System.in);
	void input() {
		System.out.println("Enter Number");
		x=obj.nextInt();
	}
	void grdigit()
	{
		int r,gr=0,f=1,i;
		while(x!=0)
		{
			r=x%10;
			if(r>gr)
				gr=r;
			x=x/10;
		}
		System.out.println("Greatest digit ="+gr);
		System.out.println(" ");
		System.out.println("Factorial of "+gr);
		for(i=1;i<=gr;i++)
			f=f*i;
		System.out.println(f);
	}
}

public class greatestdigit {
	public static void main(String x[])
	{
		GD d =new GD();
		d.input();
		d.grdigit();
		
	}

}

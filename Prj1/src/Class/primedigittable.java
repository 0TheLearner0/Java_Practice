package Class;
import java.util.Scanner;
class PDT{
	int x;
	Scanner obj=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter number");
		x=obj.nextInt();
	}
	void pdtable()
	{
		int r,i,p=0,f=0;
		while(x!=0)
		{
			r=x%10;
			x=x/10;
			if(r==2||r==3||r==5||r==7)
			{
				p=r;
				System.out.println("Prime digit ="+r);
				for(i=1;i<=10;i++)
					System.out.println(i*p);
                p=0;
			}
			else
				f=0;
	           
		}
		if(f==0)
			System.out.println("prime digit not found");

	}
}
public class primedigittable {
	public static void main(String x[])
	{
		PDT fp=new PDT();
		fp.input();
		fp.pdtable();
	}

}

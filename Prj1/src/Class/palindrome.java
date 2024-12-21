package Class;
import java.util.Scanner;
class pal{
	int x,i,n;
	Scanner obj=new Scanner(System.in);
	void palin()
	{
		int r,x1,s=0,m=0;
		System.out.println("Enter term");
		n=obj.nextInt();
		for(i=0;i<n;i++)
		{
		System.out.println("Enter Number");
		x=obj.nextInt();
		
			x1=x;
		while(x!=0)
		{
			r=x%10;
			s=s*10+r;
			x=x/10;
		}
		if(x1==s)
		m++;
		s=0;
		}
		if(m!=0)
			System.out.println("Total palindrome number ="+" "+m);
		else
			System.out.println("palinrome number not found");
	}
}

public class palindrome {
	public static void main(String x[])
	{
		pal p=new pal();
		
		p.palin();
	}
}

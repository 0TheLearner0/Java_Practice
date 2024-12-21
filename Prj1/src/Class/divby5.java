package Class;
import java.util.Scanner;
class D{
	int x,i,n,m=0;
	Scanner obj=new Scanner(System.in);
	void fun()
	{
		System.out.println("Enter Term");
		n=obj.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.println("Enter Number");
			x=obj.nextInt();
			if(x%5==0)
				m++;
		}
		
		if(m!=0)
			System.out.println("Total number divisible by 5 ="+(m));
		else
			System.out.println("There is no number available that are divisible by 5");
	}
}


public class divby5 {
 public static void main(String x[])
 {
	 D d=new D();
	 d.fun();
 }
}

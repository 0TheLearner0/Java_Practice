package Calculation;
//Greatest and Lowest Number  
import java.util.Scanner;
public class grlonum {
	public static void main(String x[])
	{
	int i,gr=0,ln=0,x1,n;
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter Term");
	n=obj.nextInt();
	for(i=0;i<n;i++)
	{
		System.out.println("Enter Number");
		x1=obj.nextInt();
		if(i==0)
		{
			gr=x1;
			ln=x1;
		}
		if(x1>gr)
			gr=x1;
		if(x1<ln)
				ln=x1;
	}
	System.out.println("Greatest number ="+" "+(gr));
	System.out.println("Lowest number ="+" "+(ln));
	}
}

//Greatest and lowest number 
package Class;
import java.util.Scanner;
class grlo{
	 int y,n,i,gr=0,lo=0;
	 Scanner obj=new Scanner(System.in);
void grlow()
{
	 System.out.println("enter Term");
	 n=obj.nextInt();
	 for(i=0;i<n;i++)
	 {
		 System.out.println("Enter num");
		 y=obj.nextInt();
		 if(i==0)
		 {
		 gr=y;
		 lo=y;
		 }
		 else
		 {
	 if(y>gr)
	gr=y;
	 if(y<lo)
		 lo=y;
		 }
		  
	 }

	 System.out.println("Greatest number="+gr);
	 System.out.println("lowest="+lo);
	 	 
	 	}
}

public class rr {
	public static void main(String x[])
	{
		grlo gl=new grlo();
		gl.grlow();
	}
}

package Constructor;
import java.util.Scanner;
class H
{
  int x;
  Scanner obj=new Scanner(System.in);
  H()
  {
	  int f=1;
	  System.out.println("Enter Number");
	  x=obj.nextInt();
	  for(int i=1;i<=x;i++)
		  f=f*i;
	  System.out.println("Factorial of "+x+"="+f);
  }
}
public class Default1 {
	public static void main(String x[])
	{
		H h=new H();
	}

}

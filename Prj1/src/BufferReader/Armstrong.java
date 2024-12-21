package BufferReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Armstrong {
	public static void main(String x[])throws IOException
	{
		String str1;
		int n1,r,s=0,m=0;
		BufferedReader obje=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number");
		str1 = obje . readLine();
		int n=Integer.parseInt(str1);
		n1=n;
		while(n!=0)
		{
			r=n%10;
			s=s+r*r*r;
			n=n/10;
		}
		if(n1==s)
			System.out.println(n1+" is Armstrong number");
		else
			System.out.println(n1+" is not Armstrong number");
	}

}
//Armstrong number:-An integer such that the sum of the cubes of its digits is equal to the number itself.
//Armstrong number = 0,1,153,370,371,407,8208,9474,54748
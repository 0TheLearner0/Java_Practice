package BufferReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//Buffer Reader takes input just like Scanner. It creates memory for data.
//It comes under the 'io' subpackage.
//Note: BufferedReader accepts the data in the form of String.

//InputStreamReader: Input's the data in that memory.

//IOException : It checks the any wrong doing.


public class Example {
	public static void main(String x[])throws IOException
	{
		String str;
		BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number");
		str=obj.readLine();
		int n=Integer.parseInt(str);
		System.out.println("The Factorization of :"+n);
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				System.out.print(i+" ");
		}
	}
}


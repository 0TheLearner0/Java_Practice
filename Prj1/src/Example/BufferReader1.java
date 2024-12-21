package Example;

//Buffer Reader takes input just like Scanner. It creates memory for data.
//It comes under the io subpackage.
//Note: BufferedReader accepts the data in the form of String.

//InputStreamReader: Input's the data in that memory.

//IOException : It checks the any wrong doing

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferReader1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String str;
		BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number");
		str=obj.readLine();
		int n=Integer.parseInt(str);//This line is converting String into integer
		System.out.println("<*>Factorization of "+str+" <*>");
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				System.out.print(i+" ");
		}

	}

}

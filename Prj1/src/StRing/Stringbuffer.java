//                                     String Buffer
//                             i-Append method
package StRing;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Stringbuffer {
	public static void main(String k[])throws IOException
	{
		StringBuffer sb=new StringBuffer("");
		String str;
		int i,n,m=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Term");
		str=br.readLine();
		n=Integer.parseInt(str);
		String str3[]=new String[n];
		for(i=0;i<n;i++)
		{
			System.out.println("Enter Name");
			str=br.readLine();
			sb.append(str+" ");//                Append method
			
		}
		System.out.println("Display Name");
		System.out.println(sb);
	}

}

package StRing;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Scanner;
public class StringExample {
	public static void main(String y[])
	{
		int i,n;
		Scanner j=new Scanner(System.in);
		System.out.println("Enter Term");
		n=j.nextInt();
		
		String str[]=new String[n];
		str[0]=j.nextLine();
		for(i=0;i<n;i++)
		{
			System.out.println("Enter String");
			str[i]=j.nextLine();
		}
		System.out.println("Display String");
		for(i=0;i<n;i++)
		{
			System.out.println(str[i]);
		}
		Arrays.sort(str);
		System.out.println("Display String After Sorting");
		for(i=0;i<n;i++)
		{
			System.out.println(str[i]);
		}
		j.close();
	}

}

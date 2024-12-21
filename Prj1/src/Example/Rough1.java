package Example;
import java.util.*;
public class Rough1 {
	public static void main(String[] ar)
	{
		int n=6;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i+1;j++)
			{
				System.out.print("*");
				
				
			}
			System.out.println("");
		}
		
		int x = 10;
        double y = 20.5;
        System.out.println(x + y);
        
        if(n%2==0)
        {
        	System.out.println("Even");
        }
        else if(n==0)
        {
        	System.out.println("Neutral");
        }
        else
        {
        	System.out.println("Odd");
        }
        
        int[] a1= {10,2,3,500,6,700};
        
        int temp=a1[0];
        for(int it=0;it<a1.length;it++)
        {
        	if(temp<a1[it])
        	{
        		temp=a1[it];
        	}
        	
        	
        }
        System.out.println("Greatest number is "+temp);
	}
}

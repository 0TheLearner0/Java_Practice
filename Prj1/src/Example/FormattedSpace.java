package Example;

import java.util.*;

public class FormattedSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc=new Scanner(System.in);
	     int[] n=new int[3];
	     String[] str=new String[10];
	     int i;
	     for( i=0;i<3;i++)
	     {
	      str[i]=sc.next();
	      n[i]=sc.nextInt();
	      
	      
	     }
	     System.out.println("================================");
	     
	     for( i=0;i<3;i++)
	     {
	    
	    	 if(n[i]<100)
		       {
		       String formattedStr = String.format("%03d", n[i]);
		       System.out.printf("%-15s%s\n",str[i],formattedStr);
		       }
		       if(n[i]>=100){
		    	   System.out.printf("%-15s%d\n",str[i],n[i]);
		       }
	     
	     }
	     System.out.println("================================");
	}

}

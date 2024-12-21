package Example;
/*
 * We are adding 0 before the number which is not greater than or equal to 100
 */
import java.util.*;

public class AddingNumberBeforeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner obj=new Scanner(System.in);
		 int i;
		 int[] a=new int[3];
		 for(i=0;i<3;i++)
		 {
		   a[i]=obj.nextInt();
		 }
		 for(i=0;i<3;i++)
		 {
	       
	       if(a[i]<100)
	       {
	       String formattedStr = String.format("%03d", a[i]);
	       System.out.println(formattedStr);
	       }
	       if(a[i]>=100){
	    	   System.out.println(a[i]);
	       }
		 }	   
	}

}

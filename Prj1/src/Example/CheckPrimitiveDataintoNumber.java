package Example;
/*
 * Input Format

The first line contains an integer,t
, denoting the number of test cases.
Each test case,t, is comprised of a single line with an integer,n, which can be arbitrarily large or small.

Output Format

For each input variable
and appropriate primitive , you must determine if the given primitives are capable of storing it. If yes, then print:
 */

import java.util.Scanner;

public class CheckPrimitiveDataintoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i;
		 Scanner sc = new Scanner(System.in);
	        int t=sc.nextInt();

	        for(i=0;i<t;i++)
	        {
	            
	            try
	            {
	                long x=sc.nextLong();
	                //System.out.print("\n"); 

	                 System.out.println(x+" can be fitted in:");
	                    if( x>=-128 && x<=127)
	                        {
	                        System.out.println("* byte");
	                        }
	                    if(x>=-32768 && x<=32767)
	                        {
	                        System.out.println("* short");
	                        }
	                    if(x>=-2147483648 && x<=2147483647 ){
	                        System.out.println("* int");
	                        }
	                   
	                    if(x>=-9223372036854775808L && x<=9223372036854775807L){
	                        System.out.println("* long");
	                        }
	                    /*if(x>=Float.MIN_VALUE && x<=Float.MAX_VALUE)
	                        {
	                            if(x>=Float.MIN_EXPONENT && x<=Float.MAX_EXPONENT)
	                            {
	                            System.out.println("* float");
	                            }
	                        }
	                    if(x>=Double.MIN_VALUE && x<=Double.MAX_VALUE)
	                    {
	                        if(x>=Double.MIN_EXPONENT && x<=Double.MAX_EXPONENT)
	                        {
	                        System.out.println("* double");
	                        }
	                    }*/
	            }
	            catch(Exception e)
	            {
	                System.out.println(sc.next()+" can't be fitted anywhere.");
	            }

	        }
	}

}

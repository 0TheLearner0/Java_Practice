package Example;

// What is radix? and how it works?
/*A radix parameter specifies the number system to use
2=binary, 6=Hexa, 8=octal, 10=Decimal, 16=Hexadecimal*/

public class RadixExample {
	public static void main(String[] ard)
	{
		int n1=Integer.parseInt("11",2);
		System.out.println("Binary converted to integer: "+n1);
		/*
		 * 11 is 2 based number and should be converted at 2 i.e Binary.
		 * so, integer of (11)2=1*2^1 + 1*2^0 = 2+1 = 3
		 */
		int n2=Integer.parseInt("1100110",2);
		System.out.println("Binary converted to integer:"+n2);
		/*
		 * integer of (1100110)2= 1*2^6 + 1*2^5 + 0 + 0 + 1*2^2 + 1*2^1 + 0 =
		 * 64+32+0+0+4+2=102  
		 */
		
		System.out.println("Binary converted to Hexadecimal:"+Integer.toString(11,16));
		/*
		 * Here we are converting the Binary into Hexadecimal
		 * output: b 
		 */
		
	}

}

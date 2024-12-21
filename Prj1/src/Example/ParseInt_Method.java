package Example;

public class ParseInt_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int decimalExample=Integer.parseInt("20");
		int signedPositiveExample=Integer.parseInt("+20");
		int signedNegativeExample=Integer.parseInt("-20");
		
		System.out.println("Value= "+decimalExample);
		System.out.println("Value= "+signedPositiveExample);
		System.out.println("Value= "+signedNegativeExample);
		

	
	//******************************************************
		System.out.println("**************************");

		int a=Integer.parseInt("150",8);
	    System.out.println("Value= "+a);
	    /*
	     * 
	     */

		int b=Integer.parseInt("+200",16);
		System.out.println("Value= "+b);

		int c=Integer.parseInt("-344",12);
		System.out.println("Value= "+c);
		
		
		
	}
	
	

}

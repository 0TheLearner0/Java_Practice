package Example;
/*
 * Narrowing Type Casting: Converting a higher data type into a lower one.
 * * Also known as: explicit conversion or casting up
 * * Done manually by the programmer.
 * * If we do not perform casting then the compiler reports a compile time error.
 */
public class TypeCasting2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double d=166.6;
		long l=(long)d;
		int i=(int)l;
		System.out.println("Before conversion value of double: "+d);
		System.out.println("After conversion into long: "+l);
		System.out.println("After conversion into integer: "+i);
		
	
	}

}

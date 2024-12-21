package Example;
/*
 * Widening TypeCasting: Converting lower data type into higher data type.
 *  * Also known as implicit conversion or casting down
 *  * It's Done Automatically
 *  * It takes place: When both data types must be compatible with each other
 *                    The target type must be longer than the source type
 *  
 */
public class TypeCasting1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=7;
		long y=x;
		float z=y;
		System.out.println("Before conversion value of integer: "+x);
		System.out.println("After conversion into long: "+y);
		System.out.println("After conversion into float: "+z);
		
	}

}

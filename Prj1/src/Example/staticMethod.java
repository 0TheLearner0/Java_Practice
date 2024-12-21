package Example;
/*
 * A method that has static keyword is known as static  method.
 * 
 * A method that belongs to a class rather than an instance of a class is known as Static method.
 * 
 * Note:1. We can call static method without creating an object.
 * 	   	2. Static method can access static data member and also can change the value of it.
 * 		3. Static method used to create an instance method.
 * 		4. Static method is invoked by using the class name.  
 */

public class staticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		show();
	}
		static void show()
		{
			System.out.println("Hello There!");
		}
	

}


package Example;
/*
 * Rule: If there is no constructor in a class, compiler automatically creates a default constructor.
 * 
 * In this constructor we are not creating any constructor so compiler
 * provides us a default constructor. Here 0 and null values are provided
 * by default constructor.
 * 
 * Purpose of default constructor is to provide the default values to the 
 * object like null,etc.
 */

public class DefaultConstructor {

	int id;
	String name;
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DefaultConstructor s1=new DefaultConstructor();
		DefaultConstructor s2=new DefaultConstructor();
		s1.display();
		s2.display();
	}

}

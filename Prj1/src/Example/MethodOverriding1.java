package Example;
/*
 * Rules for Method Overriding:
 * 1.The name of the method must be same as the name of the parent class method.
 * 2.The number of parameters and types of parameter must be same as in the parent class.
 * 3.There must be exist IS-A relationship.(Inheritance)
 * 
 * Note: It is not possible to override the static method. Hence we cannot override the
 *       main() method.
 *       We call an overridden method through a reference of the parent class.The Type of 
 *       object decides which method is to be executed and it is decided by the JVM at runtime.
 *       
 * 
 */
class Demo11{
	public void display()
	{
		System.out.println("Overridden Method!");
	}
}
public class MethodOverriding1 extends Demo11{
	public void display()
	{
		System.out.println("Overridden Method1!");//This will be printed
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo11 obj=new MethodOverriding1();//Assigning a child class object to parent class reference
		obj.display();
	}

}

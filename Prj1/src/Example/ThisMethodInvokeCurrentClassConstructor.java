package Example;
/*
 * The this() constructor call can be used to invoke the current class constructor. 
 * It is used to reuse the constructor. In other words, 
 * it is used for constructor chaining.

Calling default constructor from parameterized constructor:
 */
class th1{
	th1(){
		System.out.println("Hey Osaid!");
	}
	th1(int x)
	{
		//Calling default constructor by using this() method
		this();
		System.out.println(x);
	}
}
public class ThisMethodInvokeCurrentClassConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		th1 t=new th1(100);

	}

}

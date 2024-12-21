package Example;
/*
 * Calling parameterized constructor from default constructor:
 */
class th2{
	th2(){
		this(575);
		System.out.println("Hello Osaid!");
	}
	th2(int x)
	{
		System.out.println(x);
	}
}
public class ThisMethodCallingParameterizedConstructorFromDefault {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		th2 a=new th2();
	}

}

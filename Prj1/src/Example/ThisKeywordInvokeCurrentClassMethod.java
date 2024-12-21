package Example;
/*
 * You may invoke the method of the current class by using the this keyword. 
 * If you don't use the this keyword, compiler automatically adds 
 * this keyword while invoking the method.
 */
class th {
	void m()
	{
		System.out.println("Hello my beloved PorttyMan Osaid!");
	}
	void n()
	{
		System.out.println("Hello to all my beloved Brother!");
		
		//Here we are invoking the current class method
		this.m();
	}
	
}
public class ThisKeywordInvokeCurrentClassMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		th a=new th();
		a.n();
	}
}

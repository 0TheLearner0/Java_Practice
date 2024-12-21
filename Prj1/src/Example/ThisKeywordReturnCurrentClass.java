package Example;
/*
 * We can return this keyword as an statement from the method. In such case, 
 * return type of the method must be the class type (non-primitive).
 */
class O{
	O getK() {
		//'O' is the return type and 'getK' is the method name
			return this;
	}
	void msg()
	{
		System.out.println("Hello Osaed");
	}
}
public class ThisKeywordReturnCurrentClass {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new O().getK().msg();
	}

}

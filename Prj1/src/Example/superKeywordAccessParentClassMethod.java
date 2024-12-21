package Example;
class Parent2{
	void disp() {
		System.out.println("Display from Parent");
	}
}
	class Child2 extends Parent2{
	void disp() {
		System.out.println("Display from Child");
	}
	void show() {
		super.disp();
		disp();
	}
	
}
public class superKeywordAccessParentClassMethod {

	public static void main(String[] ar)
	{
		Child2 child=new Child2();
		child.show();
	}
}

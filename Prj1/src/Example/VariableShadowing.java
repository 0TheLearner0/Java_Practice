package Example;
class Parent{
	String name="Zeus";//
}
class Child extends Parent{
	String name="Herculese";//Subclass variable hides the parent class variable(Variable Shadowing)
	
	public void printNames() {
		System.out.println("Child's name: "+this.name);//Access Child class variable
		System.out.println("Parent's name: "+super.name);//Accessing Parent class variable
	}
}
public class VariableShadowing {

	public static void main(String[] ar) {
		Child child=new Child();
		child.printNames();
	}
	
}

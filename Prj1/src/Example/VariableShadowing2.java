package Example;
class  Parent1{
	private String name="Zeus";
	
	public String getName() {
		return name;
	}
}
class Child1 extends Parent1{
	String name="Herculese";

	public void printNames() {
		System.out.println("Child's name: "+this.name);
		System.out.println("Parent's name: "+getName());
	}
}
public class VariableShadowing2 {

	public static void main(String[] ar) {
		Child1 child=new Child1();
		child.printNames();
	}
}

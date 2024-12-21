package Example;
/*
 * Abstract method does not contain the method body.
 * Abstract method always declares in the Abstract Class.It means class itself
 * must be Abstract class if it has Abstract Method.
 * 
 * Note: if a non-abstract (concrete) class extends an abstract class, then 
 * the class must implement all the abstract methods of that abstract class.
 * If not, the concrete class has to be declared as abstract  as well.
 * 
 * Note: If a class contains abstract method it needs to be abstract and vice 
 * versa is not true.
 */

abstract class Demo{
	
	abstract void display();

}


public class AbstractMethod extends Demo{
	void display()
	{
		System.out.println("Hey Alexa.");
	}

	public static void main(String[] ar)
	{
		Demo obj=new AbstractMethod();
		obj.display();
	}
	

}

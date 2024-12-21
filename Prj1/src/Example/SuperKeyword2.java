package Example;
/*
 * Super keyword is used to invoke overridden method
 */

class Animal1{
	void eat()
	{
		System.out.println("Eating...");
	}
}
class Dog1 extends Animal1{
	void eat()
	{
		System.out.println("Eating Bread...");
	}
	void bark()
	{
		System.out.println("Barking...");
	}
	void work()
	{
		super.eat();//To call the parent class method we use super keyword
		bark();
	}
}
public class SuperKeyword2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog1 d=new Dog1();
		d.work();
	}

}

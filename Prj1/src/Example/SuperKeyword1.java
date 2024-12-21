package Example;
/*
 * We can use super keyword to access the data member or field of parent class.
 * It is used when if parent class and child class have same fields.
 */
class Animal{
	String color="White";
}
 class Dog extends Animal{
	String color="BLACK";
	void print()
	{
		System.out.println(color);
		System.out.println(super.color);}
}

public class SuperKeyword1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d=new Dog();
		d.print();
	}

}

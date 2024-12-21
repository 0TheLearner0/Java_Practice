package Example;
/*
 * If the reference variable of parent class refers to the object of the
 * Sub class, it is known as Upcasting.
 */
 class Bike{
	void run()
	{
		System.out.println("Running.");
	}
}

public class Upcasting extends Bike {
	void run()
	{
		System.out.println("Running Safely with 60KM");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bike obj=new Upcasting();//
		obj.run();
	}

}

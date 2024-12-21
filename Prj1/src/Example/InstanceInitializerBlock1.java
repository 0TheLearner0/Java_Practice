package Example;
/*
 * Used to initialize the instance member. It run each time when object of
 * the class is created.
 * 
 */
public class InstanceInitializerBlock1 {

	int speed;
	InstanceInitializerBlock1 ()
	{
		System.out.println("Speed  is "+speed);
	}
	{speed=150;}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InstanceInitializerBlock1 b=new InstanceInitializerBlock1 ();
		InstanceInitializerBlock1 b1=new InstanceInitializerBlock1 ();
	}

}

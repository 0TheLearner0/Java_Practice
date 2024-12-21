package Example;
/*
 * What is invoked first, instance initializer block or constructor?
 */
public class InstanceInitializerBlock2 {
	int speed;
	InstanceInitializerBlock2 (){
		System.out.println("Constructor is invoked");
	}
	{System.out.println("Instance Initializer Block invoked");}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceInitializerBlock2 obj=new InstanceInitializerBlock2();
		InstanceInitializerBlock2 obj1=new InstanceInitializerBlock2();
		/*
		 * It seems that instance initializer block is firstly invoked but NO.
		 * Instance Initializer Block is invoked at the time of object creation.
		 * The java compiler copies the instance initializer block in the constructor
		 * after the first statement super(). So firstly constructor is invoked.
		 * 
		 * class B{ B(){ ("Constructor");} {("Instance Initializer Block");}}
		 * 
		 * 							|
		 * 						   \v/
		 * 							V
		 * 						COMPILER
		 *  						|
		 * 						   \v/
		 * 							V
		 *class B{ B(){ super(); {("Instance Initializer Block");}
		 *("Constructor");}} 						
		 */
	}

}

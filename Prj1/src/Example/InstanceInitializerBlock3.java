package Example;
class A2S{
	A2S(){
		System.out.println("Parent Class Constructor Invoked");
	}
}

public class InstanceInitializerBlock3 extends A2S {
	InstanceInitializerBlock3(){
		super();
		System.out.println("Child class Constructor Invoked");
	}
	{System.out.println("Instance Initializer Block Invoked");}//Instance Initializer Block
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InstanceInitializerBlock3 obj=new InstanceInitializerBlock3();
	}

}

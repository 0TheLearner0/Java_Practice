package Example;
/*
 * Super() is used to invoke parent class constructor.
 * 
 * Note: super() method is added in each class constructor automatically by compiler
 * if there is no super() or this().
 */
 class Animals{
	Animals(){
		System.out.println("Animals is created.");
	}
}
 class Tiger extends Animals{
	 Tiger()
	 {
		 super();// calling super() for invoking parent class constructor
		 System.out.println("Tiger is created.");
	 }
 }
public class SuperKeyword3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Tiger obj=new Tiger();

	}

}

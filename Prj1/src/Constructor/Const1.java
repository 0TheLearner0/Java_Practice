package Constructor;

public class Const1 {

	private String name;
	private int age;
	Const1(String name,int age){
		
		this.name=name;
		this.age=age;
	}
	Const1(int a,int b)
	{
		
	}
	
	void disp() {
		System.out.println("My name is "+name+" I'm "+age+" years old.");
	}
	public static void main(String[] arg)
	{
		Const1 ob=new Const1("Zishan", 20);
		ob.disp();
	}
}

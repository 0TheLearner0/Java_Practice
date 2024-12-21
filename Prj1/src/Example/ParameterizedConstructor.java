package Example;

public class ParameterizedConstructor {
	int id;
	String name;
	ParameterizedConstructor(int i,String n)
	{
		id=i;
		name=n;
	}
	void display()
	{
		
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ParameterizedConstructor s1=new ParameterizedConstructor(11,"Zishan");
		ParameterizedConstructor s2=new ParameterizedConstructor(12,"Neshat");
		System.out.println("ID  Name");
		s1.display();
		s2.display();
	}

}

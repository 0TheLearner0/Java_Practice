package Example;
/*
 * We can copy the values of one object into another by 
 * assigning the objects values to another object. 
 * In this case, there is no need to create the constructor.
 */

public class CopyConstructorViaObjectValue {
	int id;
	String name;
	CopyConstructorViaObjectValue(int i,String n)
	{
		id=i;
		name=n;
	}
	CopyConstructorViaObjectValue()
	{
		
	}
	void display()
	{
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("ID  NAME\n");
		CopyConstructorViaObjectValue s1=new CopyConstructorViaObjectValue(100,"Zedan Khan");
		CopyConstructorViaObjectValue s2=new CopyConstructorViaObjectValue();
		s2.id=s1.id;
		s2.name=s1.name;
		s1.display();
		s2.display();
	}

}

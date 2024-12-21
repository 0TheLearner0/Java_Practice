package Example;
/*
 * There is no copy constructor in Java. However, we can copy the values from 
 * one object to another like copy constructor in C++.
 * 
 * In this example, we are going to copy the values of one object into 
 * another using Java constructor.
 */
public class CopyConstructorViaObject {
	int id;
	String name;
	CopyConstructorViaObject(int i,String n)
	{
		id=i;
		name=n;
	}
	CopyConstructorViaObject(CopyConstructorViaObject s)
	{
		name=s.name;
		id=s.id;
	}
	void display()
	{
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CopyConstructorViaObject s1=new CopyConstructorViaObject(11,"Zedan Khan");
		CopyConstructorViaObject s2=new CopyConstructorViaObject(s1);
		s1.display();
		s2.display();
	}

}

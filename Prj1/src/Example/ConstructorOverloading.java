package Example;
/*
 * Constructor overloading in Java is a technique of having more than one constructor with different parameter lists. 
 * They are arranged in a way that each constructor performs a different task. 
 * They are differentiated by the compiler by the number of parameters in the list and their types. 
 */
public class ConstructorOverloading {
	int id;
	int number;
	String name;
	int age;
	ConstructorOverloading(int i)
	{
		System.out.println("Number is "+i);
		int r,s=0;
		while(i!=0)
		{
			r=i%10;
			s=s+r;
			i=i/10;
		}
		
		number=s;
	}
	ConstructorOverloading(int i,String n,int a)
	{
		id=i;
		name=n;
		age=a;
	}
	void display()
	{
		
		
		System.out.println(id+" "+name+" "+age);
	}

	void disp()
	{
		System.out.println("Sum of digit is "+number);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorOverloading s1=new ConstructorOverloading(555);
		
		ConstructorOverloading s2=new ConstructorOverloading(1,"Zishan",20);
		ConstructorOverloading s3=new ConstructorOverloading(2,"Neshat",18);
		s1.disp();
		System.out.println("ID  NAME  AGE");
		s2.display();
		s3.display();
		
	}

}

package Example;
class Student1{
	int roll;
	String name;
	static int fee=200;
	Student1(int roll,String name)
	{
		this.roll=roll;
		this.name=name;
		
	}
	void display()
	{
		System.out.println(roll+" "+name+" "+fee);
	}

	
}
public class ThisKeywordCurrentClassInstanceVariable {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student1 s1=new Student1(100,"Zedan");
		Student1 s2=new Student1(101,"Kamran");
		Student1 s3=new Student1(102,"Hammad");
		s1.display();
		s2.display();
		s3.display();
	}

}

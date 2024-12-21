package Example;
class th3{
	int roll;
	String name,course;
	float fee;
	th3(int roll,String name,String course)
	{
		this.roll=roll;
		this.name=name;
		this.course=course;
	}
	th3(int roll,String name,String course,float fee)
	{
		/*
		 * Call to this() must be the first statement in constructor.Otherwise Run Time Error will occur.
		 */
		this(roll,name,course);
		this.fee=fee;
	}
	void display()
	{
		System.out.println(roll+"  "+name+"  "+course+"  "+fee);
	}
}
public class ThisMethodUsedForChainig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("ROLL  NAME  COURSE  FEES");
		System.out.print("\n");
		th3 s1=new th3(100,"Osaid","Java");
		th3 s2=new th3(101,"Areeb","Python",6000.0f);
		th3 s3=new th3(102,"Areesh","Pytorch",15000.0f);
		s1.display();
		s2.display();
		s3.display();
	}

}

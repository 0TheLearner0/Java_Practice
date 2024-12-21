package Inheritancee;
class Student{
	int roll;
	String name;
	static String college="GAYA COLLEGE";              //Static Variable
	Student(int r,String n)
	{
		roll=r;
		name=n;
	}
	void display()
	{
		System.out.println(roll+"  "+name+"."+"  "+college);
	}
}
public class StaticValue {
 public static void main(String x[])
 {
	 Student s1=new Student(1,"Zishan");
	 Student s2=new Student(2,"Adil");
	 Student s3=new Student(3,"Vishal");
	 Student s4=new Student(4,"Sailesh");
	 System.out.println(""); 
	 System.out.println("Rollno"+"  "+"Name"+"   "+"College");
	 System.out.println("");
	 s1.display();
	 s2.display();
	 s3.display();
	 s4.display();
	 
 }
}

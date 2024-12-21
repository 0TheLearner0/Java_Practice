package Example;

class Student{
	int roll;
	String Name;
	static String college="M-G College";
	Student(int r,String n)
	{
		roll=r;
		Name=n;
	}
	void display()
	{
		System.out.println(roll+"      "+Name+"        "+college);
	}
};

public class Static_Values {
       public static void main(String Args[])
       {
    	   Student s1=new Student(1,"MaxVerstappen");
    	   Student s2=new Student(2,"LewisHamilton");
    	   Student s3=new Student(3,"FernandoAlonso");
    	   Student s4=new Student(4,"ValtteriBottas");
    	   Student s5=new Student(5,"LandoNorris");
    	   Student s6=new Student(6,"CarloSainz");
           System.out.println("roll"+"   "+"Name"+"             "+"College");
    	   
           s1.display();
           s2.display();
           s3.display();
           s4.display();
           s5.display();
           s6.display();
       }
	
}

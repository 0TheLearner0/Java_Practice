package Inheritancee;
class Studd
{
	int roll;
	String name;
	static String college="GAYA COLLEGE";
	
	static void change()//                            This method used for changing the value of static value.
	{
		college="Mirza Ghalib College";
	}
	Studd(int r,String n)//                          Constructor used for initialize the value
	{
		roll=r;
		name=n;
	}
	void disp()
	{
		System.out.println(roll+"  "+name+"  "+college);
	}
}
public class StaticMethod {
	public static void main(String z[])
	{
		Studd.change();
		Studd p1=new Studd(1,"Adam");
		Studd p2=new Studd(2,"Moosa");
		Studd p3=new Studd(3,"Daud");
		Studd p4=new Studd(4,"Isa");
		Studd p5=new Studd(5,"Nooh");
		
		p1.disp();
		p2.disp();
		p3.disp();
		p4.disp();
		p5.disp();
	}

}

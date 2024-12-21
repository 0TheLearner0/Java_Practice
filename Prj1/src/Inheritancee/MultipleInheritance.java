//                          Multiple Inheritance
package Inheritancee;
interface G3
{
	void sum2();
	void Multy();
}
interface G4
{
	void divi();
}
class spr
{
	void sqr()
	{
		int x=5;
		System.out.println("Square of "+x+"="+(x*x));
	}
}
class ub1 extends spr implements G3,G4
{
	public void sum2()
	{
		int x=5,y=7;
		System.out.println("Sum="+(x+y));
	}
	public void Multy()
	{
		int x=5,y=6;
		System.out.println("Multiplication ="+(x*y));
	}
	public void divi()
	{
		int x=10,y=5;
		System.out.println("Division ="+(x/y));
	}
}

public class MultipleInheritance {
  public static void main(String d[])
  {
	  ub1 ob=new ub1();
	  ob.sum2();
	  ob.Multy();
	  ob.divi();
	  ob.sqr();
  }
}

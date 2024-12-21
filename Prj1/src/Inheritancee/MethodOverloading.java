//Method Overloading
package Inheritancee;
class p1{
	void calcu(int x,int y)
	{
		System.out.println("Substract="+(x-y));
	}
	void calcu(float x,int y)
	{
		System.out.println("Sum="+(x+y));
	}
}
public class MethodOverloading {
	public static void main(String c[])
	{
		p1 p=new p1();
		p.calcu(12,2);
		p.calcu(2.5f,5);
	}

}

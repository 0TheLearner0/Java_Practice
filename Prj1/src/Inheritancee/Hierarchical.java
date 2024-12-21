                                                 //Hierarchical Inheritance
package Inheritancee;
class AAA
{
	int x,y;
	void input()
	{
		x=10;
		y=5;
	}
}
class BSF extends AAA
{
	void sum()
	{
		System.out.println("Sum="+(x+y));
	}
}
class KGF extends AAA
{
	void sub()
	{
		System.out.println("Substract="+(x-y));
	}
}
class KGF2 extends AAA
{
	void Mul()
	{
		System.out.println("Multiplication="+(x*y));
	}
}
public class Hierarchical {
	public static void main(String x[])
	{
		BSF b=new BSF();
		b.input();
		b.sum();
		KGF k=new KGF();
		k.input();
		k.sub();
		KGF2 l=new KGF2();
		l.input();
		l.Mul();
	}

}

package Inheritancee;
class fg1
{
	void call()
	{
		int x=5,y=6;
		System.out.println("Sum ="+(x+y));
	}
}
class fg2 extends fg1
{
	void call()
	{
		int x=5,y=10;
		super.call(); // Here we are using Super Keyword and because of super keyword we are preventing method overriding
		System.out.println("Multi ="+(x*y));
	}
}
public class Superkeyword {
	public static void main(String x[])
	{
		fg2 oj=new fg2();
		oj.call();
	}

}

package Inheritancee;
 class Super{
	 int x,y;
	 void input()
	 {
		 x=10;
		 y=5;
	 }
 }
 class Sub extends Super{
	 void sum()
	 {
		 System.out.println("Sum="+(x+y));
	 }
 }
public class SingleLevel {
	public static void main(String x[])
	{
		Sub ob=new Sub();
		ob.input();
		ob.sum();
	}

}

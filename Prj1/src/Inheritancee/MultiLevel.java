package Inheritancee;
class Super1{
	 int x,y;
	 void input()
	 {
		 x=10;
		 y=5;
	 }
}
class Subb extends Super1{ //Super1 class inherited by Subb
	 void sum()
	 {
		 System.out.println("Sum="+(x+y));
	 }
}
class Sub1 extends Subb{ //Subb class inherited by Sub1
	void mul()
	{
		System.out.println("Multiply="+(x*y));
	}
}
public class MultiLevel {
	public static void main(String x[])
	{
		Sub1 objct=new Sub1();
		objct.input();
		objct.sum();
		objct.mul();
	}

}

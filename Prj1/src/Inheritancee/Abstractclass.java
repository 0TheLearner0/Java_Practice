//                                  Abstract Class
package Inheritancee;
abstract class abs
{
	abstract void cal();
}
class ft1 extends abs
{
	void cal()
	{
		int x=9,y=8;
		System.out.println("Sum="+(x+y));
	}
}
class ft2 extends abs
{
	void cal()
	{
		int x=5,y=6;
		System.out.println("Multiplication ="+(x*y));
	}
}
public class Abstractclass {
  public static void main(String d[])
  {
	  abs o=new ft1();//  Here we are making the object of Abstract class .   Sub class is calling through address
	  o.cal();
	  abs o1=new ft2();
	  o1.cal();
  }
}

//                                    Interface
package Inheritancee;
interface ar09
{
	void sum();
	void sub();
}
class G2 implements ar09
{
	public void sum()
	{
		int x=10,y=5;
		System.out.println("Sum="+(x+y));
	}
	public void sub()
	{
		int x=10,y=5;
		System.out.println("Substract="+(x-y));
	}
}
public class Interface {
  public static void main(String s[])
  {
	  G2 obj=new G2();
	  obj.sum();
	  obj.sub();
	  
  }
}

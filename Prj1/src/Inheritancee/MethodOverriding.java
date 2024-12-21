//Method Overriding
package Inheritancee;
class pp
{
	void A()
	{
		System.out.println("Hello");
	}
}
class QQ extends pp
{
	void A()
	{
		System.out.println("Java");
	}
}
public class MethodOverriding {
 public static void main(String h[])
 {
	 pp obj=new pp();
	 obj.A();
	 pp obj1= new QQ();
	 obj1.A();
 }
}

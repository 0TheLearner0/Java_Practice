//                        Compile Time Polymorphism

package Inheritancee;
class Comp
{
 void calcu(int x,int y)
 {
	 System.out.println("Sum ="+(x+y));
 }
 void calcu(int x,int y,int z)
 {
	 System.out.println("Multi ="+(x*y*z));
 }
 void calcu(float x,int y)
 {
	 System.out.println("Substract ="+(x-y));
 }
}
public class PolymorphismExe {
	public static void main(String c[])
	{
		Comp obj=new Comp();
		obj.calcu(5, 10);
		obj.calcu(5,6,4);
		obj.calcu(5.5f,2);
	}

}

//                    Multi-Threading-Priority
package Thread1;
class A extends Thread
{
	public void run()
	{
		int i;
		for(i=1;i<=5;i++)
			System.out.println("i ="+i);
	}
}
class B extends Thread
{
	public void run()
	{
		int j;
		for(j=1;j<=5;j++)
			System.out.println("j ="+j);
	}
}class C extends Thread
{
	public void run()
	{
		int k;
		for(k=1;k<=5;k++)
			System.out.println("k ="+k);
	}
}
public class Multipriority {
 public static void main(String x[])
 {
	 A a1=new A();
	 B b1=new B();
	 C c1=new C();
	 
	 a1.setPriority(1);
	 b1.setPriority(1);
	 c1.setPriority(5);
	 
	 a1.start();
	 b1.start();
	 c1.start();
 }
 
}

/*    Thread Priority                           Priority value
         Min priority                                   1
         Normal Priority                                5
         Max Priority                                   10

*/
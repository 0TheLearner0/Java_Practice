package Thread1;
//Thread is already a System define class
public class Example3 extends Thread{
 public void run()
 {
	 for(int i=1;i<=100;i++)
	 {
		 try
		 {
			 Thread.sleep(50);//here 50's value is in mili-second
		 }
		 catch(InterruptedException e)
		 {
			 System.out.println(e);
		 }
		 System.out.println(i);
	 }
 }
 public static void main(String h[])
 {
	 Example3 t1=new Example3();
	 Example3 t2=new Example3();
	 t1.start();//During the calling of thread we use Start(); method 
	 t2.start();
 }
}
//start method ,sleep method.
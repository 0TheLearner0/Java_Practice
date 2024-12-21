 package Thread1;
//Example of Thread 
class Example2 extends Thread
{  
public void run()
{  
int f=1;
for(int i=1;i<=5;i++)
{  
f=f*i;
}  
System.out.println("factorial of "+5+"="+f);
}
public static void main(String args[])
{  
Example2 t1=new Example2();  
  
 t1.start();  
  
}  
}  
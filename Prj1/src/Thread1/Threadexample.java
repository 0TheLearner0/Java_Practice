package Thread1;

public class Threadexample extends Thread
{  
 public void run(){  
   System.out.println("running successfully...");  
 }  
 public static void main(String args[]){  
  Threadexample t1=new Threadexample();  
  t1.start();  
 // t1.start();  
 }  
}  
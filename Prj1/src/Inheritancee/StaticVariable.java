 package Inheritancee;
class static1{
	static int count=0;//will get memory only once and retain its value
	static1()
	{
		count++;
		System.out.println(count);
	}
}
public class StaticVariable{
public static void main(String x[])
{
 static1 a=new static1();
 static1 b=new static1();
 static1 c=new static1();
 static1 d=new static1();
}
}

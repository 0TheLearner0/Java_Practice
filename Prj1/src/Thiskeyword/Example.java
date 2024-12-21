package Thiskeyword;

class P{
	String str,cl;
	int r;
	void input(String str,String cl,int r)
	{
		this.str=str;;
		this.cl=cl;
		this.r=r;
	}
	void display()
	{
		System.out.println("Name="+" "+str+" "+"Class="+" "+cl+" "+"Roll="+" "+r);
	}
}


public class Example {
	public static void main(String x[])
	{
		P p=new P();
		p.input("Zishan","BCA-I", 12);
		p.display();
	}

}

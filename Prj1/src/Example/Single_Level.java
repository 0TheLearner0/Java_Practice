package Example;
class supr{
	int x,y;
	void input()
	{
		x=10;
		y=10;
	}
};
class sub extends supr {
	void sum()
	{
		System.out.println("Sum = "+(x+y));
	}
};
public class Single_Level {
  public static void main(String arg[])
  {
	  sub obj=new sub();
	  obj.input();
	  obj.sum();
  }
}

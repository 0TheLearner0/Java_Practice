package Example;
class person{
	int id;
	String name;
	person(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
}
class emp extends person{
	float sal;
	emp(int id,String name,float sal)
	{
		super(id,name);//Reusing parent constructor
		this.sal=sal;
	}
	void disp()
	{
		System.out.println(id+" "+name+" "+sal);
	}
}
public class SuperKeyword4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		emp obj=new emp(1,"Zishan",13400f);
		obj.disp();
	}

}

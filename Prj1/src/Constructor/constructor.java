package Constructor;

public class constructor {
	
	String model;
	int year;
	
	constructor(String m, int y)
	{
		model=m;
		year=y;
	}
	void disp() {
		System.out.println("Model: "+model);
		System.out.println("Year: "+year);
	}
	
	public static void main(String[] arg)
	{
		constructor cons=new constructor("i20",2023);
		cons.disp();
		constructor cons1=new constructor("i10",2024);
		cons1.disp();
		constructor cons2=new constructor("Grand i10",2022);
		cons2.disp();
		
		
	}

}

package Example;

public class thisReturnCurrentObject {
	
	String model;
	int year;
	thisReturnCurrentObject setModel(String model)
	{
		this.model=model;
		return this;
	}
	thisReturnCurrentObject setYear(int year) {
		this.year=year;
		return this;
	}




public static void main(String[] a)
{
thisReturnCurrentObject car=new thisReturnCurrentObject();
car.setModel("Toyota").setYear(2024);//Method Chaining
}
}
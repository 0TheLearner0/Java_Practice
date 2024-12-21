package Class;

public class ClassDefinition {
	String color;
	String model;
	int year;
	
	void display(){
		System.out.println("Car Model: "+model);
		System.out.println("Car color: "+color);
		System.out.println("Manufacturing Year: "+year);
	}
	
	public static void main(String[] arg)
	 {
		 ClassDefinition mycar=new ClassDefinition();
		 mycar.model="i20";
		 mycar.color="Red";
		 mycar.year=2024;
		 mycar.display();
		 
	 }

}
 
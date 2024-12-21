package Example;

public class ConstructorChaining {

	String model;
	int year;
	ConstructorChaining(){
		this("Unknown",0);
	}
	
	ConstructorChaining(String model,int year){
		this.model=model;
		this.year=year;
	}
}

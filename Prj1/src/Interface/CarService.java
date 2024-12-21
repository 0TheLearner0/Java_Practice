package Interface;

public class CarService {
	
	 public void drive() {
		 
//Array of car class
		 Car[] cars= {new BMW(), new Mercedes(), new Porsche()};
		 for(Car car:cars) {car.drive();}
		 
	 }

}

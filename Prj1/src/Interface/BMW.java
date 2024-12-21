package Interface;

public class BMW implements Car, Asset, Loggable {
	
		public void drive() {
			System.out.println("BMW is Driving!");		}
		public int value()
		{
			return 180000;
		}
		public String message()
		{
			return "I'm the car of ZI";
		}
}

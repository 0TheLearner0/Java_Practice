package ScannerClassProperty;
import java.util.*;

public class next1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.out.print("Enter full name: ");        
	        //Create scanner object and read the value from the console  
	        Scanner scan = new Scanner(System.in);  
	        //Read the first token  
	        String firstName = scan.next();  
	        //Read the second token  
	        String lastName = scan.next();  
	        //Print the token values read by Scanner object  
	        System.out.println("First Name is: "+firstName);  
	        System.out.println("Last Name is: "+lastName);    
	        scan.close();  
	  
	}

}

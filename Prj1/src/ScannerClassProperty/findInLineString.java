package ScannerClassProperty;

import java.util.Scanner;

public class findInLineString {

	public static void main(String args[]){   
	       String str = "Hello World!";  
	          //Create a new scanner Object  
	          Scanner scanner = new Scanner(str);  
	          //Find a string "World"  
	          System.out.println("Output: " + scanner.findInLine("World"));  
	          //Print the rest of the string  
	          System.out.println("Left String: " + scanner.nextLine());  
	          scanner.close();  
	   }    
}
